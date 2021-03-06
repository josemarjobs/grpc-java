// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: messages.proto

package com.kindelbit.grpc;

public final class Messages {
  private Messages() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Employee_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Employee_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Vacation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Vacation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetAllRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetAllRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetByBadgeNumberRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetByBadgeNumberRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EmployeeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EmployeeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EmployeeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EmployeeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AddPhotoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AddPhotoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AddPhotoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AddPhotoResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016messages.proto\"\244\001\n\010Employee\022\n\n\002id\030\001 \001(" +
      "\005\022\023\n\013badgeNumber\030\002 \001(\005\022\021\n\tfirstName\030\003 \001(" +
      "\t\022\020\n\010lastName\030\004 \001(\t\022\033\n\023vacationAccrualRa" +
      "te\030\005 \001(\002\022\027\n\017vacationAccrued\030\006 \001(\002\022\034\n\tvac" +
      "ations\030\007 \003(\0132\t.Vacation\"P\n\010Vacation\022\n\n\002i" +
      "d\030\001 \001(\005\022\021\n\tstartDate\030\002 \001(\003\022\020\n\010duration\030\003" +
      " \001(\002\022\023\n\013isCancelled\030\004 \001(\010\"\017\n\rGetAllReque" +
      "st\".\n\027GetByBadgeNumberRequest\022\023\n\013badgeNu" +
      "mber\030\001 \001(\005\".\n\017EmployeeRequest\022\033\n\010employe" +
      "e\030\001 \001(\0132\t.Employee\"/\n\020EmployeeResponse\022\033",
      "\n\010employee\030\001 \001(\0132\t.Employee\"\037\n\017AddPhotoR" +
      "equest\022\014\n\004data\030\001 \001(\014\" \n\020AddPhotoResponse" +
      "\022\014\n\004isOk\030\001 \001(\0102\225\002\n\017EmployeeService\022?\n\020Ge" +
      "tByBadgeNumber\022\030.GetByBadgeNumberRequest" +
      "\032\021.EmployeeResponse\022-\n\006GetAll\022\016.GetAllRe" +
      "quest\032\021.EmployeeResponse0\001\022+\n\004Save\022\020.Emp" +
      "loyeeRequest\032\021.EmployeeResponse\0222\n\007SaveA" +
      "ll\022\020.EmployeeRequest\032\021.EmployeeResponse(" +
      "\0010\001\0221\n\010AddPhoto\022\020.AddPhotoRequest\032\021.AddP" +
      "hotoResponse(\001B#\n\022com.kindelbit.grpcP\001Z\013",
      "grpcdemo/pbb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Employee_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Employee_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Employee_descriptor,
        new java.lang.String[] { "Id", "BadgeNumber", "FirstName", "LastName", "VacationAccrualRate", "VacationAccrued", "Vacations", });
    internal_static_Vacation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Vacation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Vacation_descriptor,
        new java.lang.String[] { "Id", "StartDate", "Duration", "IsCancelled", });
    internal_static_GetAllRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_GetAllRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetAllRequest_descriptor,
        new java.lang.String[] { });
    internal_static_GetByBadgeNumberRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_GetByBadgeNumberRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetByBadgeNumberRequest_descriptor,
        new java.lang.String[] { "BadgeNumber", });
    internal_static_EmployeeRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_EmployeeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EmployeeRequest_descriptor,
        new java.lang.String[] { "Employee", });
    internal_static_EmployeeResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_EmployeeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EmployeeResponse_descriptor,
        new java.lang.String[] { "Employee", });
    internal_static_AddPhotoRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_AddPhotoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AddPhotoRequest_descriptor,
        new java.lang.String[] { "Data", });
    internal_static_AddPhotoResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_AddPhotoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AddPhotoResponse_descriptor,
        new java.lang.String[] { "IsOk", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
