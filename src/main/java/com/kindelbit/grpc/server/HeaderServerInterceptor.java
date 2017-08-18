package com.kindelbit.grpc.server;

import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;

/**
 * Created by josemarmagalhaes on 8/17/17.
 */
public class HeaderServerInterceptor implements ServerInterceptor {
   public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
      ServerCall<ReqT, RespT> sc,
      Metadata md,
      ServerCallHandler<ReqT, RespT> next) {

      if (sc.getMethodDescriptor().getFullMethodName()
         .equals("EmployeeService/GetByBadgeNumber")) {
         for (String key : md.keys()) {
            System.out.println(key + ": " + md.get(Metadata.Key.of(key, Metadata.ASCII_STRING_MARSHALLER)));
         }
      }

      return next.startCall(sc, md);
   }
}
