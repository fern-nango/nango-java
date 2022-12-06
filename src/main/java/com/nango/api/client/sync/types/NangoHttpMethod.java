package com.nango.api.client.sync.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class NangoHttpMethod {
  public static final NangoHttpMethod GET = new NangoHttpMethod(Value.GET, "GET");

  public static final NangoHttpMethod PUT = new NangoHttpMethod(Value.PUT, "PUT");

  public static final NangoHttpMethod PATCH = new NangoHttpMethod(Value.PATCH, "PATCH");

  public static final NangoHttpMethod DELETE = new NangoHttpMethod(Value.DELETE, "DELETE");

  public static final NangoHttpMethod POST = new NangoHttpMethod(Value.POST, "POST");

  private final Value value;

  private final String string;

  NangoHttpMethod(Value value, String string) {
    this.value = value;
    this.string = string;
  }

  public Value getEnumValue() {
    return value;
  }

  @Override
  @JsonValue
  public String toString() {
    return this.string;
  }

  @Override
  public boolean equals(Object other) {
    return (this == other) 
      || (other instanceof NangoHttpMethod && this.string.equals(((NangoHttpMethod) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case GET:
        return visitor.visitGet();
      case PUT:
        return visitor.visitPut();
      case PATCH:
        return visitor.visitPatch();
      case DELETE:
        return visitor.visitDelete();
      case POST:
        return visitor.visitPost();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static NangoHttpMethod valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "GET":
        return GET;
      case "PUT":
        return PUT;
      case "PATCH":
        return PATCH;
      case "DELETE":
        return DELETE;
      case "POST":
        return POST;
      default:
        return new NangoHttpMethod(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    GET,

    POST,

    PUT,

    PATCH,

    DELETE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitGet();

    T visitPost();

    T visitPut();

    T visitPatch();

    T visitDelete();

    T visitUnknown(String unknownType);
  }
}
