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
 * Search application level query stats per date
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SearchApplicationQueryStats extends com.google.api.client.json.GenericJson {

  /**
   * Date for which query stats were calculated. Stats calculated on the next day close to midnight
   * are returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Date date;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<QueryCountByStatus> queryCountByStatus;

  static {
    // hack to force ProGuard to consider QueryCountByStatus used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(QueryCountByStatus.class);
  }

  /**
   * Date for which query stats were calculated. Stats calculated on the next day close to midnight
   * are returned.
   * @return value or {@code null} for none
   */
  public Date getDate() {
    return date;
  }

  /**
   * Date for which query stats were calculated. Stats calculated on the next day close to midnight
   * are returned.
   * @param date date or {@code null} for none
   */
  public SearchApplicationQueryStats setDate(Date date) {
    this.date = date;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<QueryCountByStatus> getQueryCountByStatus() {
    return queryCountByStatus;
  }

  /**
   * @param queryCountByStatus queryCountByStatus or {@code null} for none
   */
  public SearchApplicationQueryStats setQueryCountByStatus(java.util.List<QueryCountByStatus> queryCountByStatus) {
    this.queryCountByStatus = queryCountByStatus;
    return this;
  }

  @Override
  public SearchApplicationQueryStats set(String fieldName, Object value) {
    return (SearchApplicationQueryStats) super.set(fieldName, value);
  }

  @Override
  public SearchApplicationQueryStats clone() {
    return (SearchApplicationQueryStats) super.clone();
  }

}
