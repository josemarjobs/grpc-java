// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: messages.proto

package com.kindelbit.grpc;

public interface VacationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Vacation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   */
  int getId();

  /**
   * <code>int64 startDate = 2;</code>
   */
  long getStartDate();

  /**
   * <code>float duration = 3;</code>
   */
  float getDuration();

  /**
   * <code>bool isCancelled = 4;</code>
   */
  boolean getIsCancelled();
}