package com.nango.api.client.sync.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = NangoSyncConfig.Builder.class
)
public final class NangoSyncConfig {
  private final Optional<String> baseUrl;

  private final NangoHttpMethod method;

  private final Map<String, Object> headers;

  private final Object body;

  private final Map<String, Object> queryParams;

  private final Optional<String> uniqueKey;

  private final Optional<String> responsePath;

  private final Optional<String> pagingCursorRequestPath;

  private final Optional<String> pagingCursorMetadataResponsePath;

  private final Optional<String> pagingCursorObjectResponsePath;

  private final Optional<String> pagingUrlPath;

  private final Optional<String> pagingHeaderLinkRel;

  private final Optional<Boolean> autoMapping;

  private final Optional<String> mappedTable;

  private final Optional<Integer> frequency;

  private final Optional<String> pizzlyConnectionId;

  private final Optional<String> pizzlyProviderConfigKey;

  private final Optional<Integer> maxTotal;

  private final Optional<String> friendlyName;

  private final Map<String, Object> metadata;

  private int _cachedHashCode;

  NangoSyncConfig(Optional<String> baseUrl, NangoHttpMethod method, Map<String, Object> headers,
      Object body, Map<String, Object> queryParams, Optional<String> uniqueKey,
      Optional<String> responsePath, Optional<String> pagingCursorRequestPath,
      Optional<String> pagingCursorMetadataResponsePath,
      Optional<String> pagingCursorObjectResponsePath, Optional<String> pagingUrlPath,
      Optional<String> pagingHeaderLinkRel, Optional<Boolean> autoMapping,
      Optional<String> mappedTable, Optional<Integer> frequency,
      Optional<String> pizzlyConnectionId, Optional<String> pizzlyProviderConfigKey,
      Optional<Integer> maxTotal, Optional<String> friendlyName, Map<String, Object> metadata) {
    this.baseUrl = baseUrl;
    this.method = method;
    this.headers = headers;
    this.body = body;
    this.queryParams = queryParams;
    this.uniqueKey = uniqueKey;
    this.responsePath = responsePath;
    this.pagingCursorRequestPath = pagingCursorRequestPath;
    this.pagingCursorMetadataResponsePath = pagingCursorMetadataResponsePath;
    this.pagingCursorObjectResponsePath = pagingCursorObjectResponsePath;
    this.pagingUrlPath = pagingUrlPath;
    this.pagingHeaderLinkRel = pagingHeaderLinkRel;
    this.autoMapping = autoMapping;
    this.mappedTable = mappedTable;
    this.frequency = frequency;
    this.pizzlyConnectionId = pizzlyConnectionId;
    this.pizzlyProviderConfigKey = pizzlyProviderConfigKey;
    this.maxTotal = maxTotal;
    this.friendlyName = friendlyName;
    this.metadata = metadata;
  }

  @JsonProperty("base_url")
  public Optional<String> getBaseUrl() {
    return baseUrl;
  }

  @JsonProperty("method")
  public NangoHttpMethod getMethod() {
    return method;
  }

  @JsonProperty("headers")
  public Map<String, Object> getHeaders() {
    return headers;
  }

  @JsonProperty("body")
  public Object getBody() {
    return body;
  }

  @JsonProperty("query_params")
  public Map<String, Object> getQueryParams() {
    return queryParams;
  }

  @JsonProperty("unique_key")
  public Optional<String> getUniqueKey() {
    return uniqueKey;
  }

  @JsonProperty("response_path")
  public Optional<String> getResponsePath() {
    return responsePath;
  }

  @JsonProperty("paging_cursor_request_path")
  public Optional<String> getPagingCursorRequestPath() {
    return pagingCursorRequestPath;
  }

  @JsonProperty("paging_cursor_metadata_response_path")
  public Optional<String> getPagingCursorMetadataResponsePath() {
    return pagingCursorMetadataResponsePath;
  }

  @JsonProperty("paging_cursor_object_response_path")
  public Optional<String> getPagingCursorObjectResponsePath() {
    return pagingCursorObjectResponsePath;
  }

  @JsonProperty("paging_url_path")
  public Optional<String> getPagingUrlPath() {
    return pagingUrlPath;
  }

  @JsonProperty("paging_header_link_rel")
  public Optional<String> getPagingHeaderLinkRel() {
    return pagingHeaderLinkRel;
  }

  @JsonProperty("auto_mapping")
  public Optional<Boolean> getAutoMapping() {
    return autoMapping;
  }

  @JsonProperty("mapped_table")
  public Optional<String> getMappedTable() {
    return mappedTable;
  }

