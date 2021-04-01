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

package com.google.api.services.documentai.v1.model;

/**
 * The desired input location and metadata.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Document AI API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDocumentaiV1beta2InputConfig extends com.google.api.client.json.GenericJson {

  /**
   * Content in bytes, represented as a stream of bytes. Note: As with all `bytes` fields, proto
   * buffer messages use a pure binary representation, whereas JSON representations use base64. This
   * field only works for synchronous ProcessDocument method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contents;

  /**
   * The Google Cloud Storage location to read the input from. This must be a single file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta2GcsSource gcsSource;

  /**
   * Required. Mimetype of the input. Current supported mimetypes are application/pdf, image/tiff,
   * and image/gif. In addition, application/json type is supported for requests with
   * ProcessDocumentRequest.automl_params field set. The JSON file needs to be in Document format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mimeType;

  /**
   * Content in bytes, represented as a stream of bytes. Note: As with all `bytes` fields, proto
   * buffer messages use a pure binary representation, whereas JSON representations use base64. This
   * field only works for synchronous ProcessDocument method.
   * @see #decodeContents()
   * @return value or {@code null} for none
   */
  public java.lang.String getContents() {
    return contents;
  }

  /**
   * Content in bytes, represented as a stream of bytes. Note: As with all `bytes` fields, proto
   * buffer messages use a pure binary representation, whereas JSON representations use base64. This
   * field only works for synchronous ProcessDocument method.
   * @see #getContents()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeContents() {
    return com.google.api.client.util.Base64.decodeBase64(contents);
  }

  /**
   * Content in bytes, represented as a stream of bytes. Note: As with all `bytes` fields, proto
   * buffer messages use a pure binary representation, whereas JSON representations use base64. This
   * field only works for synchronous ProcessDocument method.
   * @see #encodeContents()
   * @param contents contents or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2InputConfig setContents(java.lang.String contents) {
    this.contents = contents;
    return this;
  }

  /**
   * Content in bytes, represented as a stream of bytes. Note: As with all `bytes` fields, proto
   * buffer messages use a pure binary representation, whereas JSON representations use base64. This
   * field only works for synchronous ProcessDocument method.
   * @see #setContents()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GoogleCloudDocumentaiV1beta2InputConfig encodeContents(byte[] contents) {
    this.contents = com.google.api.client.util.Base64.encodeBase64URLSafeString(contents);
    return this;
  }

  /**
   * The Google Cloud Storage location to read the input from. This must be a single file.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2GcsSource getGcsSource() {
    return gcsSource;
  }

  /**
   * The Google Cloud Storage location to read the input from. This must be a single file.
   * @param gcsSource gcsSource or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2InputConfig setGcsSource(GoogleCloudDocumentaiV1beta2GcsSource gcsSource) {
    this.gcsSource = gcsSource;
    return this;
  }

  /**
   * Required. Mimetype of the input. Current supported mimetypes are application/pdf, image/tiff,
   * and image/gif. In addition, application/json type is supported for requests with
   * ProcessDocumentRequest.automl_params field set. The JSON file needs to be in Document format.
   * @return value or {@code null} for none
   */
  public java.lang.String getMimeType() {
    return mimeType;
  }

  /**
   * Required. Mimetype of the input. Current supported mimetypes are application/pdf, image/tiff,
   * and image/gif. In addition, application/json type is supported for requests with
   * ProcessDocumentRequest.automl_params field set. The JSON file needs to be in Document format.
   * @param mimeType mimeType or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2InputConfig setMimeType(java.lang.String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1beta2InputConfig set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1beta2InputConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1beta2InputConfig clone() {
    return (GoogleCloudDocumentaiV1beta2InputConfig) super.clone();
  }

}