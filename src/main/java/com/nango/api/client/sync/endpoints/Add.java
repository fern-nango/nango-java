package com.nango.api.client.sync.endpoints;

import com.nango.api.client.sync.types.NangoSyncConfig;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public final class Add {
  private Add() {
  }

  public static final class Request {
    private final NangoSyncConfig body;

    private int _cachedHashCode;

    Request(NangoSyncConfig body) {
      this.body = body;
    }

    public NangoSyncConfig getBody() {
      return body;
    }

    @Override
    public boolean equals(Object other) {
      if (this == other) return true;
      return other instanceof Request && equalTo((Request) other);
    }

    private boolean equalTo(Request other) {
      return body.equals(other.body);
    }

    @Override
    public int hashCode() {
      if (_cachedHashCode == 0) {
        _cachedHashCode = Objects.hash(this.body);
      }
      return _cachedHashCode;
    }

    @Override
    public String toString() {
      return "Add.Request{" + "body: " + body + "}";
    }

    public static BodyStage builder() {
      return new Builder();
    }

    public interface BodyStage {
      _FinalStage body(NangoSyncConfig body);

      Builder from(Request other);
    }

    public interface _FinalStage {
      Request build();
    }

    public static final class Builder implements BodyStage, _FinalStage {
      private NangoSyncConfig body;

      private Builder() {
      }

      @Override
      public Builder from(Request other) {
        body(other.getBody());
        return this;
      }

      @Override
      public _FinalStage body(NangoSyncConfig body) {
        this.body = body;
        return this;
      }

      @Override
      public Request build() {
        return new Request(body);
      }
    }
  }
}
