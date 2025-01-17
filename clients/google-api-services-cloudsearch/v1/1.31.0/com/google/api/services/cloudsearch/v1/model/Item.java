/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.cloudsearch.v1.model;

/**
 * Represents a single object that is an item in the search index, such as a file, folder, or a
 * database record.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Item extends com.google.api.client.json.GenericJson {

  /**
   * Access control list for this item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ItemAcl acl;

  /**
   * Item content to be indexed and made text searchable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ItemContent content;

  /**
   * Type for this item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String itemType;

  /**
   * Metadata information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ItemMetadata metadata;

  /**
   * Name of the Item. Format: datasources/{source_id}/items/{item_id} This is a required field. The
   * maximum length is 1536 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Additional state connector can store for this item. The maximum length is 10000 bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String payload;

  /**
   * Queue this item belongs to. The maximum length is 100 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String queue;

  /**
   * Status of the item. Output only field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ItemStatus status;

  /**
   * The structured data for the item that should conform to a registered object definition in the
   * schema for the data source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ItemStructuredData structuredData;

  /**
   * Required. The indexing system stores the version from the datasource as a byte string and
   * compares the Item version in the index to the version of the queued Item using lexical
   * ordering. Cloud Search Indexing won't index or delete any queued item with a version value that
   * is less than or equal to the version of the currently indexed item. The maximum length for this
   * field is 1024 bytes. See [this guide](https://developers.devsite.corp.google.com/cloud-
   * search/docs/guides/operations) to understand how item version affects reindexing after delete
   * item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * Access control list for this item.
   * @return value or {@code null} for none
   */
  public ItemAcl getAcl() {
    return acl;
  }

  /**
   * Access control list for this item.
   * @param acl acl or {@code null} for none
   */
  public Item setAcl(ItemAcl acl) {
    this.acl = acl;
    return this;
  }

  /**
   * Item content to be indexed and made text searchable.
   * @return value or {@code null} for none
   */
  public ItemContent getContent() {
    return content;
  }

  /**
   * Item content to be indexed and made text searchable.
   * @param content content or {@code null} for none
   */
  public Item setContent(ItemContent content) {
    this.content = content;
    return this;
  }

  /**
   * Type for this item.
   * @return value or {@code null} for none
   */
  public java.lang.String getItemType() {
    return itemType;
  }

  /**
   * Type for this item.
   * @param itemType itemType or {@code null} for none
   */
  public Item setItemType(java.lang.String itemType) {
    this.itemType = itemType;
    return this;
  }

  /**
   * Metadata information.
   * @return value or {@code null} for none
   */
  public ItemMetadata getMetadata() {
    return metadata;
  }

  /**
   * Metadata information.
   * @param metadata metadata or {@code null} for none
   */
  public Item setMetadata(ItemMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Name of the Item. Format: datasources/{source_id}/items/{item_id} This is a required field. The
   * maximum length is 1536 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the Item. Format: datasources/{source_id}/items/{item_id} This is a required field. The
   * maximum length is 1536 characters.
   * @param name name or {@code null} for none
   */
  public Item setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Additional state connector can store for this item. The maximum length is 10000 bytes.
   * @see #decodePayload()
   * @return value or {@code null} for none
   */
  public java.lang.String getPayload() {
    return payload;
  }

  /**
   * Additional state connector can store for this item. The maximum length is 10000 bytes.
   * @see #getPayload()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodePayload() {
    return com.google.api.client.util.Base64.decodeBase64(payload);
  }

  /**
   * Additional state connector can store for this item. The maximum length is 10000 bytes.
   * @see #encodePayload()
   * @param payload payload or {@code null} for none
   */
  public Item setPayload(java.lang.String payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Additional state connector can store for this item. The maximum length is 10000 bytes.
   * @see #setPayload()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public Item encodePayload(byte[] payload) {
    this.payload = com.google.api.client.util.Base64.encodeBase64URLSafeString(payload);
    return this;
  }

  /**
   * Queue this item belongs to. The maximum length is 100 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getQueue() {
    return queue;
  }

  /**
   * Queue this item belongs to. The maximum length is 100 characters.
   * @param queue queue or {@code null} for none
   */
  public Item setQueue(java.lang.String queue) {
    this.queue = queue;
    return this;
  }

  /**
   * Status of the item. Output only field.
   * @return value or {@code null} for none
   */
  public ItemStatus getStatus() {
    return status;
  }

  /**
   * Status of the item. Output only field.
   * @param status status or {@code null} for none
   */
  public Item setStatus(ItemStatus status) {
    this.status = status;
    return this;
  }

  /**
   * The structured data for the item that should conform to a registered object definition in the
   * schema for the data source.
   * @return value or {@code null} for none
   */
  public ItemStructuredData getStructuredData() {
    return structuredData;
  }

  /**
   * The structured data for the item that should conform to a registered object definition in the
   * schema for the data source.
   * @param structuredData structuredData or {@code null} for none
   */
  public Item setStructuredData(ItemStructuredData structuredData) {
    this.structuredData = structuredData;
    return this;
  }

  /**
   * Required. The indexing system stores the version from the datasource as a byte string and
   * compares the Item version in the index to the version of the queued Item using lexical
   * ordering. Cloud Search Indexing won't index or delete any queued item with a version value that
   * is less than or equal to the version of the currently indexed item. The maximum length for this
   * field is 1024 bytes. See [this guide](https://developers.devsite.corp.google.com/cloud-
   * search/docs/guides/operations) to understand how item version affects reindexing after delete
   * item.
   * @see #decodeVersion()
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * Required. The indexing system stores the version from the datasource as a byte string and
   * compares the Item version in the index to the version of the queued Item using lexical
   * ordering. Cloud Search Indexing won't index or delete any queued item with a version value that
   * is less than or equal to the version of the currently indexed item. The maximum length for this
   * field is 1024 bytes. See [this guide](https://developers.devsite.corp.google.com/cloud-
   * search/docs/guides/operations) to understand how item version affects reindexing after delete
   * item.
   * @see #getVersion()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeVersion() {
    return com.google.api.client.util.Base64.decodeBase64(version);
  }

  /**
   * Required. The indexing system stores the version from the datasource as a byte string and
   * compares the Item version in the index to the version of the queued Item using lexical
   * ordering. Cloud Search Indexing won't index or delete any queued item with a version value that
   * is less than or equal to the version of the currently indexed item. The maximum length for this
   * field is 1024 bytes. See [this guide](https://developers.devsite.corp.google.com/cloud-
   * search/docs/guides/operations) to understand how item version affects reindexing after delete
   * item.
   * @see #encodeVersion()
   * @param version version or {@code null} for none
   */
  public Item setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  /**
   * Required. The indexing system stores the version from the datasource as a byte string and
   * compares the Item version in the index to the version of the queued Item using lexical
   * ordering. Cloud Search Indexing won't index or delete any queued item with a version value that
   * is less than or equal to the version of the currently indexed item. The maximum length for this
   * field is 1024 bytes. See [this guide](https://developers.devsite.corp.google.com/cloud-
   * search/docs/guides/operations) to understand how item version affects reindexing after delete
   * item.
   * @see #setVersion()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public Item encodeVersion(byte[] version) {
    this.version = com.google.api.client.util.Base64.encodeBase64URLSafeString(version);
    return this;
  }

  @Override
  public Item set(String fieldName, Object value) {
    return (Item) super.set(fieldName, value);
  }

  @Override
  public Item clone() {
    return (Item) super.clone();
  }

}
