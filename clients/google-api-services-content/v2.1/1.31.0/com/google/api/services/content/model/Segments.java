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
 * Dimensions according to which metrics are segmented in the response. Values of product
 * dimensions, e.g., offer id, reflect the state of a product at the time of the corresponding
 * event, e.g., impression or order. Segment fields cannot be selected in queries without also
 * selecting at least one metric field. Values are only set for dimensions requested explicitly in
 * the request's search query.
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
public final class Segments extends com.google.api.client.json.GenericJson {

  /**
   * Brand of the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String brand;

  /**
   * [Product category (1st level)](https://developers.google.com/shopping-
   * content/guides/reports/segmentation#category_and_product_type) in Google's product taxonomy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String categoryL1;

  /**
   * [Product category (2nd level)](https://developers.google.com/shopping-
   * content/guides/reports/segmentation#category_and_product_type) in Google's product taxonomy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String categoryL2;

  /**
   * [Product category (3rd level)](https://developers.google.com/shopping-
   * content/guides/reports/segmentation#category_and_product_type) in Google's product taxonomy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String categoryL3;

  /**
   * [Product category (4th level)](https://developers.google.com/shopping-
   * content/guides/reports/segmentation#category_and_product_type) in Google's product taxonomy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String categoryL4;

  /**
   * [Product category (5th level)](https://developers.google.com/shopping-
   * content/guides/reports/segmentation#category_and_product_type) in Google's product taxonomy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String categoryL5;

  /**
   * Currency in which price metrics are represented, e.g., if you select
   * `ordered_item_sales_micros`, the returned value will be represented by this currency.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String currencyCode;

  /**
   * Custom label 0 for custom grouping of products.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customLabel0;

  /**
   * Custom label 1 for custom grouping of products.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customLabel1;

  /**
   * Custom label 2 for custom grouping of products.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customLabel2;

  /**
   * Custom label 3 for custom grouping of products.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customLabel3;

  /**
   * Custom label 4 for custom grouping of products.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customLabel4;

  /**
   * Date in the merchant timezone to which metrics apply.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Date date;

  /**
   * Merchant-provided id of the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String offerId;

  /**
   * [Product type (1st level)](https://developers.google.com/shopping-
   * content/guides/reports/segmentation#category_and_product_type) in merchant's own product
   * taxonomy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productTypeL1;

  /**
   * [Product type (2nd level)](https://developers.google.com/shopping-
   * content/guides/reports/segmentation#category_and_product_type) in merchant's own product
   * taxonomy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productTypeL2;

  /**
   * [Product type (3rd level)](https://developers.google.com/shopping-
   * content/guides/reports/segmentation#category_and_product_type) in merchant's own product
   * taxonomy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productTypeL3;

  /**
   * [Product type (4th level)](https://developers.google.com/shopping-
   * content/guides/reports/segmentation#category_and_product_type) in merchant's own product
   * taxonomy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productTypeL4;

  /**
   * [Product type (5th level)](https://developers.google.com/shopping-
   * content/guides/reports/segmentation#category_and_product_type) in merchant's own product
   * taxonomy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productTypeL5;

  /**
   * Program to which metrics apply, e.g., Free Product Listing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String program;

  /**
   * Title of the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * First day of the week (Monday) of the metrics date in the merchant timezone.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Date week;

  /**
   * Brand of the product.
   * @return value or {@code null} for none
   */
  public java.lang.String getBrand() {
    return brand;
  }

  /**
   * Brand of the product.
   * @param brand brand or {@code null} for none
   */
  public Segments setBrand(java.lang.String brand) {
    this.brand = brand;
    return this;
  }

  /**
   * [Product category (1st level)](https://developers.google.com/shopping-
   * content/guides/reports/segmentation#category_and_product_type) in Google's product taxonomy.
   * @return value or {@code null} for none
   */
  public java.lang.String getCategoryL1() {
    return categoryL1;
  }

  /**
   * [Product category (1st level)](https://developers.google.com/shopping-
   * content/guides/reports/segmentation#category_and_product_type) in Google's product taxonomy.
   * @param categoryL1 categoryL1 or {@code null} for none
   */
  public Segments setCategoryL1(java.lang.String categoryL1) {
    this.categoryL1 = categoryL1;
    return this;
  }

  /**
   * [Product category (2nd level)](https://developers.google.com/shopping-
   * content/guides/reports/segmentation#category_and_product_type) in Google's product taxonomy.
   * @return value or {@code null} for none
   */
  public java.lang.String getCategoryL2() {
    return categoryL2;
  }

  /**
   * [Product category (2nd level)](https://developers.google.com/shopping-
   * content/guides/reports/segmentation#category_and_product_type) in Google's product taxonomy.
   * @param categoryL2 categoryL2 or {@code null} for none
   */
  public Segments setCategoryL2(java.lang.String categoryL2) {
    this.categoryL2 = categoryL2;
    return this;
  }

