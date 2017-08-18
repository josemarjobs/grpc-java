package com.kindelbit.grpc.client;

import com.google.protobuf.ByteString;
import com.kindelbit.grpc.*;
import io.grpc.ManagedChannel;
import io.grpc.Metadata;
import io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.NettyChannelBuilder;
import io.grpc.stub.MetadataUtils;
import io.grpc.stub.StreamObserver;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/**
 * Created by josemarmagalhaes on 8/17/17.
 */
public class EmployeeServiceClient {
   public static void main(String[] args) throws Exception {
      ManagedChannel channel = NettyChannelBuilder.forAddress("localhost", 9000)
         .sslContext(GrpcSslContexts
            .forClient()
            .trustManager(new File("cert.pem"))
            .build())
         .build();


      EmployeeServiceGrpc.EmployeeServiceBlockingStub blockingClient = EmployeeServiceGrpc.newBlockingStub(channel);
      EmployeeServiceGrpc.EmployeeServiceStub nonBlockingChannel = EmployeeServiceGrpc.newStub(channel);

//      sendMetadata(blockingClient);
//      getByBagdeNumber(blockingClient);
//      getAll(blockingClient);
//      addPhoto(nonBlockingChannel);
      saveAll(nonBlockingChannel);

      Thread.sleep(2000);
      channel.shutdown();
      channel.awaitTermination(1, TimeUnit.SECONDS);
   }

   private static void saveAll(EmployeeServiceGrpc.EmployeeServiceStub client) {
      ArrayList<Employee> employees = new ArrayList<Employee>();
      employees.add(Employee.newBuilder()
         .setBadgeNumber(123)
         .setFirstName("Peter")
         .setLastName("Griffin")
         .setVacationAccrualRate(1.2f)
         .build());
      employees.add(Employee.newBuilder()
         .setBadgeNumber(124)
         .setFirstName("Glen")
         .setLastName("Quagmire")
         .setVacationAccrualRate(1.4f)
         .setVacationAccrued(10)
         .build());

      StreamObserver<EmployeeRequest> requestStream = client.saveAll(new StreamObserver<EmployeeResponse>() {
         public void onNext(EmployeeResponse value) {
            System.out.println("Employee: " + value.getEmployee());
         }

         public void onError(Throwable t) {
            System.out.println("Error: " + t.getMessage());
         }

         public void onCompleted() {
            System.out.println("Server Completed.");
         }
      });

      for (Employee e : employees) {
         requestStream.onNext(EmployeeRequest.newBuilder().setEmployee(e).build());
      }
      requestStream.onCompleted();
   }

   private static void addPhoto(EmployeeServiceGrpc.EmployeeServiceStub client) {
      try {

         StreamObserver<AddPhotoRequest> requestStream = client.addPhoto(new StreamObserver<AddPhotoResponse>() {
            public void onNext(AddPhotoResponse value) {
               System.out.println("Server response: " + value.getIsOk());
            }

            public void onError(Throwable t) {
               System.out.println("Error: " + t.getMessage());
            }

            public void onCompleted() {
               System.out.println("Server Completed.");
            }
         });

         FileInputStream fs = new FileInputStream("img.jpg");
         while (true) {
            byte[] data = new byte[64 * 1024];
            int bytesRead = fs.read(data);

            if (bytesRead == -1) {
               break;
            }

            if (bytesRead < data.length) {
               byte[] newData = new byte[bytesRead];
               System.arraycopy(data, 0, newData, 0, bytesRead);
               data = newData;
            }

            requestStream.onNext(AddPhotoRequest
               .newBuilder()
               .setData(ByteString.copyFrom(data))
               .build());
         }
         requestStream.onCompleted();
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   private static void getAll(EmployeeServiceGrpc.EmployeeServiceBlockingStub blockingClient) {
      Iterator<EmployeeResponse> iterator = blockingClient.getAll(GetAllRequest.newBuilder().build());
      while (iterator.hasNext()) {
         System.out.println(iterator.next().getEmployee());
      }
   }

   private static void getByBagdeNumber(EmployeeServiceGrpc.EmployeeServiceBlockingStub blockingClient) {
      GetByBadgeNumberRequest request = GetByBadgeNumberRequest
         .newBuilder()
         .setBadgeNumber(2080)
         .build();
      EmployeeResponse response =
         blockingClient.getByBadgeNumber(request);
      System.out.println(response.getEmployee());
   }

   private static void sendMetadata(EmployeeServiceGrpc.EmployeeServiceBlockingStub client) {
      Metadata md = new Metadata();
      md.put(Metadata.Key.of("name", Metadata.ASCII_STRING_MARSHALLER),
         "Josemar Jobs");
      md.put(Metadata.Key.of("password", Metadata.ASCII_STRING_MARSHALLER),
         "123abc");

      client.withInterceptors(MetadataUtils.newAttachHeadersInterceptor(md)).
         getByBadgeNumber(GetByBadgeNumberRequest.newBuilder().build());
   }

}
