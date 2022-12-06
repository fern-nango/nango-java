package sample;

import com.nango.api.client.sync.endpoints.Add;
import com.nango.api.client.sync.exceptions.AddException;
import com.nango.api.client.sync.types.NangoHttpMethod;
import com.nango.api.client.sync.types.NangoSyncConfig;
import java.lang.String;
import com.nango.api.NangoApiClient;

public final class App {
  public static void main(String[] args) {
    NangoApiClient nango = new NangoApiClient("https://localhost:3003");
    try {
      nango.sync().add(Add.Request.builder()
          .body(NangoSyncConfig.builder()
              .method(NangoHttpMethod.GET)
              .baseUrl("https://www.reddit.com/r/${subreddit}/new.json")
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
