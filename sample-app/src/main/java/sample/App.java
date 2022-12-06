package sample;

import com.nango.api.client.sync.endpoints.Add;
import com.nango.api.client.sync.exceptions.AddException;
import com.nango.api.client.sync.types.NangoHttpMethod;
import com.nango.api.client.sync.types.NangoSyncConfig;
import com.nango.api.core.Environment;
import java.lang.String;
import com.nango.api.NangoApiClient;

public final class App {
  public static void main(String[] args) {
    NangoApiClient nango = new NangoApiClient(Environment.LOCAL);
    try {
      nango.sync().add(Add.Request.builder()
          .body(NangoSyncConfig.builder()
              .url("https://www.reddit.com/r/${subreddit}/new.json")
              .method(NangoHttpMethod.GET)
              .responsePath("data.children")
              .pagingCursorRequestPath("after")
              .pagingCursorObjectResponsePath("paging.next.after")
              .build())
          .build());
    } catch (AddException ex) {
      System.out.println("Failed to add sync: " + ex.getMessage());
    }
  }
}
