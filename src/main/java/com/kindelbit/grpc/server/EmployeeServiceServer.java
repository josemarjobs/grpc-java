package com.kindelbit.grpc.server;

import io.grpc.*;
import io.grpc.Server;

import java.io.File;

/**
 * Created by josemarmagalhaes on 8/17/17.
 */
public class EmployeeServiceServer {
   public static void main(String[] args) {
      try {
         EmployeeServiceServer employeeServiceServer = new EmployeeServiceServer();
         employeeServiceServer.start();
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   private Server server;

   private void start() throws Exception {
      final int port = 9000;

      File cert = new File("cert.pem");
      File key = new File("key.pem");

      EmployeeService employeeService = new EmployeeService();
      ServerServiceDefinition serviceDef = ServerInterceptors
         .interceptForward(employeeService, new HeaderServerInterceptor());

      server = ServerBuilder.forPort(port)
         .useTransportSecurity(cert, key)
         .addService(serviceDef)
         .build()
         .start();
      System.out.println("Listening on port " + port);

      Runtime.getRuntime().addShutdownHook(new Thread() {
         @Override
         public void run() {
            System.out.println("\nShutting down server");
            EmployeeServiceServer.this.stop();
         }
      });

      server.awaitTermination();
   }

   private void stop() {
      if (server != null) {
         server.shutdown();
      }
   }
}
