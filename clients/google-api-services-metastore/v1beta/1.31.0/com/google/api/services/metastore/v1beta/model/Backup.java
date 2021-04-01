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

package com.google.api.services.metastore.v1beta.model;

/**
 * The details of a backup resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataproc Metastore API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Backup extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The time when the backup was started.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The description of the backup.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Output only. The time when the backup finished creating.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Immutable. The relative resource name of the backup, in the following form:projects/{project_nu
   * mber}/locations/{location_id}/services/{service_id}/backups/{backup_id}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The revision of the service at the time of backup.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Service serviceRevision;

  /**
   * Output only. The current state of the backup.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. The time when the backup was started.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time when the backup was started.
   * @param createTime createTime or {@code null} for none
   */
  public Backup setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The description of the backup.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The description of the backup.
   * @param description description or {@code null} for none
   */
  public Backup setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Output only. The time when the backup finished creating.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * Output only. The time when the backup finished creating.
   * @param endTime endTime or {@code null} for none
   */
  public Backup setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Immutable. The relative resource name of the backup, in the following form:projects/{project_nu
   * mber}/locations/{location_id}/services/{service_id}/backups/{backup_id}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Immutable. The relative resource name of the backup, in the following form:projects/{project_nu
   * mber}/locations/{location_id}/services/{service_id}/backups/{backup_id}
   * @param name name or {@code null} for none
   */
  public Backup setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The revision of the service at the time of backup.
   * @return value or {@code null} for none
   */
  public Service getServiceRevision() {
    return serviceRevision;
  }

  /**
   * Output only. The revision of the service at the time of backup.
   * @param serviceRevision serviceRevision or {@code null} for none
   */
  public Backup setServiceRevision(Service serviceRevision) {
    this.serviceRevision = serviceRevision;
    return this;
  }

  /**
   * Output only. The current state of the backup.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The current state of the backup.
   * @param state state or {@code null} for none
   */
  public Backup setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public Backup set(String fieldName, Object value) {
    return (Backup) super.set(fieldName, value);
  }

  @Override
  public Backup clone() {
    return (Backup) super.clone();
  }

}