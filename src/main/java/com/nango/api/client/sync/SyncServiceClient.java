package com.nango.api.client.sync;

import com.nango.api.client.sync.endpoints.Add;
import com.nango.api.client.sync.exceptions.AddException;
import java.lang.String;

public final class SyncServiceClient {
  private final SyncService service;

  public SyncServiceClient(String url) {
    this.service = SyncService.getClient(url);
  }

  public void add(Add.Request request) throws AddException {
    this.service.add(request.getBody());
  }
}
