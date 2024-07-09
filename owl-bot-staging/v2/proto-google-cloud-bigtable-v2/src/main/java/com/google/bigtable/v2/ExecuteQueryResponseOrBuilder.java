// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v2/bigtable.proto

// Protobuf Java Version: 3.25.3
package com.google.bigtable.v2;

public interface ExecuteQueryResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.v2.ExecuteQueryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Structure of rows in this response stream. The first (and only the first)
   * response streamed from the server will be of this type.
   * </pre>
   *
   * <code>.google.bigtable.v2.ResultSetMetadata metadata = 1;</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * Structure of rows in this response stream. The first (and only the first)
   * response streamed from the server will be of this type.
   * </pre>
   *
   * <code>.google.bigtable.v2.ResultSetMetadata metadata = 1;</code>
   * @return The metadata.
   */
  com.google.bigtable.v2.ResultSetMetadata getMetadata();
  /**
   * <pre>
   * Structure of rows in this response stream. The first (and only the first)
   * response streamed from the server will be of this type.
   * </pre>
   *
   * <code>.google.bigtable.v2.ResultSetMetadata metadata = 1;</code>
   */
  com.google.bigtable.v2.ResultSetMetadataOrBuilder getMetadataOrBuilder();

  /**
   * <pre>
   * A partial result set with row data potentially including additional
   * instructions on how recent past and future partial responses should be
   * interpreted.
   * </pre>
   *
   * <code>.google.bigtable.v2.PartialResultSet results = 2;</code>
   * @return Whether the results field is set.
   */
  boolean hasResults();
  /**
   * <pre>
   * A partial result set with row data potentially including additional
   * instructions on how recent past and future partial responses should be
   * interpreted.
   * </pre>
   *
   * <code>.google.bigtable.v2.PartialResultSet results = 2;</code>
   * @return The results.
   */
  com.google.bigtable.v2.PartialResultSet getResults();
  /**
   * <pre>
   * A partial result set with row data potentially including additional
   * instructions on how recent past and future partial responses should be
   * interpreted.
   * </pre>
   *
   * <code>.google.bigtable.v2.PartialResultSet results = 2;</code>
   */
  com.google.bigtable.v2.PartialResultSetOrBuilder getResultsOrBuilder();

  com.google.bigtable.v2.ExecuteQueryResponse.ResponseCase getResponseCase();
}