  /**
   * [Product category (3rd level)](https://developers.google.com/shopping-
   * content/guides/reports/segmentation#category_and_product_type) in Google's product taxonomy.
   * @return value or {@code null} for none
   */
  public java.lang.String getCategoryL3() {
    return categoryL3;
  }

  /**
   * [Product category (3rd level)](https://developers.google.com/shopping-
   * content/guides/reports/segmentation#category_and_product_type) in Google's product taxonomy.
   * @param categoryL3 categoryL3 or {@code null} for none
   */
  public Segments setCategoryL3(java.lang.String categoryL3) {
    this.categoryL3 = categoryL3;
    return this;
  }

  /**
   * [Product category (4th level)](https://developers.google.com/shopping-
   * content/guides/reports/segmentation#category_and_product_type) in Google's product taxonomy.
   * @return value or {@code null} for none
   */
  public java.lang.String getCategoryL4() {
    return categoryL4;
  }

  /**
   * [Product category (4th level)](https://developers.google.com/shopping-
   * content/guides/reports/segmentation#category_and_product_type) in Google's product taxonomy.
   * @param categoryL4 categoryL4 or {@code null} for none
   */
  public Segments setCategoryL4(java.lang.String categoryL4) {
    this.categoryL4 = categoryL4;
    return this;
  }

  /**
   * [Product category (5th level)](https://developers.google.com/shopping-
   * content/guides/reports/segmentation#category_and_product_type) in Google's product taxonomy.
   * @return value or {@code null} for none
   */
  public java.lang.String getCategoryL5() {
    return categoryL5;
  }

  /**
   * [Product category (5th level)](https://developers.google.com/shopping-
   * content/guides/reports/segmentation#category_and_product_type) in Google's product taxonomy.
   * @param categoryL5 categoryL5 or {@code null} for none
   */
  public Segments setCategoryL5(java.lang.String categoryL5) {
    this.categoryL5 = categoryL5;
    return this;
  }

  /**
   * Currency in which price metrics are represented, e.g., if you select
   * `ordered_item_sales_micros`, the returned value will be represented by this currency.
   * @return value or {@code null} for none
   */
  public java.lang.String getCurrencyCode() {
    return currencyCode;
  }

