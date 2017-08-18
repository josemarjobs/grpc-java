package com.kindelbit.grpc;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: messages.proto")
public final class EmployeeServiceGrpc {

  private EmployeeServiceGrpc() {}

  public static final String SERVICE_NAME = "EmployeeService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.kindelbit.grpc.GetByBadgeNumberRequest,
      com.kindelbit.grpc.EmployeeResponse> METHOD_GET_BY_BADGE_NUMBER =
      io.grpc.MethodDescriptor.<com.kindelbit.grpc.GetByBadgeNumberRequest, com.kindelbit.grpc.EmployeeResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "EmployeeService", "GetByBadgeNumber"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.kindelbit.grpc.GetByBadgeNumberRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.kindelbit.grpc.EmployeeResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.kindelbit.grpc.GetAllRequest,
      com.kindelbit.grpc.EmployeeResponse> METHOD_GET_ALL =
      io.grpc.MethodDescriptor.<com.kindelbit.grpc.GetAllRequest, com.kindelbit.grpc.EmployeeResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "EmployeeService", "GetAll"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.kindelbit.grpc.GetAllRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.kindelbit.grpc.EmployeeResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.kindelbit.grpc.EmployeeRequest,
      com.kindelbit.grpc.EmployeeResponse> METHOD_SAVE =
      io.grpc.MethodDescriptor.<com.kindelbit.grpc.EmployeeRequest, com.kindelbit.grpc.EmployeeResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "EmployeeService", "Save"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.kindelbit.grpc.EmployeeRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.kindelbit.grpc.EmployeeResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.kindelbit.grpc.EmployeeRequest,
      com.kindelbit.grpc.EmployeeResponse> METHOD_SAVE_ALL =
      io.grpc.MethodDescriptor.<com.kindelbit.grpc.EmployeeRequest, com.kindelbit.grpc.EmployeeResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "EmployeeService", "SaveAll"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.kindelbit.grpc.EmployeeRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.kindelbit.grpc.EmployeeResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.kindelbit.grpc.AddPhotoRequest,
      com.kindelbit.grpc.AddPhotoResponse> METHOD_ADD_PHOTO =
      io.grpc.MethodDescriptor.<com.kindelbit.grpc.AddPhotoRequest, com.kindelbit.grpc.AddPhotoResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "EmployeeService", "AddPhoto"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.kindelbit.grpc.AddPhotoRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.kindelbit.grpc.AddPhotoResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmployeeServiceStub newStub(io.grpc.Channel channel) {
    return new EmployeeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmployeeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EmployeeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmployeeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EmployeeServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class EmployeeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getByBadgeNumber(com.kindelbit.grpc.GetByBadgeNumberRequest request,
        io.grpc.stub.StreamObserver<com.kindelbit.grpc.EmployeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_BY_BADGE_NUMBER, responseObserver);
    }

