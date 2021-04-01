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

package com.google.api.services.ondemandscanning.v1.model;

/**
 * Details on how a particular software package was installed on a system.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the On-Demand Scanning API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PackageOccurrence extends com.google.api.client.json.GenericJson {

  /**
   * Required. All of the places within the filesystem versions of this package have been found.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Location> location;

  static {
    // hack to force ProGuard to consider Location used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Location.class);
  }

  /**
   * Output only. The name of the installed package.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. All of the places within the filesystem versions of this package have been found.
   * @return value or {@code null} for none
   */
  public java.util.List<Location> getLocation() {
    return location;
  }

  /**
   * Required. All of the places within the filesystem versions of this package have been found.
   * @param location location or {@code null} for none
   */
  public PackageOccurrence setLocation(java.util.List<Location> location) {
    this.location = location;
    return this;
  }

  /**
   * Output only. The name of the installed package.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The name of the installed package.
   * @param name name or {@code null} for none
   */
  public PackageOccurrence setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public PackageOccurrence set(String fieldName, Object value) {
    return (PackageOccurrence) super.set(fieldName, value);
  }

  @Override
  public PackageOccurrence clone() {
    return (PackageOccurrence) super.clone();
  }

}