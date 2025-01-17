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

package com.google.api.services.content.model;

/**
 * Model definition for DatafeedTarget.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DatafeedTarget extends com.google.api.client.json.GenericJson {

  /**
   * The country where the items in the feed will be included in the search index, represented as a
   * CLDR territory code.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String country;

  /**
   * The list of destinations to exclude for this target (corresponds to unchecked check boxes in
   * Merchant Center).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> excludedDestinations;

  /**
   * The list of destinations to include for this target (corresponds to checked check boxes in
   * Merchant Center). Default destinations are always included unless provided in
   * `excludedDestinations`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> includedDestinations;

  /**
   * The two-letter ISO 639-1 language of the items in the feed. Must be a valid language for
   * `targets[].country`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String language;

  /**
   * The country where the items in the feed will be included in the search index, represented as a
   * CLDR territory code.
   * @return value or {@code null} for none
   */
  public java.lang.String getCountry() {
    return country;
  }

  /**
   * The country where the items in the feed will be included in the search index, represented as a
   * CLDR territory code.
   * @param country country or {@code null} for none
   */
  public DatafeedTarget setCountry(java.lang.String country) {
    this.country = country;
    return this;
  }

  /**
   * The list of destinations to exclude for this target (corresponds to unchecked check boxes in
   * Merchant Center).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExcludedDestinations() {
    return excludedDestinations;
  }

  /**
   * The list of destinations to exclude for this target (corresponds to unchecked check boxes in
   * Merchant Center).
   * @param excludedDestinations excludedDestinations or {@code null} for none
   */
  public DatafeedTarget setExcludedDestinations(java.util.List<java.lang.String> excludedDestinations) {
    this.excludedDestinations = excludedDestinations;
    return this;
  }

  /**
   * The list of destinations to include for this target (corresponds to checked check boxes in
   * Merchant Center). Default destinations are always included unless provided in
   * `excludedDestinations`.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getIncludedDestinations() {
    return includedDestinations;
  }

  /**
   * The list of destinations to include for this target (corresponds to checked check boxes in
   * Merchant Center). Default destinations are always included unless provided in
   * `excludedDestinations`.
   * @param includedDestinations includedDestinations or {@code null} for none
   */
  public DatafeedTarget setIncludedDestinations(java.util.List<java.lang.String> includedDestinations) {
    this.includedDestinations = includedDestinations;
    return this;
  }

  /**
   * The two-letter ISO 639-1 language of the items in the feed. Must be a valid language for
   * `targets[].country`.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguage() {
    return language;
  }

  /**
   * The two-letter ISO 639-1 language of the items in the feed. Must be a valid language for
   * `targets[].country`.
   * @param language language or {@code null} for none
   */
  public DatafeedTarget setLanguage(java.lang.String language) {
    this.language = language;
    return this;
  }

  @Override
  public DatafeedTarget set(String fieldName, Object value) {
    return (DatafeedTarget) super.set(fieldName, value);
  }

  @Override
  public DatafeedTarget clone() {
    return (DatafeedTarget) super.clone();
  }

}
