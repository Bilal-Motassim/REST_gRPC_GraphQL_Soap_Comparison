// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hotel.proto

package com.grpc.stubs;

/**
 * <pre>
 * Reservation Messages
 * </pre>
 *
 * Protobuf type {@code Reservation}
 */
public  final class Reservation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Reservation)
    ReservationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Reservation.newBuilder() to construct.
  private Reservation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Reservation() {
    checkInDate_ = "";
    checkOutDate_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Reservation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Reservation(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            id_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            checkInDate_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            checkOutDate_ = s;
            break;
          }
          case 37: {

            totalCost_ = input.readFloat();
            break;
          }
          case 40: {

            guestId_ = input.readInt32();
            break;
          }
          case 48: {

            roomId_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.grpc.stubs.Hotel.internal_static_Reservation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpc.stubs.Hotel.internal_static_Reservation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpc.stubs.Reservation.class, com.grpc.stubs.Reservation.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  public int getId() {
    return id_;
  }

  public static final int CHECK_IN_DATE_FIELD_NUMBER = 2;
  private volatile java.lang.Object checkInDate_;
  /**
   * <code>string check_in_date = 2;</code>
   * @return The checkInDate.
   */
  public java.lang.String getCheckInDate() {
    java.lang.Object ref = checkInDate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      checkInDate_ = s;
      return s;
    }
  }
  /**
   * <code>string check_in_date = 2;</code>
   * @return The bytes for checkInDate.
   */
  public com.google.protobuf.ByteString
      getCheckInDateBytes() {
    java.lang.Object ref = checkInDate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      checkInDate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHECK_OUT_DATE_FIELD_NUMBER = 3;
  private volatile java.lang.Object checkOutDate_;
  /**
   * <code>string check_out_date = 3;</code>
   * @return The checkOutDate.
   */
  public java.lang.String getCheckOutDate() {
    java.lang.Object ref = checkOutDate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      checkOutDate_ = s;
      return s;
    }
  }
  /**
   * <code>string check_out_date = 3;</code>
   * @return The bytes for checkOutDate.
   */
  public com.google.protobuf.ByteString
      getCheckOutDateBytes() {
    java.lang.Object ref = checkOutDate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      checkOutDate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOTAL_COST_FIELD_NUMBER = 4;
  private float totalCost_;
  /**
   * <code>float total_cost = 4;</code>
   * @return The totalCost.
   */
  public float getTotalCost() {
    return totalCost_;
  }

  public static final int GUEST_ID_FIELD_NUMBER = 5;
  private int guestId_;
  /**
   * <code>int32 guest_id = 5;</code>
   * @return The guestId.
   */
  public int getGuestId() {
    return guestId_;
  }

  public static final int ROOM_ID_FIELD_NUMBER = 6;
  private int roomId_;
  /**
   * <code>int32 room_id = 6;</code>
   * @return The roomId.
   */
  public int getRoomId() {
    return roomId_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (!getCheckInDateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, checkInDate_);
    }
    if (!getCheckOutDateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, checkOutDate_);
    }
    if (totalCost_ != 0F) {
      output.writeFloat(4, totalCost_);
    }
    if (guestId_ != 0) {
      output.writeInt32(5, guestId_);
    }
    if (roomId_ != 0) {
      output.writeInt32(6, roomId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (!getCheckInDateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, checkInDate_);
    }
    if (!getCheckOutDateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, checkOutDate_);
    }
    if (totalCost_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, totalCost_);
    }
    if (guestId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, guestId_);
    }
    if (roomId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, roomId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.grpc.stubs.Reservation)) {
      return super.equals(obj);
    }
    com.grpc.stubs.Reservation other = (com.grpc.stubs.Reservation) obj;

    if (getId()
        != other.getId()) return false;
    if (!getCheckInDate()
        .equals(other.getCheckInDate())) return false;
    if (!getCheckOutDate()
        .equals(other.getCheckOutDate())) return false;
    if (java.lang.Float.floatToIntBits(getTotalCost())
        != java.lang.Float.floatToIntBits(
            other.getTotalCost())) return false;
    if (getGuestId()
        != other.getGuestId()) return false;
    if (getRoomId()
        != other.getRoomId()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + CHECK_IN_DATE_FIELD_NUMBER;
    hash = (53 * hash) + getCheckInDate().hashCode();
    hash = (37 * hash) + CHECK_OUT_DATE_FIELD_NUMBER;
    hash = (53 * hash) + getCheckOutDate().hashCode();
    hash = (37 * hash) + TOTAL_COST_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getTotalCost());
    hash = (37 * hash) + GUEST_ID_FIELD_NUMBER;
    hash = (53 * hash) + getGuestId();
    hash = (37 * hash) + ROOM_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRoomId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.grpc.stubs.Reservation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.stubs.Reservation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.stubs.Reservation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.stubs.Reservation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.stubs.Reservation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.stubs.Reservation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.stubs.Reservation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.stubs.Reservation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.stubs.Reservation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grpc.stubs.Reservation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.stubs.Reservation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.stubs.Reservation parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.grpc.stubs.Reservation prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * <pre>
   * Reservation Messages
   * </pre>
   *
   * Protobuf type {@code Reservation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Reservation)
      com.grpc.stubs.ReservationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpc.stubs.Hotel.internal_static_Reservation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.stubs.Hotel.internal_static_Reservation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.stubs.Reservation.class, com.grpc.stubs.Reservation.Builder.class);
    }

    // Construct using com.grpc.stubs.Reservation.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0;

      checkInDate_ = "";

      checkOutDate_ = "";

      totalCost_ = 0F;

      guestId_ = 0;

      roomId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpc.stubs.Hotel.internal_static_Reservation_descriptor;
    }

    @java.lang.Override
    public com.grpc.stubs.Reservation getDefaultInstanceForType() {
      return com.grpc.stubs.Reservation.getDefaultInstance();
    }

    @java.lang.Override
    public com.grpc.stubs.Reservation build() {
      com.grpc.stubs.Reservation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.grpc.stubs.Reservation buildPartial() {
      com.grpc.stubs.Reservation result = new com.grpc.stubs.Reservation(this);
      result.id_ = id_;
      result.checkInDate_ = checkInDate_;
      result.checkOutDate_ = checkOutDate_;
      result.totalCost_ = totalCost_;
      result.guestId_ = guestId_;
      result.roomId_ = roomId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.grpc.stubs.Reservation) {
        return mergeFrom((com.grpc.stubs.Reservation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grpc.stubs.Reservation other) {
      if (other == com.grpc.stubs.Reservation.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (!other.getCheckInDate().isEmpty()) {
        checkInDate_ = other.checkInDate_;
        onChanged();
      }
      if (!other.getCheckOutDate().isEmpty()) {
        checkOutDate_ = other.checkOutDate_;
        onChanged();
      }
      if (other.getTotalCost() != 0F) {
        setTotalCost(other.getTotalCost());
      }
      if (other.getGuestId() != 0) {
        setGuestId(other.getGuestId());
      }
      if (other.getRoomId() != 0) {
        setRoomId(other.getRoomId());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.grpc.stubs.Reservation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.grpc.stubs.Reservation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int id_ ;
    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object checkInDate_ = "";
    /**
     * <code>string check_in_date = 2;</code>
     * @return The checkInDate.
     */
    public java.lang.String getCheckInDate() {
      java.lang.Object ref = checkInDate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        checkInDate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string check_in_date = 2;</code>
     * @return The bytes for checkInDate.
     */
    public com.google.protobuf.ByteString
        getCheckInDateBytes() {
      java.lang.Object ref = checkInDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        checkInDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string check_in_date = 2;</code>
     * @param value The checkInDate to set.
     * @return This builder for chaining.
     */
    public Builder setCheckInDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      checkInDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string check_in_date = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCheckInDate() {
      
      checkInDate_ = getDefaultInstance().getCheckInDate();
      onChanged();
      return this;
    }
    /**
     * <code>string check_in_date = 2;</code>
     * @param value The bytes for checkInDate to set.
     * @return This builder for chaining.
     */
    public Builder setCheckInDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      checkInDate_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object checkOutDate_ = "";
    /**
     * <code>string check_out_date = 3;</code>
     * @return The checkOutDate.
     */
    public java.lang.String getCheckOutDate() {
      java.lang.Object ref = checkOutDate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        checkOutDate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string check_out_date = 3;</code>
     * @return The bytes for checkOutDate.
     */
    public com.google.protobuf.ByteString
        getCheckOutDateBytes() {
      java.lang.Object ref = checkOutDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        checkOutDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string check_out_date = 3;</code>
     * @param value The checkOutDate to set.
     * @return This builder for chaining.
     */
    public Builder setCheckOutDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      checkOutDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string check_out_date = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCheckOutDate() {
      
      checkOutDate_ = getDefaultInstance().getCheckOutDate();
      onChanged();
      return this;
    }
    /**
     * <code>string check_out_date = 3;</code>
     * @param value The bytes for checkOutDate to set.
     * @return This builder for chaining.
     */
    public Builder setCheckOutDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      checkOutDate_ = value;
      onChanged();
      return this;
    }

    private float totalCost_ ;
    /**
     * <code>float total_cost = 4;</code>
     * @return The totalCost.
     */
    public float getTotalCost() {
      return totalCost_;
    }
    /**
     * <code>float total_cost = 4;</code>
     * @param value The totalCost to set.
     * @return This builder for chaining.
     */
    public Builder setTotalCost(float value) {
      
      totalCost_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float total_cost = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalCost() {
      
      totalCost_ = 0F;
      onChanged();
      return this;
    }

    private int guestId_ ;
    /**
     * <code>int32 guest_id = 5;</code>
     * @return The guestId.
     */
    public int getGuestId() {
      return guestId_;
    }
    /**
     * <code>int32 guest_id = 5;</code>
     * @param value The guestId to set.
     * @return This builder for chaining.
     */
    public Builder setGuestId(int value) {
      
      guestId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 guest_id = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearGuestId() {
      
      guestId_ = 0;
      onChanged();
      return this;
    }

    private int roomId_ ;
    /**
     * <code>int32 room_id = 6;</code>
     * @return The roomId.
     */
    public int getRoomId() {
      return roomId_;
    }
    /**
     * <code>int32 room_id = 6;</code>
     * @param value The roomId to set.
     * @return This builder for chaining.
     */
    public Builder setRoomId(int value) {
      
      roomId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 room_id = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearRoomId() {
      
      roomId_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Reservation)
  }

  // @@protoc_insertion_point(class_scope:Reservation)
  private static final com.grpc.stubs.Reservation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpc.stubs.Reservation();
  }

  public static com.grpc.stubs.Reservation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Reservation>
      PARSER = new com.google.protobuf.AbstractParser<Reservation>() {
    @java.lang.Override
    public Reservation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Reservation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Reservation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Reservation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.grpc.stubs.Reservation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
