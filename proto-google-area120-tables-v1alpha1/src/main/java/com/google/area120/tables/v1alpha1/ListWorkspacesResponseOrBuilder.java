/*
 * Copyright 2020 Google LLC
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
// source: google/area120/tables/v1alpha1/tables.proto

package com.google.area120.tables.v1alpha1;

public interface ListWorkspacesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.area120.tables.v1alpha1.ListWorkspacesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of workspaces.
   * </pre>
   *
   * <code>repeated .google.area120.tables.v1alpha1.Workspace workspaces = 1;</code>
   */
  java.util.List<com.google.area120.tables.v1alpha1.Workspace> getWorkspacesList();
  /**
   *
   *
   * <pre>
   * The list of workspaces.
   * </pre>
   *
   * <code>repeated .google.area120.tables.v1alpha1.Workspace workspaces = 1;</code>
   */
  com.google.area120.tables.v1alpha1.Workspace getWorkspaces(int index);
  /**
   *
   *
   * <pre>
   * The list of workspaces.
   * </pre>
   *
   * <code>repeated .google.area120.tables.v1alpha1.Workspace workspaces = 1;</code>
   */
  int getWorkspacesCount();
  /**
   *
   *
   * <pre>
   * The list of workspaces.
   * </pre>
   *
   * <code>repeated .google.area120.tables.v1alpha1.Workspace workspaces = 1;</code>
   */
  java.util.List<? extends com.google.area120.tables.v1alpha1.WorkspaceOrBuilder>
      getWorkspacesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of workspaces.
   * </pre>
   *
   * <code>repeated .google.area120.tables.v1alpha1.Workspace workspaces = 1;</code>
   */
  com.google.area120.tables.v1alpha1.WorkspaceOrBuilder getWorkspacesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is empty, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is empty, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}