    /**
     */
    public void getAll(com.kindelbit.grpc.GetAllRequest request,
        io.grpc.stub.StreamObserver<com.kindelbit.grpc.EmployeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL, responseObserver);
    }

    /**
     */
    public void save(com.kindelbit.grpc.EmployeeRequest request,
        io.grpc.stub.StreamObserver<com.kindelbit.grpc.EmployeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAVE, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.kindelbit.grpc.EmployeeRequest> saveAll(
        io.grpc.stub.StreamObserver<com.kindelbit.grpc.EmployeeResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_SAVE_ALL, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.kindelbit.grpc.AddPhotoRequest> addPhoto(
        io.grpc.stub.StreamObserver<com.kindelbit.grpc.AddPhotoResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_ADD_PHOTO, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_BY_BADGE_NUMBER,
            asyncUnaryCall(
              new MethodHandlers<
                com.kindelbit.grpc.GetByBadgeNumberRequest,
                com.kindelbit.grpc.EmployeeResponse>(
                  this, METHODID_GET_BY_BADGE_NUMBER)))
          .addMethod(
            METHOD_GET_ALL,
            asyncServerStreamingCall(
              new MethodHandlers<
                com.kindelbit.grpc.GetAllRequest,
                com.kindelbit.grpc.EmployeeResponse>(
                  this, METHODID_GET_ALL)))
          .addMethod(
            METHOD_SAVE,
            asyncUnaryCall(
              new MethodHandlers<
                com.kindelbit.grpc.EmployeeRequest,
                com.kindelbit.grpc.EmployeeResponse>(
                  this, METHODID_SAVE)))
          .addMethod(
            METHOD_SAVE_ALL,
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.kindelbit.grpc.EmployeeRequest,
                com.kindelbit.grpc.EmployeeResponse>(
                  this, METHODID_SAVE_ALL)))
          .addMethod(
            METHOD_ADD_PHOTO,
            asyncClientStreamingCall(
              new MethodHandlers<
                com.kindelbit.grpc.AddPhotoRequest,
                com.kindelbit.grpc.AddPhotoResponse>(
                  this, METHODID_ADD_PHOTO)))
          .build();
    }
  }

  /**
   */
  public static final class EmployeeServiceStub extends io.grpc.stub.AbstractStub<EmployeeServiceStub> {
    private EmployeeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeServiceStub(channel, callOptions);
    }

    /**
     */
    public void getByBadgeNumber(com.kindelbit.grpc.GetByBadgeNumberRequest request,
        io.grpc.stub.StreamObserver<com.kindelbit.grpc.EmployeeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_BY_BADGE_NUMBER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAll(com.kindelbit.grpc.GetAllRequest request,
        io.grpc.stub.StreamObserver<com.kindelbit.grpc.EmployeeResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_GET_ALL, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void save(com.kindelbit.grpc.EmployeeRequest request,
        io.grpc.stub.StreamObserver<com.kindelbit.grpc.EmployeeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SAVE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.kindelbit.grpc.EmployeeRequest> saveAll(
        io.grpc.stub.StreamObserver<com.kindelbit.grpc.EmployeeResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_SAVE_ALL, getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.kindelbit.grpc.AddPhotoRequest> addPhoto(
        io.grpc.stub.StreamObserver<com.kindelbit.grpc.AddPhotoResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_ADD_PHOTO, getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class EmployeeServiceBlockingStub extends io.grpc.stub.AbstractStub<EmployeeServiceBlockingStub> {
    private EmployeeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.kindelbit.grpc.EmployeeResponse getByBadgeNumber(com.kindelbit.grpc.GetByBadgeNumberRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_BY_BADGE_NUMBER, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.kindelbit.grpc.EmployeeResponse> getAll(
        com.kindelbit.grpc.GetAllRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_GET_ALL, getCallOptions(), request);
    }

    /**
     */
    public com.kindelbit.grpc.EmployeeResponse save(com.kindelbit.grpc.EmployeeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SAVE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EmployeeServiceFutureStub extends io.grpc.stub.AbstractStub<EmployeeServiceFutureStub> {
    private EmployeeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kindelbit.grpc.EmployeeResponse> getByBadgeNumber(
        com.kindelbit.grpc.GetByBadgeNumberRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_BY_BADGE_NUMBER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kindelbit.grpc.EmployeeResponse> save(
        com.kindelbit.grpc.EmployeeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SAVE, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BY_BADGE_NUMBER = 0;
  private static final int METHODID_GET_ALL = 1;
  private static final int METHODID_SAVE = 2;
  private static final int METHODID_SAVE_ALL = 3;
  private static final int METHODID_ADD_PHOTO = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EmployeeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EmployeeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BY_BADGE_NUMBER:
          serviceImpl.getByBadgeNumber((com.kindelbit.grpc.GetByBadgeNumberRequest) request,
              (io.grpc.stub.StreamObserver<com.kindelbit.grpc.EmployeeResponse>) responseObserver);
          break;
        case METHODID_GET_ALL:
          serviceImpl.getAll((com.kindelbit.grpc.GetAllRequest) request,
              (io.grpc.stub.StreamObserver<com.kindelbit.grpc.EmployeeResponse>) responseObserver);
          break;
        case METHODID_SAVE:
          serviceImpl.save((com.kindelbit.grpc.EmployeeRequest) request,
              (io.grpc.stub.StreamObserver<com.kindelbit.grpc.EmployeeResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_ALL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.saveAll(
              (io.grpc.stub.StreamObserver<com.kindelbit.grpc.EmployeeResponse>) responseObserver);
        case METHODID_ADD_PHOTO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.addPhoto(
              (io.grpc.stub.StreamObserver<com.kindelbit.grpc.AddPhotoResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class EmployeeServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.kindelbit.grpc.Messages.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EmployeeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmployeeServiceDescriptorSupplier())
              .addMethod(METHOD_GET_BY_BADGE_NUMBER)
              .addMethod(METHOD_GET_ALL)
              .addMethod(METHOD_SAVE)
              .addMethod(METHOD_SAVE_ALL)
              .addMethod(METHOD_ADD_PHOTO)
              .build();
        }
      }
    }
    return result;
  }
}
