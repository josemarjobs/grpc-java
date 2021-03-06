// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: messages.proto

package com.kindelbit.grpc;

/**
 * Protobuf type {@code GetByBadgeNumberRequest}
 */
public  final class GetByBadgeNumberRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GetByBadgeNumberRequest)
    GetByBadgeNumberRequestOrBuilder {
  // Use GetByBadgeNumberRequest.newBuilder() to construct.
  private GetByBadgeNumberRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetByBadgeNumberRequest() {
    badgeNumber_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetByBadgeNumberRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            badgeNumber_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kindelbit.grpc.Messages.internal_static_GetByBadgeNumberRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kindelbit.grpc.Messages.internal_static_GetByBadgeNumberRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kindelbit.grpc.GetByBadgeNumberRequest.class, com.kindelbit.grpc.GetByBadgeNumberRequest.Builder.class);
  }

  public static final int BADGENUMBER_FIELD_NUMBER = 1;
  private int badgeNumber_;
  /**
   * <code>int32 badgeNumber = 1;</code>
   */
  public int getBadgeNumber() {
    return badgeNumber_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (badgeNumber_ != 0) {
      output.writeInt32(1, badgeNumber_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (badgeNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, badgeNumber_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.kindelbit.grpc.GetByBadgeNumberRequest)) {
      return super.equals(obj);
    }
    com.kindelbit.grpc.GetByBadgeNumberRequest other = (com.kindelbit.grpc.GetByBadgeNumberRequest) obj;

    boolean result = true;
    result = result && (getBadgeNumber()
        == other.getBadgeNumber());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + BADGENUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getBadgeNumber();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kindelbit.grpc.GetByBadgeNumberRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kindelbit.grpc.GetByBadgeNumberRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kindelbit.grpc.GetByBadgeNumberRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kindelbit.grpc.GetByBadgeNumberRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kindelbit.grpc.GetByBadgeNumberRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kindelbit.grpc.GetByBadgeNumberRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kindelbit.grpc.GetByBadgeNumberRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kindelbit.grpc.GetByBadgeNumberRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kindelbit.grpc.GetByBadgeNumberRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.kindelbit.grpc.GetByBadgeNumberRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kindelbit.grpc.GetByBadgeNumberRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kindelbit.grpc.GetByBadgeNumberRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.kindelbit.grpc.GetByBadgeNumberRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code GetByBadgeNumberRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GetByBadgeNumberRequest)
      com.kindelbit.grpc.GetByBadgeNumberRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kindelbit.grpc.Messages.internal_static_GetByBadgeNumberRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kindelbit.grpc.Messages.internal_static_GetByBadgeNumberRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kindelbit.grpc.GetByBadgeNumberRequest.class, com.kindelbit.grpc.GetByBadgeNumberRequest.Builder.class);
    }

    // Construct using com.kindelbit.grpc.GetByBadgeNumberRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      badgeNumber_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kindelbit.grpc.Messages.internal_static_GetByBadgeNumberRequest_descriptor;
    }

    public com.kindelbit.grpc.GetByBadgeNumberRequest getDefaultInstanceForType() {
      return com.kindelbit.grpc.GetByBadgeNumberRequest.getDefaultInstance();
    }

    public com.kindelbit.grpc.GetByBadgeNumberRequest build() {
      com.kindelbit.grpc.GetByBadgeNumberRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.kindelbit.grpc.GetByBadgeNumberRequest buildPartial() {
      com.kindelbit.grpc.GetByBadgeNumberRequest result = new com.kindelbit.grpc.GetByBadgeNumberRequest(this);
      result.badgeNumber_ = badgeNumber_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.kindelbit.grpc.GetByBadgeNumberRequest) {
        return mergeFrom((com.kindelbit.grpc.GetByBadgeNumberRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kindelbit.grpc.GetByBadgeNumberRequest other) {
      if (other == com.kindelbit.grpc.GetByBadgeNumberRequest.getDefaultInstance()) return this;
      if (other.getBadgeNumber() != 0) {
        setBadgeNumber(other.getBadgeNumber());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.kindelbit.grpc.GetByBadgeNumberRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.kindelbit.grpc.GetByBadgeNumberRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int badgeNumber_ ;
    /**
     * <code>int32 badgeNumber = 1;</code>
     */
    public int getBadgeNumber() {
      return badgeNumber_;
    }
    /**
     * <code>int32 badgeNumber = 1;</code>
     */
    public Builder setBadgeNumber(int value) {
      
      badgeNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 badgeNumber = 1;</code>
     */
    public Builder clearBadgeNumber() {
      
      badgeNumber_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:GetByBadgeNumberRequest)
  }

  // @@protoc_insertion_point(class_scope:GetByBadgeNumberRequest)
  private static final com.kindelbit.grpc.GetByBadgeNumberRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kindelbit.grpc.GetByBadgeNumberRequest();
  }

  public static com.kindelbit.grpc.GetByBadgeNumberRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetByBadgeNumberRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetByBadgeNumberRequest>() {
    public GetByBadgeNumberRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetByBadgeNumberRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetByBadgeNumberRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetByBadgeNumberRequest> getParserForType() {
    return PARSER;
  }

  public com.kindelbit.grpc.GetByBadgeNumberRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