  /**
   * Currency in which price metrics are represented, e.g., if you select
   * `ordered_item_sales_micros`, the returned value will be represented by this currency.
   * @param currencyCode currencyCode or {@code null} for none
   */
  public Segments setCurrencyCode(java.lang.String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Custom label 0 for custom grouping of products.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomLabel0() {
    return customLabel0;
  }

  /**
   * Custom label 0 for custom grouping of products.
   * @param customLabel0 customLabel0 or {@code null} for none
   */
  public Segments setCustomLabel0(java.lang.String customLabel0) {
    this.customLabel0 = customLabel0;
    return this;
  }

  /**
   * Custom label 1 for custom grouping of products.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomLabel1() {
    return customLabel1;
  }

  /**
   * Custom label 1 for custom grouping of products.
   * @param customLabel1 customLabel1 or {@code null} for none
   */
  public Segments setCustomLabel1(java.lang.String customLabel1) {
    this.customLabel1 = customLabel1;
    return this;
  }

  /**
   * Custom label 2 for custom grouping of products.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomLabel2() {
    return customLabel2;
  }

  /**
   * Custom label 2 for custom grouping of products.
   * @param customLabel2 customLabel2 or {@code null} for none
   */
  public Segments setCustomLabel2(java.lang.String customLabel2) {
    this.customLabel2 = customLabel2;
    return this;
  }

  /**
   * Custom label 3 for custom grouping of products.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomLabel3() {
    return customLabel3;
  }

  /**
   * Custom label 3 for custom grouping of products.
   * @param customLabel3 customLabel3 or {@code null} for none
   */
  public Segments setCustomLabel3(java.lang.String customLabel3) {
    this.customLabel3 = customLabel3;
    return this;
  }

  /**
   * Custom label 4 for custom grouping of products.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomLabel4() {
    return customLabel4;
  }

  /**
   * Custom label 4 for custom grouping of products.
   * @param customLabel4 customLabel4 or {@code null} for none
   */
  public Segments setCustomLabel4(java.lang.String customLabel4) {
    this.customLabel4 = customLabel4;
    return this;
  }

  /**
   * Date in the merchant timezone to which metrics apply.
   * @return value or {@code null} for none
   */
  public Date getDate() {
    return date;
  }

  /**
   * Date in the merchant timezone to which metrics apply.
   * @param date date or {@code null} for none
   */
  public Segments setDate(Date date) {
    this.date = date;
    return this;
  }

  /**
   * Merchant-provided id of the product.
   * @return value or {@code null} for none
   */
  public java.lang.String getOfferId() {
    return offerId;
  }

  /**
   * Merchant-provided id of the product.
   * @param offerId offerId or {@code null} for none
   */
  public Segments setOfferId(java.lang.String offerId) {
    this.offerId = offerId;
    return this;
  }

  /**
   * [Product type (1st level)](https://developers.google.com/shopping-
   * content/guides/reports/segmentation#category_and_product_type) in merchant's own product
   * taxonomy.
   * @return value or {@code null} for none
   */
  public java.lang.String getProductTypeL1() {
    return productTypeL1;
  }

  /**
   * [Product type (1st level)](https://developers.google.com/shopping-
   * content/guides/reports/segmentation#category_and_product_type) in merchant's own product
   * taxonomy.
   * @param productTypeL1 productTypeL1 or {@code null} for none
   */
  public Segments setProductTypeL1(java.lang.String productTypeL1) {
    this.productTypeL1 = productTypeL1;
    return this;
  }

  /**
   * [Product type (2nd level)](https://developers.google.com/shopping-
   * content/guides/reports/segmentation#category_and_product_type) in merchant's own product
   * taxonomy.
   * @return value or {@code null} for none
   */
  public java.lang.String getProductTypeL2() {
    return productTypeL2;
  }

  /**
   * [Product type (2nd level)](https://developers.google.com/shopping-
   * content/guides/reports/segmentation#category_and_product_type) in merchant's own product
   * taxonomy.
   * @param productTypeL2 productTypeL2 or {@code null} for none
   */
  public Segments setProductTypeL2(java.lang.String productTypeL2) {
    this.productTypeL2 = productTypeL2;
    return this;
  }

  /**
   * [Product type (3rd level)](https://developers.google.com/shopping-
   * content/guides/reports/segmentation#category_and_product_type) in merchant's own product
   * taxonomy.
   * @return value or {@code null} for none
   */
  public java.lang.String getProductTypeL3() {
    return productTypeL3;
  }

  /**
   * [Product type (3rd level)](https://developers.google.com/shopping-
   * content/guides/reports/segmentation#category_and_product_type) in merchant's own product
   * taxonomy.
   * @param productTypeL3 productTypeL3 or {@code null} for none
   */
  public Segments setProductTypeL3(java.lang.String productTypeL3) {
    this.productTypeL3 = productTypeL3;
    return this;
  }

  /**
   * [Product type (4th level)](https://developers.google.com/shopping-
   * content/guides/reports/segmentation#category_and_product_type) in merchant's own product
   * taxonomy.
   * @return value or {@code null} for none
   */
  public java.lang.String getProductTypeL4() {
    return productTypeL4;
  }

  /**
   * [Product type (4th level)](https://developers.google.com/shopping-
   * content/guides/reports/segmentation#category_and_product_type) in merchant's own product
   * taxonomy.
   * @param productTypeL4 productTypeL4 or {@code null} for none
   */
  public Segments setProductTypeL4(java.lang.String productTypeL4) {
    this.productTypeL4 = productTypeL4;
    return this;
  }

  /**
   * [Product type (5th level)](https://developers.google.com/shopping-
   * content/guides/reports/segmentation#category_and_product_type) in merchant's own product
   * taxonomy.
   * @return value or {@code null} for none
   */
  public java.lang.String getProductTypeL5() {
    return productTypeL5;
  }

  /**
   * [Product type (5th level)](https://developers.google.com/shopping-
   * content/guides/reports/segmentation#category_and_product_type) in merchant's own product
   * taxonomy.
   * @param productTypeL5 productTypeL5 or {@code null} for none
   */
  public Segments setProductTypeL5(java.lang.String productTypeL5) {
    this.productTypeL5 = productTypeL5;
    return this;
  }

  /**
   * Program to which metrics apply, e.g., Free Product Listing.
   * @return value or {@code null} for none
   */
  public java.lang.String getProgram() {
    return program;
  }

  /**
   * Program to which metrics apply, e.g., Free Product Listing.
   * @param program program or {@code null} for none
   */
  public Segments setProgram(java.lang.String program) {
    this.program = program;
    return this;
  }

  /**
   * Title of the product.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Title of the product.
   * @param title title or {@code null} for none
   */
  public Segments setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * First day of the week (Monday) of the metrics date in the merchant timezone.
   * @return value or {@code null} for none
   */
  public Date getWeek() {
    return week;
  }

  /**
   * First day of the week (Monday) of the metrics date in the merchant timezone.
   * @param week week or {@code null} for none
   */
  public Segments setWeek(Date week) {
    this.week = week;
    return this;
  }

  @Override
  public Segments set(String fieldName, Object value) {
    return (Segments) super.set(fieldName, value);
  }

  @Override
  public Segments clone() {
    return (Segments) super.clone();
  }

}
