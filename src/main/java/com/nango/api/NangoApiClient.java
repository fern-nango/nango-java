package com.nango.api;

import com.nango.api.client.sync.SyncServiceClient;
import com.nango.api.core.Environment;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

public final class NangoApiClient {
  private final Supplier<SyncServiceClient> syncServiceClient;

  public NangoApiClient() {
    this(Environment.LOCAL);
  }

  public NangoApiClient(Environment environment) {
    this.syncServiceClient = memoize(() -> new SyncServiceClient(environment.getUrl()));
  }

  public final SyncServiceClient sync() {
    return this.syncServiceClient.get();
  }

  private static <T> Supplier<T> memoize(Supplier<T> delegate) {
    AtomicReference<T> value = new AtomicReference<>();
    return () ->  {
      T val = value.get();
      if (val == null) {
        val = value.updateAndGet(cur -> cur == null ? Objects.requireNonNull(delegate.get()) : cur);
      }
      return val;
    } ;
  }
}
