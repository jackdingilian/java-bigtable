// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v2/data.proto

// Protobuf Java Version: 3.25.3
package com.google.bigtable.v2;

/**
 * <pre>
 * A partial result set from the streaming query API.
 * CBT client will buffer partial_rows from result_sets until it gets a
 * resumption_token.
 * </pre>
 *
 * Protobuf type {@code google.bigtable.v2.PartialResultSet}
 */
public final class PartialResultSet extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.bigtable.v2.PartialResultSet)
    PartialResultSetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PartialResultSet.newBuilder() to construct.
  private PartialResultSet(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PartialResultSet() {
    resumeToken_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PartialResultSet();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.bigtable.v2.DataProto.internal_static_google_bigtable_v2_PartialResultSet_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.v2.DataProto.internal_static_google_bigtable_v2_PartialResultSet_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.v2.PartialResultSet.class, com.google.bigtable.v2.PartialResultSet.Builder.class);
  }

  private int partialRowsCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object partialRows_;
  public enum PartialRowsCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    PROTO_ROWS_BATCH(3),
    PARTIALROWS_NOT_SET(0);
    private final int value;
    private PartialRowsCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PartialRowsCase valueOf(int value) {
      return forNumber(value);
    }

    public static PartialRowsCase forNumber(int value) {
      switch (value) {
        case 3: return PROTO_ROWS_BATCH;
        case 0: return PARTIALROWS_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public PartialRowsCase
  getPartialRowsCase() {
    return PartialRowsCase.forNumber(
        partialRowsCase_);
  }

  public static final int PROTO_ROWS_BATCH_FIELD_NUMBER = 3;
  /**
   * <pre>
   * Partial rows in serialized ProtoRows format.
   * </pre>
   *
   * <code>.google.bigtable.v2.ProtoRowsBatch proto_rows_batch = 3;</code>
   * @return Whether the protoRowsBatch field is set.
   */
  @java.lang.Override
  public boolean hasProtoRowsBatch() {
    return partialRowsCase_ == 3;
  }
  /**
   * <pre>
   * Partial rows in serialized ProtoRows format.
   * </pre>
   *
   * <code>.google.bigtable.v2.ProtoRowsBatch proto_rows_batch = 3;</code>
   * @return The protoRowsBatch.
   */
  @java.lang.Override
  public com.google.bigtable.v2.ProtoRowsBatch getProtoRowsBatch() {
    if (partialRowsCase_ == 3) {
       return (com.google.bigtable.v2.ProtoRowsBatch) partialRows_;
    }
    return com.google.bigtable.v2.ProtoRowsBatch.getDefaultInstance();
  }
  /**
   * <pre>
   * Partial rows in serialized ProtoRows format.
   * </pre>
   *
   * <code>.google.bigtable.v2.ProtoRowsBatch proto_rows_batch = 3;</code>
   */
  @java.lang.Override
  public com.google.bigtable.v2.ProtoRowsBatchOrBuilder getProtoRowsBatchOrBuilder() {
    if (partialRowsCase_ == 3) {
       return (com.google.bigtable.v2.ProtoRowsBatch) partialRows_;
    }
    return com.google.bigtable.v2.ProtoRowsBatch.getDefaultInstance();
  }

  public static final int RESUME_TOKEN_FIELD_NUMBER = 5;
  private com.google.protobuf.ByteString resumeToken_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * An opaque token sent by the server to allow query resumption and signal
   * the client to accumulate `partial_rows` since the last non-empty
   * `resume_token`. On resumption, the resumed query will return the remaining
   * rows for this query.
   *
   * If there is a batch in progress, a non-empty `resume_token`
   * means that that the batch of `partial_rows` will be complete after merging
   * the `partial_rows` from this response. The client must only yield
   * completed batches to the application, and must ensure that any future
   * retries send the latest token to avoid returning duplicate data.
   *
   * The server may set 'resume_token' without a 'partial_rows'. If there is a
   * batch in progress the client should yield it.
   *
   * The server will also send a sentinel `resume_token` when last batch of
   * `partial_rows` is sent. If the client retries the ExecuteQueryRequest with
   * the sentinel `resume_token`, the server will emit it again without any
   * `partial_rows`, then return OK.
   * </pre>
   *
   * <code>bytes resume_token = 5;</code>
   * @return The resumeToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getResumeToken() {
    return resumeToken_;
  }

  public static final int ESTIMATED_BATCH_SIZE_FIELD_NUMBER = 4;
  private int estimatedBatchSize_ = 0;
  /**
   * <pre>
   * Estimated size of a new batch. The server will always set this when
   * returning the first `partial_rows` of a batch, and will not set it at any
   * other time.
   *
   * The client can use this estimate to allocate an initial buffer for the
   * batched results. This helps minimize the number of allocations required,
   * though the buffer size may still need to be increased if the estimate is
   * too low.
   * </pre>
   *
   * <code>int32 estimated_batch_size = 4;</code>
   * @return The estimatedBatchSize.
   */
  @java.lang.Override
  public int getEstimatedBatchSize() {
    return estimatedBatchSize_;
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
    if (partialRowsCase_ == 3) {
      output.writeMessage(3, (com.google.bigtable.v2.ProtoRowsBatch) partialRows_);
    }
    if (estimatedBatchSize_ != 0) {
      output.writeInt32(4, estimatedBatchSize_);
    }
    if (!resumeToken_.isEmpty()) {
      output.writeBytes(5, resumeToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (partialRowsCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (com.google.bigtable.v2.ProtoRowsBatch) partialRows_);
    }
    if (estimatedBatchSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, estimatedBatchSize_);
    }
    if (!resumeToken_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(5, resumeToken_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.bigtable.v2.PartialResultSet)) {
      return super.equals(obj);
    }
    com.google.bigtable.v2.PartialResultSet other = (com.google.bigtable.v2.PartialResultSet) obj;

    if (!getResumeToken()
        .equals(other.getResumeToken())) return false;
    if (getEstimatedBatchSize()
        != other.getEstimatedBatchSize()) return false;
    if (!getPartialRowsCase().equals(other.getPartialRowsCase())) return false;
    switch (partialRowsCase_) {
      case 3:
        if (!getProtoRowsBatch()
            .equals(other.getProtoRowsBatch())) return false;
        break;
      case 0:
      default:
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RESUME_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getResumeToken().hashCode();
    hash = (37 * hash) + ESTIMATED_BATCH_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getEstimatedBatchSize();
    switch (partialRowsCase_) {
      case 3:
        hash = (37 * hash) + PROTO_ROWS_BATCH_FIELD_NUMBER;
        hash = (53 * hash) + getProtoRowsBatch().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.bigtable.v2.PartialResultSet parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.v2.PartialResultSet parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.v2.PartialResultSet parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.v2.PartialResultSet parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.v2.PartialResultSet parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.v2.PartialResultSet parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.v2.PartialResultSet parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.bigtable.v2.PartialResultSet parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.bigtable.v2.PartialResultSet parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.bigtable.v2.PartialResultSet parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.bigtable.v2.PartialResultSet parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.bigtable.v2.PartialResultSet parseFrom(
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
  public static Builder newBuilder(com.google.bigtable.v2.PartialResultSet prototype) {
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
   * A partial result set from the streaming query API.
   * CBT client will buffer partial_rows from result_sets until it gets a
   * resumption_token.
   * </pre>
   *
   * Protobuf type {@code google.bigtable.v2.PartialResultSet}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.v2.PartialResultSet)
      com.google.bigtable.v2.PartialResultSetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.bigtable.v2.DataProto.internal_static_google_bigtable_v2_PartialResultSet_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.v2.DataProto.internal_static_google_bigtable_v2_PartialResultSet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.v2.PartialResultSet.class, com.google.bigtable.v2.PartialResultSet.Builder.class);
    }

    // Construct using com.google.bigtable.v2.PartialResultSet.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (protoRowsBatchBuilder_ != null) {
        protoRowsBatchBuilder_.clear();
      }
      resumeToken_ = com.google.protobuf.ByteString.EMPTY;
      estimatedBatchSize_ = 0;
      partialRowsCase_ = 0;
      partialRows_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.bigtable.v2.DataProto.internal_static_google_bigtable_v2_PartialResultSet_descriptor;
    }

    @java.lang.Override
    public com.google.bigtable.v2.PartialResultSet getDefaultInstanceForType() {
      return com.google.bigtable.v2.PartialResultSet.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.bigtable.v2.PartialResultSet build() {
      com.google.bigtable.v2.PartialResultSet result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.bigtable.v2.PartialResultSet buildPartial() {
      com.google.bigtable.v2.PartialResultSet result = new com.google.bigtable.v2.PartialResultSet(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.bigtable.v2.PartialResultSet result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.resumeToken_ = resumeToken_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.estimatedBatchSize_ = estimatedBatchSize_;
      }
    }

    private void buildPartialOneofs(com.google.bigtable.v2.PartialResultSet result) {
      result.partialRowsCase_ = partialRowsCase_;
      result.partialRows_ = this.partialRows_;
      if (partialRowsCase_ == 3 &&
          protoRowsBatchBuilder_ != null) {
        result.partialRows_ = protoRowsBatchBuilder_.build();
      }
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
      if (other instanceof com.google.bigtable.v2.PartialResultSet) {
        return mergeFrom((com.google.bigtable.v2.PartialResultSet)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.bigtable.v2.PartialResultSet other) {
      if (other == com.google.bigtable.v2.PartialResultSet.getDefaultInstance()) return this;
      if (other.getResumeToken() != com.google.protobuf.ByteString.EMPTY) {
        setResumeToken(other.getResumeToken());
      }
      if (other.getEstimatedBatchSize() != 0) {
        setEstimatedBatchSize(other.getEstimatedBatchSize());
      }
      switch (other.getPartialRowsCase()) {
        case PROTO_ROWS_BATCH: {
          mergeProtoRowsBatch(other.getProtoRowsBatch());
          break;
        }
        case PARTIALROWS_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 26: {
              input.readMessage(
                  getProtoRowsBatchFieldBuilder().getBuilder(),
                  extensionRegistry);
              partialRowsCase_ = 3;
              break;
            } // case 26
            case 32: {
              estimatedBatchSize_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 32
            case 42: {
              resumeToken_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 42
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int partialRowsCase_ = 0;
    private java.lang.Object partialRows_;
    public PartialRowsCase
        getPartialRowsCase() {
      return PartialRowsCase.forNumber(
          partialRowsCase_);
    }

    public Builder clearPartialRows() {
      partialRowsCase_ = 0;
      partialRows_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.bigtable.v2.ProtoRowsBatch, com.google.bigtable.v2.ProtoRowsBatch.Builder, com.google.bigtable.v2.ProtoRowsBatchOrBuilder> protoRowsBatchBuilder_;
    /**
     * <pre>
     * Partial rows in serialized ProtoRows format.
     * </pre>
     *
     * <code>.google.bigtable.v2.ProtoRowsBatch proto_rows_batch = 3;</code>
     * @return Whether the protoRowsBatch field is set.
     */
    @java.lang.Override
    public boolean hasProtoRowsBatch() {
      return partialRowsCase_ == 3;
    }
    /**
     * <pre>
     * Partial rows in serialized ProtoRows format.
     * </pre>
     *
     * <code>.google.bigtable.v2.ProtoRowsBatch proto_rows_batch = 3;</code>
     * @return The protoRowsBatch.
     */
    @java.lang.Override
    public com.google.bigtable.v2.ProtoRowsBatch getProtoRowsBatch() {
      if (protoRowsBatchBuilder_ == null) {
        if (partialRowsCase_ == 3) {
          return (com.google.bigtable.v2.ProtoRowsBatch) partialRows_;
        }
        return com.google.bigtable.v2.ProtoRowsBatch.getDefaultInstance();
      } else {
        if (partialRowsCase_ == 3) {
          return protoRowsBatchBuilder_.getMessage();
        }
        return com.google.bigtable.v2.ProtoRowsBatch.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Partial rows in serialized ProtoRows format.
     * </pre>
     *
     * <code>.google.bigtable.v2.ProtoRowsBatch proto_rows_batch = 3;</code>
     */
    public Builder setProtoRowsBatch(com.google.bigtable.v2.ProtoRowsBatch value) {
      if (protoRowsBatchBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        partialRows_ = value;
        onChanged();
      } else {
        protoRowsBatchBuilder_.setMessage(value);
      }
      partialRowsCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * Partial rows in serialized ProtoRows format.
     * </pre>
     *
     * <code>.google.bigtable.v2.ProtoRowsBatch proto_rows_batch = 3;</code>
     */
    public Builder setProtoRowsBatch(
        com.google.bigtable.v2.ProtoRowsBatch.Builder builderForValue) {
      if (protoRowsBatchBuilder_ == null) {
        partialRows_ = builderForValue.build();
        onChanged();
      } else {
        protoRowsBatchBuilder_.setMessage(builderForValue.build());
      }
      partialRowsCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * Partial rows in serialized ProtoRows format.
     * </pre>
     *
     * <code>.google.bigtable.v2.ProtoRowsBatch proto_rows_batch = 3;</code>
     */
    public Builder mergeProtoRowsBatch(com.google.bigtable.v2.ProtoRowsBatch value) {
      if (protoRowsBatchBuilder_ == null) {
        if (partialRowsCase_ == 3 &&
            partialRows_ != com.google.bigtable.v2.ProtoRowsBatch.getDefaultInstance()) {
          partialRows_ = com.google.bigtable.v2.ProtoRowsBatch.newBuilder((com.google.bigtable.v2.ProtoRowsBatch) partialRows_)
              .mergeFrom(value).buildPartial();
        } else {
          partialRows_ = value;
        }
        onChanged();
      } else {
        if (partialRowsCase_ == 3) {
          protoRowsBatchBuilder_.mergeFrom(value);
        } else {
          protoRowsBatchBuilder_.setMessage(value);
        }
      }
      partialRowsCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * Partial rows in serialized ProtoRows format.
     * </pre>
     *
     * <code>.google.bigtable.v2.ProtoRowsBatch proto_rows_batch = 3;</code>
     */
    public Builder clearProtoRowsBatch() {
      if (protoRowsBatchBuilder_ == null) {
        if (partialRowsCase_ == 3) {
          partialRowsCase_ = 0;
          partialRows_ = null;
          onChanged();
        }
      } else {
        if (partialRowsCase_ == 3) {
          partialRowsCase_ = 0;
          partialRows_ = null;
        }
        protoRowsBatchBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Partial rows in serialized ProtoRows format.
     * </pre>
     *
     * <code>.google.bigtable.v2.ProtoRowsBatch proto_rows_batch = 3;</code>
     */
    public com.google.bigtable.v2.ProtoRowsBatch.Builder getProtoRowsBatchBuilder() {
      return getProtoRowsBatchFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Partial rows in serialized ProtoRows format.
     * </pre>
     *
     * <code>.google.bigtable.v2.ProtoRowsBatch proto_rows_batch = 3;</code>
     */
    @java.lang.Override
    public com.google.bigtable.v2.ProtoRowsBatchOrBuilder getProtoRowsBatchOrBuilder() {
      if ((partialRowsCase_ == 3) && (protoRowsBatchBuilder_ != null)) {
        return protoRowsBatchBuilder_.getMessageOrBuilder();
      } else {
        if (partialRowsCase_ == 3) {
          return (com.google.bigtable.v2.ProtoRowsBatch) partialRows_;
        }
        return com.google.bigtable.v2.ProtoRowsBatch.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Partial rows in serialized ProtoRows format.
     * </pre>
     *
     * <code>.google.bigtable.v2.ProtoRowsBatch proto_rows_batch = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.bigtable.v2.ProtoRowsBatch, com.google.bigtable.v2.ProtoRowsBatch.Builder, com.google.bigtable.v2.ProtoRowsBatchOrBuilder> 
        getProtoRowsBatchFieldBuilder() {
      if (protoRowsBatchBuilder_ == null) {
        if (!(partialRowsCase_ == 3)) {
          partialRows_ = com.google.bigtable.v2.ProtoRowsBatch.getDefaultInstance();
        }
        protoRowsBatchBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.bigtable.v2.ProtoRowsBatch, com.google.bigtable.v2.ProtoRowsBatch.Builder, com.google.bigtable.v2.ProtoRowsBatchOrBuilder>(
                (com.google.bigtable.v2.ProtoRowsBatch) partialRows_,
                getParentForChildren(),
                isClean());
        partialRows_ = null;
      }
      partialRowsCase_ = 3;
      onChanged();
      return protoRowsBatchBuilder_;
    }

    private com.google.protobuf.ByteString resumeToken_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * An opaque token sent by the server to allow query resumption and signal
     * the client to accumulate `partial_rows` since the last non-empty
     * `resume_token`. On resumption, the resumed query will return the remaining
     * rows for this query.
     *
     * If there is a batch in progress, a non-empty `resume_token`
     * means that that the batch of `partial_rows` will be complete after merging
     * the `partial_rows` from this response. The client must only yield
     * completed batches to the application, and must ensure that any future
     * retries send the latest token to avoid returning duplicate data.
     *
     * The server may set 'resume_token' without a 'partial_rows'. If there is a
     * batch in progress the client should yield it.
     *
     * The server will also send a sentinel `resume_token` when last batch of
     * `partial_rows` is sent. If the client retries the ExecuteQueryRequest with
     * the sentinel `resume_token`, the server will emit it again without any
     * `partial_rows`, then return OK.
     * </pre>
     *
     * <code>bytes resume_token = 5;</code>
     * @return The resumeToken.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getResumeToken() {
      return resumeToken_;
    }
    /**
     * <pre>
     * An opaque token sent by the server to allow query resumption and signal
     * the client to accumulate `partial_rows` since the last non-empty
     * `resume_token`. On resumption, the resumed query will return the remaining
     * rows for this query.
     *
     * If there is a batch in progress, a non-empty `resume_token`
     * means that that the batch of `partial_rows` will be complete after merging
     * the `partial_rows` from this response. The client must only yield
     * completed batches to the application, and must ensure that any future
     * retries send the latest token to avoid returning duplicate data.
     *
     * The server may set 'resume_token' without a 'partial_rows'. If there is a
     * batch in progress the client should yield it.
     *
     * The server will also send a sentinel `resume_token` when last batch of
     * `partial_rows` is sent. If the client retries the ExecuteQueryRequest with
     * the sentinel `resume_token`, the server will emit it again without any
     * `partial_rows`, then return OK.
     * </pre>
     *
     * <code>bytes resume_token = 5;</code>
     * @param value The resumeToken to set.
     * @return This builder for chaining.
     */
    public Builder setResumeToken(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      resumeToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An opaque token sent by the server to allow query resumption and signal
     * the client to accumulate `partial_rows` since the last non-empty
     * `resume_token`. On resumption, the resumed query will return the remaining
     * rows for this query.
     *
     * If there is a batch in progress, a non-empty `resume_token`
     * means that that the batch of `partial_rows` will be complete after merging
     * the `partial_rows` from this response. The client must only yield
     * completed batches to the application, and must ensure that any future
     * retries send the latest token to avoid returning duplicate data.
     *
     * The server may set 'resume_token' without a 'partial_rows'. If there is a
     * batch in progress the client should yield it.
     *
     * The server will also send a sentinel `resume_token` when last batch of
     * `partial_rows` is sent. If the client retries the ExecuteQueryRequest with
     * the sentinel `resume_token`, the server will emit it again without any
     * `partial_rows`, then return OK.
     * </pre>
     *
     * <code>bytes resume_token = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearResumeToken() {
      bitField0_ = (bitField0_ & ~0x00000002);
      resumeToken_ = getDefaultInstance().getResumeToken();
      onChanged();
      return this;
    }

    private int estimatedBatchSize_ ;
    /**
     * <pre>
     * Estimated size of a new batch. The server will always set this when
     * returning the first `partial_rows` of a batch, and will not set it at any
     * other time.
     *
     * The client can use this estimate to allocate an initial buffer for the
     * batched results. This helps minimize the number of allocations required,
     * though the buffer size may still need to be increased if the estimate is
     * too low.
     * </pre>
     *
     * <code>int32 estimated_batch_size = 4;</code>
     * @return The estimatedBatchSize.
     */
    @java.lang.Override
    public int getEstimatedBatchSize() {
      return estimatedBatchSize_;
    }
    /**
     * <pre>
     * Estimated size of a new batch. The server will always set this when
     * returning the first `partial_rows` of a batch, and will not set it at any
     * other time.
     *
     * The client can use this estimate to allocate an initial buffer for the
     * batched results. This helps minimize the number of allocations required,
     * though the buffer size may still need to be increased if the estimate is
     * too low.
     * </pre>
     *
     * <code>int32 estimated_batch_size = 4;</code>
     * @param value The estimatedBatchSize to set.
     * @return This builder for chaining.
     */
    public Builder setEstimatedBatchSize(int value) {

      estimatedBatchSize_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Estimated size of a new batch. The server will always set this when
     * returning the first `partial_rows` of a batch, and will not set it at any
     * other time.
     *
     * The client can use this estimate to allocate an initial buffer for the
     * batched results. This helps minimize the number of allocations required,
     * though the buffer size may still need to be increased if the estimate is
     * too low.
     * </pre>
     *
     * <code>int32 estimated_batch_size = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearEstimatedBatchSize() {
      bitField0_ = (bitField0_ & ~0x00000004);
      estimatedBatchSize_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.bigtable.v2.PartialResultSet)
  }

  // @@protoc_insertion_point(class_scope:google.bigtable.v2.PartialResultSet)
  private static final com.google.bigtable.v2.PartialResultSet DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.bigtable.v2.PartialResultSet();
  }

  public static com.google.bigtable.v2.PartialResultSet getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PartialResultSet>
      PARSER = new com.google.protobuf.AbstractParser<PartialResultSet>() {
    @java.lang.Override
    public PartialResultSet parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<PartialResultSet> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PartialResultSet> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.bigtable.v2.PartialResultSet getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

