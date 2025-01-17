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

package com.google.api.services.dataproc.model;

/**
 * A configuration for running Apache Spark SQL (http://spark.apache.org/sql/) queries as a batch
 * workload.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SparkSqlBatch extends com.google.api.client.json.GenericJson {

  /**
   * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> jarFileUris;

  /**
   * Required. The HCFS URI of the script that contains Spark SQL queries to execute.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String queryFileUri;

  /**
   * Optional. Mapping of query variable names to values (equivalent to the Spark SQL command: SET
   * name="value";).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> queryVariables;

  /**
   * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getJarFileUris() {
    return jarFileUris;
  }

  /**
   * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
   * @param jarFileUris jarFileUris or {@code null} for none
   */
  public SparkSqlBatch setJarFileUris(java.util.List<java.lang.String> jarFileUris) {
    this.jarFileUris = jarFileUris;
    return this;
  }

  /**
   * Required. The HCFS URI of the script that contains Spark SQL queries to execute.
   * @return value or {@code null} for none
   */
  public java.lang.String getQueryFileUri() {
    return queryFileUri;
  }

  /**
   * Required. The HCFS URI of the script that contains Spark SQL queries to execute.
   * @param queryFileUri queryFileUri or {@code null} for none
   */
  public SparkSqlBatch setQueryFileUri(java.lang.String queryFileUri) {
    this.queryFileUri = queryFileUri;
    return this;
  }

  /**
   * Optional. Mapping of query variable names to values (equivalent to the Spark SQL command: SET
   * name="value";).
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getQueryVariables() {
    return queryVariables;
  }

  /**
   * Optional. Mapping of query variable names to values (equivalent to the Spark SQL command: SET
   * name="value";).
   * @param queryVariables queryVariables or {@code null} for none
   */
  public SparkSqlBatch setQueryVariables(java.util.Map<String, java.lang.String> queryVariables) {
    this.queryVariables = queryVariables;
    return this;
  }

  @Override
  public SparkSqlBatch set(String fieldName, Object value) {
    return (SparkSqlBatch) super.set(fieldName, value);
  }

  @Override
  public SparkSqlBatch clone() {
    return (SparkSqlBatch) super.clone();
  }

}