  @JsonProperty("frequency")
  public Optional<Integer> getFrequency() {
    return frequency;
  }

  @JsonProperty("pizzly_connection_id")
  public Optional<String> getPizzlyConnectionId() {
    return pizzlyConnectionId;
  }

  @JsonProperty("pizzly_provider_config_key")
  public Optional<String> getPizzlyProviderConfigKey() {
    return pizzlyProviderConfigKey;
  }

  @JsonProperty("max_total")
  public Optional<Integer> getMaxTotal() {
    return maxTotal;
  }

  @JsonProperty("friendly_name")
  public Optional<String> getFriendlyName() {
    return friendlyName;
  }

  @JsonProperty("metadata")
  public Map<String, Object> getMetadata() {
    return metadata;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof NangoSyncConfig && equalTo((NangoSyncConfig) other);
  }

  private boolean equalTo(NangoSyncConfig other) {
    return baseUrl.equals(other.baseUrl) && method.equals(other.method) && headers.equals(other.headers) && body.equals(other.body) && queryParams.equals(other.queryParams) && uniqueKey.equals(other.uniqueKey) && responsePath.equals(other.responsePath) && pagingCursorRequestPath.equals(other.pagingCursorRequestPath) && pagingCursorMetadataResponsePath.equals(other.pagingCursorMetadataResponsePath) && pagingCursorObjectResponsePath.equals(other.pagingCursorObjectResponsePath) && pagingUrlPath.equals(other.pagingUrlPath) && pagingHeaderLinkRel.equals(other.pagingHeaderLinkRel) && autoMapping.equals(other.autoMapping) && mappedTable.equals(other.mappedTable) && frequency.equals(other.frequency) && pizzlyConnectionId.equals(other.pizzlyConnectionId) && pizzlyProviderConfigKey.equals(other.pizzlyProviderConfigKey) && maxTotal.equals(other.maxTotal) && friendlyName.equals(other.friendlyName) && metadata.equals(other.metadata);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.baseUrl, this.method, this.headers, this.body, this.queryParams, this.uniqueKey, this.responsePath, this.pagingCursorRequestPath, this.pagingCursorMetadataResponsePath, this.pagingCursorObjectResponsePath, this.pagingUrlPath, this.pagingHeaderLinkRel, this.autoMapping, this.mappedTable, this.frequency, this.pizzlyConnectionId, this.pizzlyProviderConfigKey, this.maxTotal, this.friendlyName, this.metadata);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "NangoSyncConfig{" + "baseUrl: " + baseUrl + ", method: " + method + ", headers: " + headers + ", body: " + body + ", queryParams: " + queryParams + ", uniqueKey: " + uniqueKey + ", responsePath: " + responsePath + ", pagingCursorRequestPath: " + pagingCursorRequestPath + ", pagingCursorMetadataResponsePath: " + pagingCursorMetadataResponsePath + ", pagingCursorObjectResponsePath: " + pagingCursorObjectResponsePath + ", pagingUrlPath: " + pagingUrlPath + ", pagingHeaderLinkRel: " + pagingHeaderLinkRel + ", autoMapping: " + autoMapping + ", mappedTable: " + mappedTable + ", frequency: " + frequency + ", pizzlyConnectionId: " + pizzlyConnectionId + ", pizzlyProviderConfigKey: " + pizzlyProviderConfigKey + ", maxTotal: " + maxTotal + ", friendlyName: " + friendlyName + ", metadata: " + metadata + "}";
  }

  public static MethodStage builder() {
    return new Builder();
  }

  public interface MethodStage {
    BodyStage method(NangoHttpMethod method);

    Builder from(NangoSyncConfig other);
  }

  public interface BodyStage {
    _FinalStage body(Object body);
  }

  public interface _FinalStage {
    NangoSyncConfig build();

    _FinalStage baseUrl(Optional<String> baseUrl);

    _FinalStage baseUrl(String baseUrl);

    _FinalStage headers(Map<String, Object> headers);

    _FinalStage putAllHeaders(Map<String, Object> headers);

    _FinalStage headers(String key, Object value);

    _FinalStage queryParams(Map<String, Object> queryParams);

    _FinalStage putAllQueryParams(Map<String, Object> queryParams);

    _FinalStage queryParams(String key, Object value);

    _FinalStage uniqueKey(Optional<String> uniqueKey);

    _FinalStage uniqueKey(String uniqueKey);

    _FinalStage responsePath(Optional<String> responsePath);

    _FinalStage responsePath(String responsePath);

    _FinalStage pagingCursorRequestPath(Optional<String> pagingCursorRequestPath);

    _FinalStage pagingCursorRequestPath(String pagingCursorRequestPath);

    _FinalStage pagingCursorMetadataResponsePath(Optional<String> pagingCursorMetadataResponsePath);

    _FinalStage pagingCursorMetadataResponsePath(String pagingCursorMetadataResponsePath);

    _FinalStage pagingCursorObjectResponsePath(Optional<String> pagingCursorObjectResponsePath);

    _FinalStage pagingCursorObjectResponsePath(String pagingCursorObjectResponsePath);

    _FinalStage pagingUrlPath(Optional<String> pagingUrlPath);

    _FinalStage pagingUrlPath(String pagingUrlPath);

    _FinalStage pagingHeaderLinkRel(Optional<String> pagingHeaderLinkRel);

    _FinalStage pagingHeaderLinkRel(String pagingHeaderLinkRel);

    _FinalStage autoMapping(Optional<Boolean> autoMapping);

    _FinalStage autoMapping(Boolean autoMapping);

    _FinalStage mappedTable(Optional<String> mappedTable);

    _FinalStage mappedTable(String mappedTable);

    _FinalStage frequency(Optional<Integer> frequency);

    _FinalStage frequency(Integer frequency);

    _FinalStage pizzlyConnectionId(Optional<String> pizzlyConnectionId);

    _FinalStage pizzlyConnectionId(String pizzlyConnectionId);

    _FinalStage pizzlyProviderConfigKey(Optional<String> pizzlyProviderConfigKey);

    _FinalStage pizzlyProviderConfigKey(String pizzlyProviderConfigKey);

    _FinalStage maxTotal(Optional<Integer> maxTotal);

    _FinalStage maxTotal(Integer maxTotal);

    _FinalStage friendlyName(Optional<String> friendlyName);

    _FinalStage friendlyName(String friendlyName);

    _FinalStage metadata(Map<String, Object> metadata);

    _FinalStage putAllMetadata(Map<String, Object> metadata);

    _FinalStage metadata(String key, Object value);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements MethodStage, BodyStage, _FinalStage {
    private NangoHttpMethod method;

    private Object body;

    private Map<String, Object> metadata = new LinkedHashMap<>();

    private Optional<String> friendlyName = Optional.empty();

    private Optional<Integer> maxTotal = Optional.empty();

    private Optional<String> pizzlyProviderConfigKey = Optional.empty();

    private Optional<String> pizzlyConnectionId = Optional.empty();

    private Optional<Integer> frequency = Optional.empty();

    private Optional<String> mappedTable = Optional.empty();

    private Optional<Boolean> autoMapping = Optional.empty();

    private Optional<String> pagingHeaderLinkRel = Optional.empty();

    private Optional<String> pagingUrlPath = Optional.empty();

    private Optional<String> pagingCursorObjectResponsePath = Optional.empty();

    private Optional<String> pagingCursorMetadataResponsePath = Optional.empty();

    private Optional<String> pagingCursorRequestPath = Optional.empty();

    private Optional<String> responsePath = Optional.empty();

    private Optional<String> uniqueKey = Optional.empty();

    private Map<String, Object> queryParams = new LinkedHashMap<>();

    private Map<String, Object> headers = new LinkedHashMap<>();

    private Optional<String> baseUrl = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(NangoSyncConfig other) {
      baseUrl(other.getBaseUrl());
      method(other.getMethod());
      headers(other.getHeaders());
      body(other.getBody());
      queryParams(other.getQueryParams());
      uniqueKey(other.getUniqueKey());
      responsePath(other.getResponsePath());
      pagingCursorRequestPath(other.getPagingCursorRequestPath());
      pagingCursorMetadataResponsePath(other.getPagingCursorMetadataResponsePath());
      pagingCursorObjectResponsePath(other.getPagingCursorObjectResponsePath());
      pagingUrlPath(other.getPagingUrlPath());
      pagingHeaderLinkRel(other.getPagingHeaderLinkRel());
      autoMapping(other.getAutoMapping());
      mappedTable(other.getMappedTable());
      frequency(other.getFrequency());
      pizzlyConnectionId(other.getPizzlyConnectionId());
      pizzlyProviderConfigKey(other.getPizzlyProviderConfigKey());
      maxTotal(other.getMaxTotal());
      friendlyName(other.getFriendlyName());
      metadata(other.getMetadata());
      return this;
    }

    @Override
    @JsonSetter("method")
    public BodyStage method(NangoHttpMethod method) {
      this.method = method;
      return this;
    }

    @Override
    @JsonSetter("body")
    public _FinalStage body(Object body) {
      this.body = body;
      return this;
    }

    @Override
    public _FinalStage metadata(String key, Object value) {
      this.metadata.put(key, value);
      return this;
    }

    @Override
    public _FinalStage putAllMetadata(Map<String, Object> metadata) {
      this.metadata.putAll(metadata);
      return this;
    }

    @Override
    @JsonSetter(
        value = "metadata",
        nulls = Nulls.SKIP
    )
    public _FinalStage metadata(Map<String, Object> metadata) {
      this.metadata.clear();
      this.metadata.putAll(metadata);
      return this;
    }

    @Override
    public _FinalStage friendlyName(String friendlyName) {
      this.friendlyName = Optional.of(friendlyName);
      return this;
    }

    @Override
    @JsonSetter(
        value = "friendly_name",
        nulls = Nulls.SKIP
    )
    public _FinalStage friendlyName(Optional<String> friendlyName) {
      this.friendlyName = friendlyName;
      return this;
    }

    @Override
    public _FinalStage maxTotal(Integer maxTotal) {
      this.maxTotal = Optional.of(maxTotal);
      return this;
    }

    @Override
    @JsonSetter(
        value = "max_total",
        nulls = Nulls.SKIP
    )
    public _FinalStage maxTotal(Optional<Integer> maxTotal) {
      this.maxTotal = maxTotal;
      return this;
    }

    @Override
    public _FinalStage pizzlyProviderConfigKey(String pizzlyProviderConfigKey) {
      this.pizzlyProviderConfigKey = Optional.of(pizzlyProviderConfigKey);
      return this;
    }

    @Override
    @JsonSetter(
        value = "pizzly_provider_config_key",
        nulls = Nulls.SKIP
    )
    public _FinalStage pizzlyProviderConfigKey(Optional<String> pizzlyProviderConfigKey) {
      this.pizzlyProviderConfigKey = pizzlyProviderConfigKey;
      return this;
    }

    @Override
    public _FinalStage pizzlyConnectionId(String pizzlyConnectionId) {
      this.pizzlyConnectionId = Optional.of(pizzlyConnectionId);
      return this;
    }

    @Override
    @JsonSetter(
        value = "pizzly_connection_id",
        nulls = Nulls.SKIP
    )
    public _FinalStage pizzlyConnectionId(Optional<String> pizzlyConnectionId) {
      this.pizzlyConnectionId = pizzlyConnectionId;
      return this;
    }

    @Override
    public _FinalStage frequency(Integer frequency) {
      this.frequency = Optional.of(frequency);
      return this;
    }

    @Override
    @JsonSetter(
        value = "frequency",
        nulls = Nulls.SKIP
    )
    public _FinalStage frequency(Optional<Integer> frequency) {
      this.frequency = frequency;
      return this;
    }

    @Override
    public _FinalStage mappedTable(String mappedTable) {
      this.mappedTable = Optional.of(mappedTable);
      return this;
    }

    @Override
    @JsonSetter(
        value = "mapped_table",
        nulls = Nulls.SKIP
    )
    public _FinalStage mappedTable(Optional<String> mappedTable) {
      this.mappedTable = mappedTable;
      return this;
    }

    @Override
    public _FinalStage autoMapping(Boolean autoMapping) {
      this.autoMapping = Optional.of(autoMapping);
      return this;
    }

    @Override
    @JsonSetter(
        value = "auto_mapping",
        nulls = Nulls.SKIP
    )
    public _FinalStage autoMapping(Optional<Boolean> autoMapping) {
      this.autoMapping = autoMapping;
      return this;
    }

    @Override
    public _FinalStage pagingHeaderLinkRel(String pagingHeaderLinkRel) {
      this.pagingHeaderLinkRel = Optional.of(pagingHeaderLinkRel);
      return this;
    }

    @Override
    @JsonSetter(
        value = "paging_header_link_rel",
        nulls = Nulls.SKIP
    )
    public _FinalStage pagingHeaderLinkRel(Optional<String> pagingHeaderLinkRel) {
      this.pagingHeaderLinkRel = pagingHeaderLinkRel;
      return this;
    }

    @Override
    public _FinalStage pagingUrlPath(String pagingUrlPath) {
      this.pagingUrlPath = Optional.of(pagingUrlPath);
      return this;
    }

    @Override
    @JsonSetter(
        value = "paging_url_path",
        nulls = Nulls.SKIP
    )
    public _FinalStage pagingUrlPath(Optional<String> pagingUrlPath) {
      this.pagingUrlPath = pagingUrlPath;
      return this;
    }

    @Override
    public _FinalStage pagingCursorObjectResponsePath(String pagingCursorObjectResponsePath) {
      this.pagingCursorObjectResponsePath = Optional.of(pagingCursorObjectResponsePath);
      return this;
    }

    @Override
    @JsonSetter(
        value = "paging_cursor_object_response_path",
        nulls = Nulls.SKIP
    )
    public _FinalStage pagingCursorObjectResponsePath(
        Optional<String> pagingCursorObjectResponsePath) {
      this.pagingCursorObjectResponsePath = pagingCursorObjectResponsePath;
      return this;
    }

    @Override
    public _FinalStage pagingCursorMetadataResponsePath(String pagingCursorMetadataResponsePath) {
      this.pagingCursorMetadataResponsePath = Optional.of(pagingCursorMetadataResponsePath);
      return this;
    }

    @Override
    @JsonSetter(
        value = "paging_cursor_metadata_response_path",
        nulls = Nulls.SKIP
    )
    public _FinalStage pagingCursorMetadataResponsePath(
        Optional<String> pagingCursorMetadataResponsePath) {
      this.pagingCursorMetadataResponsePath = pagingCursorMetadataResponsePath;
      return this;
    }

    @Override
    public _FinalStage pagingCursorRequestPath(String pagingCursorRequestPath) {
      this.pagingCursorRequestPath = Optional.of(pagingCursorRequestPath);
      return this;
    }

    @Override
    @JsonSetter(
        value = "paging_cursor_request_path",
        nulls = Nulls.SKIP
    )
    public _FinalStage pagingCursorRequestPath(Optional<String> pagingCursorRequestPath) {
      this.pagingCursorRequestPath = pagingCursorRequestPath;
      return this;
    }

    @Override
    public _FinalStage responsePath(String responsePath) {
      this.responsePath = Optional.of(responsePath);
      return this;
    }

    @Override
    @JsonSetter(
        value = "response_path",
        nulls = Nulls.SKIP
    )
    public _FinalStage responsePath(Optional<String> responsePath) {
      this.responsePath = responsePath;
      return this;
    }

    @Override
    public _FinalStage uniqueKey(String uniqueKey) {
      this.uniqueKey = Optional.of(uniqueKey);
      return this;
    }

    @Override
    @JsonSetter(
        value = "unique_key",
        nulls = Nulls.SKIP
    )
    public _FinalStage uniqueKey(Optional<String> uniqueKey) {
      this.uniqueKey = uniqueKey;
      return this;
    }

    @Override
    public _FinalStage queryParams(String key, Object value) {
      this.queryParams.put(key, value);
      return this;
    }

    @Override
    public _FinalStage putAllQueryParams(Map<String, Object> queryParams) {
      this.queryParams.putAll(queryParams);
      return this;
    }

    @Override
    @JsonSetter(
        value = "query_params",
        nulls = Nulls.SKIP
    )
    public _FinalStage queryParams(Map<String, Object> queryParams) {
      this.queryParams.clear();
      this.queryParams.putAll(queryParams);
      return this;
    }

    @Override
    public _FinalStage headers(String key, Object value) {
      this.headers.put(key, value);
      return this;
    }

    @Override
    public _FinalStage putAllHeaders(Map<String, Object> headers) {
      this.headers.putAll(headers);
      return this;
    }

    @Override
    @JsonSetter(
        value = "headers",
        nulls = Nulls.SKIP
    )
    public _FinalStage headers(Map<String, Object> headers) {
      this.headers.clear();
      this.headers.putAll(headers);
      return this;
    }

    @Override
    public _FinalStage baseUrl(String baseUrl) {
      this.baseUrl = Optional.of(baseUrl);
      return this;
    }

    @Override
    @JsonSetter(
        value = "base_url",
        nulls = Nulls.SKIP
    )
    public _FinalStage baseUrl(Optional<String> baseUrl) {
      this.baseUrl = baseUrl;
      return this;
    }

    @Override
    public NangoSyncConfig build() {
      return new NangoSyncConfig(baseUrl, method, headers, body, queryParams, uniqueKey, responsePath, pagingCursorRequestPath, pagingCursorMetadataResponsePath, pagingCursorObjectResponsePath, pagingUrlPath, pagingHeaderLinkRel, autoMapping, mappedTable, frequency, pizzlyConnectionId, pizzlyProviderConfigKey, maxTotal, friendlyName, metadata);
    }
  }
}
