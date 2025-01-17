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

package com.google.api.services.androidpublisher.model;

/**
 * A user resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Android Developer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class User extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The state of the user's access to the Play Console.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accessState;

  /**
   * Permissions for the user which apply across the developer account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> developerAccountPermissions;

  /**
   * Immutable. The user's email address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * The time at which the user's access expires, if set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String expirationTime;

  /**
   * Output only. Per-app permissions for the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Grant> grants;

  static {
    // hack to force ProGuard to consider Grant used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Grant.class);
  }

  /**
   * Required. Resource name for this user, following the pattern
   * "developers/{developer}/users/{email}".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Whether there are more permissions for the user that are not represented here.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean partial;

  /**
   * Output only. The state of the user's access to the Play Console.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccessState() {
    return accessState;
  }

  /**
   * Output only. The state of the user's access to the Play Console.
   * @param accessState accessState or {@code null} for none
   */
  public User setAccessState(java.lang.String accessState) {
    this.accessState = accessState;
    return this;
  }

  /**
   * Permissions for the user which apply across the developer account.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDeveloperAccountPermissions() {
    return developerAccountPermissions;
  }

  /**
   * Permissions for the user which apply across the developer account.
   * @param developerAccountPermissions developerAccountPermissions or {@code null} for none
   */
  public User setDeveloperAccountPermissions(java.util.List<java.lang.String> developerAccountPermissions) {
    this.developerAccountPermissions = developerAccountPermissions;
    return this;
  }

  /**
   * Immutable. The user's email address.
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * Immutable. The user's email address.
   * @param email email or {@code null} for none
   */
  public User setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * The time at which the user's access expires, if set.
   * @return value or {@code null} for none
   */
  public String getExpirationTime() {
    return expirationTime;
  }

  /**
   * The time at which the user's access expires, if set.
   * @param expirationTime expirationTime or {@code null} for none
   */
  public User setExpirationTime(String expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

  /**
   * Output only. Per-app permissions for the user.
   * @return value or {@code null} for none
   */
  public java.util.List<Grant> getGrants() {
    return grants;
  }

  /**
   * Output only. Per-app permissions for the user.
   * @param grants grants or {@code null} for none
   */
  public User setGrants(java.util.List<Grant> grants) {
    this.grants = grants;
    return this;
  }

  /**
   * Required. Resource name for this user, following the pattern
   * "developers/{developer}/users/{email}".
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. Resource name for this user, following the pattern
   * "developers/{developer}/users/{email}".
   * @param name name or {@code null} for none
   */
  public User setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Whether there are more permissions for the user that are not represented here.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPartial() {
    return partial;
  }

  /**
   * Output only. Whether there are more permissions for the user that are not represented here.
   * @param partial partial or {@code null} for none
   */
  public User setPartial(java.lang.Boolean partial) {
    this.partial = partial;
    return this;
  }

  @Override
  public User set(String fieldName, Object value) {
    return (User) super.set(fieldName, value);
  }

  @Override
  public User clone() {
    return (User) super.clone();
  }

}
