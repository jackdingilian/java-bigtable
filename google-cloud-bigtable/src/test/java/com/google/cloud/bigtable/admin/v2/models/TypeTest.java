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
package com.google.cloud.bigtable.admin.v2.models;

import static com.google.common.truth.Truth.assertThat;

import com.google.cloud.bigtable.admin.v2.TypeProtos;
import com.google.cloud.bigtable.admin.v2.models.Type.Bytes;
import com.google.cloud.bigtable.admin.v2.models.Type.Int64;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TypeTest {

  @Test
  public void rawBytes() {
    Type type = Type.rawBytes();
    assertThat(type.toProto())
        .isEqualTo(
            com.google.bigtable.admin.v2.Type.newBuilder()
                .setBytesType(TypeProtos.bytesType())
                .build());
  }

  @Test
  public void bytes() {
    Type type = Type.bytes(Bytes.Encoding.raw());
    assertThat(type.toProto())
        .isEqualTo(
            com.google.bigtable.admin.v2.Type.newBuilder()
                .setBytesType(TypeProtos.bytesType())
                .build());
  }

  @Test
  public void bigEndianInt64() {
    Type type = Type.bigEndianInt64();
    assertThat(type.toProto()).isEqualTo(TypeProtos.int64Type());
  }

  @Test
  public void int64WithEncoding() {
    Type type = Type.int64(Int64.Encoding.BigEndianBytes.create(Bytes.rawBytes()));
    assertThat(type.toProto()).isEqualTo(TypeProtos.int64Type());
  }

  @Test
  public void int64Sum() {
    Type type = Type.int64Sum();
    assertThat(type.toProto()).isEqualTo(TypeProtos.intSumType());
  }

  @Test
  public void sum() {
    Type type = Type.sum(Type.bigEndianInt64());
    assertThat(type.toProto()).isEqualTo(TypeProtos.intSumType());
  }

  @Test
  public void intSumFromProtoToProto() {
    com.google.bigtable.admin.v2.Type proto = TypeProtos.intSumType();
    assertThat(Type.fromProto(proto)).isEqualTo(Type.int64Sum());
    assertThat(Type.fromProto(proto).toProto()).isEqualTo(proto);
  }
}
