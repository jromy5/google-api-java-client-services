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

package com.google.api.services.mybusinesslodging.v1;

/**
 * Service definition for MyBusinessLodging (v1).
 *
 * <p>
 * The My Business Lodging API enables managing lodging business information on Google.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://developers.google.com/my-business/" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link MyBusinessLodgingRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class MyBusinessLodging extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        (com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 32 ||
        (com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION == 31 &&
        com.google.api.client.googleapis.GoogleUtils.BUGFIX_VERSION >= 1)),
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.31.1 of google-api-client to run version " +
        "1.31.0 of the My Business Lodging API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://mybusinesslodging.googleapis.com/";

  /**
   * The default encoded mTLS root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.31
   */
  public static final String DEFAULT_MTLS_ROOT_URL = "https://mybusinesslodging.mtls.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public MyBusinessLodging(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  MyBusinessLodging(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Locations collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code MyBusinessLodging mybusinesslodging = new MyBusinessLodging(...);}
   *   {@code MyBusinessLodging.Locations.List request = mybusinesslodging.locations().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Locations locations() {
    return new Locations();
  }

  /**
   * The "locations" collection of methods.
   */
  public class Locations {

    /**
     * Returns the Lodging of a specific location.
     *
     * Create a request for the method "locations.getLodging".
     *
     * This request holds the parameters needed by the mybusinesslodging server.  After setting any
     * optional parameters, call the {@link GetLodging#execute()} method to invoke the remote operation.
     *
     * @param name Required. Google identifier for this location in the form: `locations/{location_id}/lodging`
     * @return the request
     */
    public GetLodging getLodging(java.lang.String name) throws java.io.IOException {
      GetLodging result = new GetLodging(name);
      initialize(result);
      return result;
    }

    public class GetLodging extends MyBusinessLodgingRequest<com.google.api.services.mybusinesslodging.v1.model.Lodging> {

      private static final String REST_PATH = "v1/{+name}";

      private final java.util.regex.Pattern NAME_PATTERN =
          java.util.regex.Pattern.compile("^locations/[^/]+/lodging$");

      /**
       * Returns the Lodging of a specific location.
       *
       * Create a request for the method "locations.getLodging".
       *
       * This request holds the parameters needed by the the mybusinesslodging server.  After setting
       * any optional parameters, call the {@link GetLodging#execute()} method to invoke the remote
       * operation. <p> {@link
       * GetLodging#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param name Required. Google identifier for this location in the form: `locations/{location_id}/lodging`
       * @since 1.13
       */
      protected GetLodging(java.lang.String name) {
        super(MyBusinessLodging.this, "GET", REST_PATH, null, com.google.api.services.mybusinesslodging.v1.model.Lodging.class);
        this.name = com.google.api.client.util.Preconditions.checkNotNull(name, "Required parameter name must be specified.");
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
              "Parameter name must conform to the pattern " +
              "^locations/[^/]+/lodging$");
        }
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public GetLodging set$Xgafv(java.lang.String $Xgafv) {
        return (GetLodging) super.set$Xgafv($Xgafv);
      }

      @Override
      public GetLodging setAccessToken(java.lang.String accessToken) {
        return (GetLodging) super.setAccessToken(accessToken);
      }

      @Override
      public GetLodging setAlt(java.lang.String alt) {
        return (GetLodging) super.setAlt(alt);
      }

      @Override
      public GetLodging setCallback(java.lang.String callback) {
        return (GetLodging) super.setCallback(callback);
      }

      @Override
      public GetLodging setFields(java.lang.String fields) {
        return (GetLodging) super.setFields(fields);
      }

      @Override
      public GetLodging setKey(java.lang.String key) {
        return (GetLodging) super.setKey(key);
      }

      @Override
      public GetLodging setOauthToken(java.lang.String oauthToken) {
        return (GetLodging) super.setOauthToken(oauthToken);
      }

      @Override
      public GetLodging setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (GetLodging) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public GetLodging setQuotaUser(java.lang.String quotaUser) {
        return (GetLodging) super.setQuotaUser(quotaUser);
      }

      @Override
      public GetLodging setUploadType(java.lang.String uploadType) {
        return (GetLodging) super.setUploadType(uploadType);
      }

      @Override
      public GetLodging setUploadProtocol(java.lang.String uploadProtocol) {
        return (GetLodging) super.setUploadProtocol(uploadProtocol);
      }

      /**
       * Required. Google identifier for this location in the form:
       * `locations/{location_id}/lodging`
       */
      @com.google.api.client.util.Key
      private java.lang.String name;

      /** Required. Google identifier for this location in the form: `locations/{location_id}/lodging`
       */
      public java.lang.String getName() {
        return name;
      }

      /**
       * Required. Google identifier for this location in the form:
       * `locations/{location_id}/lodging`
       */
      public GetLodging setName(java.lang.String name) {
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
              "Parameter name must conform to the pattern " +
              "^locations/[^/]+/lodging$");
        }
        this.name = name;
        return this;
      }

      /**
       * Required. The specific fields to return. Use "*" to include all fields. Repeated field
       * items cannot be individually specified.
       */
      @com.google.api.client.util.Key
      private String readMask;

      /** Required. The specific fields to return. Use "*" to include all fields. Repeated field items cannot
     be individually specified.
       */
      public String getReadMask() {
        return readMask;
      }

      /**
       * Required. The specific fields to return. Use "*" to include all fields. Repeated field
       * items cannot be individually specified.
       */
      public GetLodging setReadMask(String readMask) {
        this.readMask = readMask;
        return this;
      }

      @Override
      public GetLodging set(String parameterName, Object value) {
        return (GetLodging) super.set(parameterName, value);
      }
    }
    /**
     * Updates the Lodging of a specific location.
     *
     * Create a request for the method "locations.updateLodging".
     *
     * This request holds the parameters needed by the mybusinesslodging server.  After setting any
     * optional parameters, call the {@link UpdateLodging#execute()} method to invoke the remote
     * operation.
     *
     * @param name Required. Google identifier for this location in the form: `locations/{location_id}/lodging`
     * @param content the {@link com.google.api.services.mybusinesslodging.v1.model.Lodging}
     * @return the request
     */
    public UpdateLodging updateLodging(java.lang.String name, com.google.api.services.mybusinesslodging.v1.model.Lodging content) throws java.io.IOException {
      UpdateLodging result = new UpdateLodging(name, content);
      initialize(result);
      return result;
    }

    public class UpdateLodging extends MyBusinessLodgingRequest<com.google.api.services.mybusinesslodging.v1.model.Lodging> {

      private static final String REST_PATH = "v1/{+name}";

      private final java.util.regex.Pattern NAME_PATTERN =
          java.util.regex.Pattern.compile("^locations/[^/]+/lodging$");

      /**
       * Updates the Lodging of a specific location.
       *
       * Create a request for the method "locations.updateLodging".
       *
       * This request holds the parameters needed by the the mybusinesslodging server.  After setting
       * any optional parameters, call the {@link UpdateLodging#execute()} method to invoke the remote
       * operation. <p> {@link UpdateLodging#initialize(com.google.api.client.googleapis.services.Abstra
       * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
       * the constructor. </p>
       *
       * @param name Required. Google identifier for this location in the form: `locations/{location_id}/lodging`
       * @param content the {@link com.google.api.services.mybusinesslodging.v1.model.Lodging}
       * @since 1.13
       */
      protected UpdateLodging(java.lang.String name, com.google.api.services.mybusinesslodging.v1.model.Lodging content) {
        super(MyBusinessLodging.this, "PATCH", REST_PATH, content, com.google.api.services.mybusinesslodging.v1.model.Lodging.class);
        this.name = com.google.api.client.util.Preconditions.checkNotNull(name, "Required parameter name must be specified.");
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
              "Parameter name must conform to the pattern " +
              "^locations/[^/]+/lodging$");
        }
      }

      @Override
      public UpdateLodging set$Xgafv(java.lang.String $Xgafv) {
        return (UpdateLodging) super.set$Xgafv($Xgafv);
      }

      @Override
      public UpdateLodging setAccessToken(java.lang.String accessToken) {
        return (UpdateLodging) super.setAccessToken(accessToken);
      }

      @Override
      public UpdateLodging setAlt(java.lang.String alt) {
        return (UpdateLodging) super.setAlt(alt);
      }

      @Override
      public UpdateLodging setCallback(java.lang.String callback) {
        return (UpdateLodging) super.setCallback(callback);
      }

      @Override
      public UpdateLodging setFields(java.lang.String fields) {
        return (UpdateLodging) super.setFields(fields);
      }

      @Override
      public UpdateLodging setKey(java.lang.String key) {
        return (UpdateLodging) super.setKey(key);
      }

      @Override
      public UpdateLodging setOauthToken(java.lang.String oauthToken) {
        return (UpdateLodging) super.setOauthToken(oauthToken);
      }

      @Override
      public UpdateLodging setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (UpdateLodging) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public UpdateLodging setQuotaUser(java.lang.String quotaUser) {
        return (UpdateLodging) super.setQuotaUser(quotaUser);
      }

      @Override
      public UpdateLodging setUploadType(java.lang.String uploadType) {
        return (UpdateLodging) super.setUploadType(uploadType);
      }

      @Override
      public UpdateLodging setUploadProtocol(java.lang.String uploadProtocol) {
        return (UpdateLodging) super.setUploadProtocol(uploadProtocol);
      }

      /**
       * Required. Google identifier for this location in the form:
       * `locations/{location_id}/lodging`
       */
      @com.google.api.client.util.Key
      private java.lang.String name;

      /** Required. Google identifier for this location in the form: `locations/{location_id}/lodging`
       */
      public java.lang.String getName() {
        return name;
      }

      /**
       * Required. Google identifier for this location in the form:
       * `locations/{location_id}/lodging`
       */
      public UpdateLodging setName(java.lang.String name) {
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
              "Parameter name must conform to the pattern " +
              "^locations/[^/]+/lodging$");
        }
        this.name = name;
        return this;
      }

      /**
       * Required. The specific fields to update. Use "*" to update all fields, which may include
       * unsetting empty fields in the request. Repeated field items cannot be individually updated.
       */
      @com.google.api.client.util.Key
      private String updateMask;

      /** Required. The specific fields to update. Use "*" to update all fields, which may include unsetting
     empty fields in the request. Repeated field items cannot be individually updated.
       */
      public String getUpdateMask() {
        return updateMask;
      }

      /**
       * Required. The specific fields to update. Use "*" to update all fields, which may include
       * unsetting empty fields in the request. Repeated field items cannot be individually updated.
       */
      public UpdateLodging setUpdateMask(String updateMask) {
        this.updateMask = updateMask;
        return this;
      }

      @Override
      public UpdateLodging set(String parameterName, Object value) {
        return (UpdateLodging) super.set(parameterName, value);
      }
    }

    /**
     * An accessor for creating requests from the Lodging collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code MyBusinessLodging mybusinesslodging = new MyBusinessLodging(...);}
     *   {@code MyBusinessLodging.Lodging.List request = mybusinesslodging.lodging().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Lodging lodging() {
      return new Lodging();
    }

    /**
     * The "lodging" collection of methods.
     */
    public class Lodging {

      /**
       * Returns the Google updated Lodging of a specific location.
       *
       * Create a request for the method "lodging.getGoogleUpdated".
       *
       * This request holds the parameters needed by the mybusinesslodging server.  After setting any
       * optional parameters, call the {@link GetGoogleUpdated#execute()} method to invoke the remote
       * operation.
       *
       * @param name Required. Google identifier for this location in the form:
       *        `accounts/{account_id}/locations/{location_id}/lodging`
       * @return the request
       */
      public GetGoogleUpdated getGoogleUpdated(java.lang.String name) throws java.io.IOException {
        GetGoogleUpdated result = new GetGoogleUpdated(name);
        initialize(result);
        return result;
      }

      public class GetGoogleUpdated extends MyBusinessLodgingRequest<com.google.api.services.mybusinesslodging.v1.model.GetGoogleUpdatedLodgingResponse> {

        private static final String REST_PATH = "v1/{+name}:getGoogleUpdated";

        private final java.util.regex.Pattern NAME_PATTERN =
            java.util.regex.Pattern.compile("^locations/[^/]+/lodging$");

        /**
         * Returns the Google updated Lodging of a specific location.
         *
         * Create a request for the method "lodging.getGoogleUpdated".
         *
         * This request holds the parameters needed by the the mybusinesslodging server.  After setting
         * any optional parameters, call the {@link GetGoogleUpdated#execute()} method to invoke the
         * remote operation. <p> {@link GetGoogleUpdated#initialize(com.google.api.client.googleapis.servi
         * ces.AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
         * invoking the constructor. </p>
         *
         * @param name Required. Google identifier for this location in the form:
       *        `accounts/{account_id}/locations/{location_id}/lodging`
         * @since 1.13
         */
        protected GetGoogleUpdated(java.lang.String name) {
          super(MyBusinessLodging.this, "GET", REST_PATH, null, com.google.api.services.mybusinesslodging.v1.model.GetGoogleUpdatedLodgingResponse.class);
          this.name = com.google.api.client.util.Preconditions.checkNotNull(name, "Required parameter name must be specified.");
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
                "Parameter name must conform to the pattern " +
                "^locations/[^/]+/lodging$");
          }
        }

        @Override
        public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
          return super.executeUsingHead();
        }

        @Override
        public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
          return super.buildHttpRequestUsingHead();
        }

        @Override
        public GetGoogleUpdated set$Xgafv(java.lang.String $Xgafv) {
          return (GetGoogleUpdated) super.set$Xgafv($Xgafv);
        }

        @Override
        public GetGoogleUpdated setAccessToken(java.lang.String accessToken) {
          return (GetGoogleUpdated) super.setAccessToken(accessToken);
        }

        @Override
        public GetGoogleUpdated setAlt(java.lang.String alt) {
          return (GetGoogleUpdated) super.setAlt(alt);
        }

        @Override
        public GetGoogleUpdated setCallback(java.lang.String callback) {
          return (GetGoogleUpdated) super.setCallback(callback);
        }

        @Override
        public GetGoogleUpdated setFields(java.lang.String fields) {
          return (GetGoogleUpdated) super.setFields(fields);
        }

        @Override
        public GetGoogleUpdated setKey(java.lang.String key) {
          return (GetGoogleUpdated) super.setKey(key);
        }

        @Override
        public GetGoogleUpdated setOauthToken(java.lang.String oauthToken) {
          return (GetGoogleUpdated) super.setOauthToken(oauthToken);
        }

        @Override
        public GetGoogleUpdated setPrettyPrint(java.lang.Boolean prettyPrint) {
          return (GetGoogleUpdated) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public GetGoogleUpdated setQuotaUser(java.lang.String quotaUser) {
          return (GetGoogleUpdated) super.setQuotaUser(quotaUser);
        }

        @Override
        public GetGoogleUpdated setUploadType(java.lang.String uploadType) {
          return (GetGoogleUpdated) super.setUploadType(uploadType);
        }

        @Override
        public GetGoogleUpdated setUploadProtocol(java.lang.String uploadProtocol) {
          return (GetGoogleUpdated) super.setUploadProtocol(uploadProtocol);
        }

        /**
         * Required. Google identifier for this location in the form:
         * `accounts/{account_id}/locations/{location_id}/lodging`
         */
        @com.google.api.client.util.Key
        private java.lang.String name;

        /** Required. Google identifier for this location in the form:
       `accounts/{account_id}/locations/{location_id}/lodging`
         */
        public java.lang.String getName() {
          return name;
        }

        /**
         * Required. Google identifier for this location in the form:
         * `accounts/{account_id}/locations/{location_id}/lodging`
         */
        public GetGoogleUpdated setName(java.lang.String name) {
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
                "Parameter name must conform to the pattern " +
                "^locations/[^/]+/lodging$");
          }
          this.name = name;
          return this;
        }

        /**
         * Required. The specific fields to return. Use "*" to include all fields. Repeated field
         * items cannot be individually specified.
         */
        @com.google.api.client.util.Key
        private String readMask;

        /** Required. The specific fields to return. Use "*" to include all fields. Repeated field items cannot
       be individually specified.
         */
        public String getReadMask() {
          return readMask;
        }

        /**
         * Required. The specific fields to return. Use "*" to include all fields. Repeated field
         * items cannot be individually specified.
         */
        public GetGoogleUpdated setReadMask(String readMask) {
          this.readMask = readMask;
          return this;
        }

        @Override
        public GetGoogleUpdated set(String parameterName, Object value) {
          return (GetGoogleUpdated) super.set(parameterName, value);
        }
      }

    }
  }

  /**
   * Builder for {@link MyBusinessLodging}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    private static String chooseEndpoint(com.google.api.client.http.HttpTransport transport) {
      // If the GOOGLE_API_USE_MTLS_ENDPOINT environment variable value is "always", use mTLS endpoint.
      // If the env variable is "auto", use mTLS endpoint if and only if the transport is mTLS.
      // Use the regular endpoint for all other cases.
      String useMtlsEndpoint = System.getenv("GOOGLE_API_USE_MTLS_ENDPOINT");
      useMtlsEndpoint = useMtlsEndpoint == null ? "auto" : useMtlsEndpoint;
      if ("always".equals(useMtlsEndpoint) || ("auto".equals(useMtlsEndpoint) && transport != null && transport.isMtls())) {
        return DEFAULT_MTLS_ROOT_URL;
      }
      return DEFAULT_ROOT_URL;
    }

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          Builder.chooseEndpoint(transport),
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link MyBusinessLodging}. */
    @Override
    public MyBusinessLodging build() {
      return new MyBusinessLodging(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link MyBusinessLodgingRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setMyBusinessLodgingRequestInitializer(
        MyBusinessLodgingRequestInitializer mybusinesslodgingRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(mybusinesslodgingRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}