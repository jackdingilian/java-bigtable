/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v2/bigtable.proto

// Protobuf Java Version: 3.25.2
package com.google.bigtable.v2;

/**
 *
 *
 * <pre>
 * NOTE: This API is intended to be used by Apache Beam BigtableIO.
 * Response message for Bigtable.GenerateInitialChangeStreamPartitions.
 * </pre>
 *
 * Protobuf type {@code google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse}
 */
public final class GenerateInitialChangeStreamPartitionsResponse
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse)
    GenerateInitialChangeStreamPartitionsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GenerateInitialChangeStreamPartitionsResponse.newBuilder() to construct.
  private GenerateInitialChangeStreamPartitionsResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GenerateInitialChangeStreamPartitionsResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GenerateInitialChangeStreamPartitionsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.bigtable.v2.BigtableProto
        .internal_static_google_bigtable_v2_GenerateInitialChangeStreamPartitionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.v2.BigtableProto
        .internal_static_google_bigtable_v2_GenerateInitialChangeStreamPartitionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse.class,
            com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int PARTITION_FIELD_NUMBER = 1;
  private com.google.bigtable.v2.StreamPartition partition_;
  /**
   *
   *
   * <pre>
   * A partition of the change stream.
   * </pre>
   *
   * <code>.google.bigtable.v2.StreamPartition partition = 1;</code>
   *
   * @return Whether the partition field is set.
   */
  @java.lang.Override
  public boolean hasPartition() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * A partition of the change stream.
   * </pre>
   *
   * <code>.google.bigtable.v2.StreamPartition partition = 1;</code>
   *
   * @return The partition.
   */
  @java.lang.Override
  public com.google.bigtable.v2.StreamPartition getPartition() {
    return partition_ == null
        ? com.google.bigtable.v2.StreamPartition.getDefaultInstance()
        : partition_;
  }
  /**
   *
   *
   * <pre>
   * A partition of the change stream.
   * </pre>
   *
   * <code>.google.bigtable.v2.StreamPartition partition = 1;</code>
   */
  @java.lang.Override
  public com.google.bigtable.v2.StreamPartitionOrBuilder getPartitionOrBuilder() {
    return partition_ == null
        ? com.google.bigtable.v2.StreamPartition.getDefaultInstance()
        : partition_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getPartition());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getPartition());
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
    if (!(obj instanceof com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse)) {
      return super.equals(obj);
    }
    com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse other =
        (com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse) obj;

    if (hasPartition() != other.hasPartition()) return false;
    if (hasPartition()) {
      if (!getPartition().equals(other.getPartition())) return false;
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
    if (hasPartition()) {
      hash = (37 * hash) + PARTITION_FIELD_NUMBER;
      hash = (53 * hash) + getPartition().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * NOTE: This API is intended to be used by Apache Beam BigtableIO.
   * Response message for Bigtable.GenerateInitialChangeStreamPartitions.
   * </pre>
   *
   * Protobuf type {@code google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse)
      com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.bigtable.v2.BigtableProto
          .internal_static_google_bigtable_v2_GenerateInitialChangeStreamPartitionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.v2.BigtableProto
          .internal_static_google_bigtable_v2_GenerateInitialChangeStreamPartitionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse.class,
              com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse.Builder.class);
    }

    // Construct using
    // com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getPartitionFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      partition_ = null;
      if (partitionBuilder_ != null) {
        partitionBuilder_.dispose();
        partitionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.bigtable.v2.BigtableProto
          .internal_static_google_bigtable_v2_GenerateInitialChangeStreamPartitionsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse
        getDefaultInstanceForType() {
      return com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse build() {
      com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse buildPartial() {
      com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse result =
          new com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.partition_ = partitionBuilder_ == null ? partition_ : partitionBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse) {
        return mergeFrom(
            (com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse other) {
      if (other
          == com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse
              .getDefaultInstance()) return this;
      if (other.hasPartition()) {
        mergePartition(other.getPartition());
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
            case 10:
              {
                input.readMessage(getPartitionFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            default:
              {
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

    private int bitField0_;

    private com.google.bigtable.v2.StreamPartition partition_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.bigtable.v2.StreamPartition,
            com.google.bigtable.v2.StreamPartition.Builder,
            com.google.bigtable.v2.StreamPartitionOrBuilder>
        partitionBuilder_;
    /**
     *
     *
     * <pre>
     * A partition of the change stream.
     * </pre>
     *
     * <code>.google.bigtable.v2.StreamPartition partition = 1;</code>
     *
     * @return Whether the partition field is set.
     */
    public boolean hasPartition() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * A partition of the change stream.
     * </pre>
     *
     * <code>.google.bigtable.v2.StreamPartition partition = 1;</code>
     *
     * @return The partition.
     */
    public com.google.bigtable.v2.StreamPartition getPartition() {
      if (partitionBuilder_ == null) {
        return partition_ == null
            ? com.google.bigtable.v2.StreamPartition.getDefaultInstance()
            : partition_;
      } else {
        return partitionBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * A partition of the change stream.
     * </pre>
     *
     * <code>.google.bigtable.v2.StreamPartition partition = 1;</code>
     */
    public Builder setPartition(com.google.bigtable.v2.StreamPartition value) {
      if (partitionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        partition_ = value;
      } else {
        partitionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A partition of the change stream.
     * </pre>
     *
     * <code>.google.bigtable.v2.StreamPartition partition = 1;</code>
     */
    public Builder setPartition(com.google.bigtable.v2.StreamPartition.Builder builderForValue) {
      if (partitionBuilder_ == null) {
        partition_ = builderForValue.build();
      } else {
        partitionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A partition of the change stream.
     * </pre>
     *
     * <code>.google.bigtable.v2.StreamPartition partition = 1;</code>
     */
    public Builder mergePartition(com.google.bigtable.v2.StreamPartition value) {
      if (partitionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && partition_ != null
            && partition_ != com.google.bigtable.v2.StreamPartition.getDefaultInstance()) {
          getPartitionBuilder().mergeFrom(value);
        } else {
          partition_ = value;
        }
      } else {
        partitionBuilder_.mergeFrom(value);
      }
      if (partition_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A partition of the change stream.
     * </pre>
     *
     * <code>.google.bigtable.v2.StreamPartition partition = 1;</code>
     */
    public Builder clearPartition() {
      bitField0_ = (bitField0_ & ~0x00000001);
      partition_ = null;
      if (partitionBuilder_ != null) {
        partitionBuilder_.dispose();
        partitionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A partition of the change stream.
     * </pre>
     *
     * <code>.google.bigtable.v2.StreamPartition partition = 1;</code>
     */
    public com.google.bigtable.v2.StreamPartition.Builder getPartitionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPartitionFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * A partition of the change stream.
     * </pre>
     *
     * <code>.google.bigtable.v2.StreamPartition partition = 1;</code>
     */
    public com.google.bigtable.v2.StreamPartitionOrBuilder getPartitionOrBuilder() {
      if (partitionBuilder_ != null) {
        return partitionBuilder_.getMessageOrBuilder();
      } else {
        return partition_ == null
            ? com.google.bigtable.v2.StreamPartition.getDefaultInstance()
            : partition_;
      }
    }
    /**
     *
     *
     * <pre>
     * A partition of the change stream.
     * </pre>
     *
     * <code>.google.bigtable.v2.StreamPartition partition = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.bigtable.v2.StreamPartition,
            com.google.bigtable.v2.StreamPartition.Builder,
            com.google.bigtable.v2.StreamPartitionOrBuilder>
        getPartitionFieldBuilder() {
      if (partitionBuilder_ == null) {
        partitionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.bigtable.v2.StreamPartition,
                com.google.bigtable.v2.StreamPartition.Builder,
                com.google.bigtable.v2.StreamPartitionOrBuilder>(
                getPartition(), getParentForChildren(), isClean());
        partition_ = null;
      }
      return partitionBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse)
  private static final com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse();
  }

  public static com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateInitialChangeStreamPartitionsResponse>
      PARSER =
          new com.google.protobuf.AbstractParser<GenerateInitialChangeStreamPartitionsResponse>() {
            @java.lang.Override
            public GenerateInitialChangeStreamPartitionsResponse parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              Builder builder = newBuilder();
              try {
                builder.mergeFrom(input, extensionRegistry);
              } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(builder.buildPartial());
              } catch (com.google.protobuf.UninitializedMessageException e) {
                throw e.asInvalidProtocolBufferException()
                    .setUnfinishedMessage(builder.buildPartial());
              } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e)
                    .setUnfinishedMessage(builder.buildPartial());
              }
              return builder.buildPartial();
            }
          };

  public static com.google.protobuf.Parser<GenerateInitialChangeStreamPartitionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateInitialChangeStreamPartitionsResponse>
      getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
