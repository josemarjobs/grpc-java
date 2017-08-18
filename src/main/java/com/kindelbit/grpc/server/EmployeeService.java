package com.kindelbit.grpc.server;

import com.google.protobuf.ByteString;
import com.kindelbit.grpc.*;
import io.grpc.stub.StreamObserver;

/**
 * Created by josemarmagalhaes on 8/17/17.
 */
public class EmployeeService extends EmployeeServiceGrpc.EmployeeServiceImplBase {

   @Override
   public void getByBadgeNumber(GetByBadgeNumberRequest request,
                                StreamObserver<EmployeeResponse> responseObserver) {

      for (Employee e : Employees.getInstance()) {
         if (e.getBadgeNumber() == request.getBadgeNumber()) {
            responseObserver.onNext(EmployeeResponse.newBuilder().setEmployee(e).build());
            responseObserver.onCompleted();
            return;
         }
      }
      responseObserver.onError(
         new Exception("Emplyee with badgeNumber " + request.getBadgeNumber() + " NOT FOUND."));
   }

   @Override
   public void getAll(GetAllRequest request,
                      StreamObserver<EmployeeResponse> responseObserver) {

      for (Employee e : Employees.getInstance()) {
         responseObserver.onNext(EmployeeResponse.newBuilder().setEmployee(e).build());
      }
      responseObserver.onCompleted();
   }

   @Override
   public StreamObserver<AddPhotoRequest> addPhoto(final StreamObserver<AddPhotoResponse> responseObserver) {

      return new StreamObserver<AddPhotoRequest>() {
         private ByteString result;

         public void onNext(AddPhotoRequest value) {
            if (result == null) {
               result = value.getData();
            } else {
               result = result.concat(value.getData());
            }
            System.out.println("Received message with: " + value.getData().size() + " bytes");
         }

         public void onError(Throwable t) {
            System.out.println(t);
         }

         public void onCompleted() {
            System.out.println("Total bytes received: " + result.size());
            responseObserver.onNext(
               AddPhotoResponse.newBuilder().setIsOk(true).build());
            responseObserver.onCompleted();
         }
      };
   }

   @Override
   public StreamObserver<EmployeeRequest> saveAll(
      final StreamObserver<EmployeeResponse> responseObserver) {

      return new StreamObserver<EmployeeRequest>() {
         public void onNext(EmployeeRequest value) {
            Employees.getInstance().add(value.getEmployee());
            responseObserver.onNext(
               EmployeeResponse.newBuilder()
                  .setEmployee(value.getEmployee())
                  .build()
            );
         }

         public void onError(Throwable t) {
            System.out.println("Error " + t.getMessage());
         }

         public void onCompleted() {
            for (Employee e : Employees.getInstance()) {
               System.out.println(e);
            }
            responseObserver.onCompleted();
         }
      };
   }
}
