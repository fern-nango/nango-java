# Nango Java Library

![Maven Central](https://img.shields.io/maven-central/v/io.github.fern-api/nango) 
![Sonatype Nexus (Releases)](https://img.shields.io/nexus/r/io.github.fern-api/nango?server=https%3A%2F%2Fs01.oss.sonatype.org)

## Documentation

API documentation is available [here](https://docs.nango.dev/add-sync).

## Installation
Check [releases](https://github.com/fern-nango/nango-java/releases) to get the latest version.

### Gradle users

Add this dependency to your project's build file:

```groovy
implementation "io.github.fern-api:nango:0.0.1"
```

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.github.fern-api</groupId>
  <artifactId>nango</artifactId>
  <version>0.0.1</version>
</dependency>
```

## Usage

Check out the [sample app](sample-app/src/main/java/sample/App.java) which consumes this SDK!

```java
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
```

## Beta status

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning the package version to a specific version in your build.gradle file. This way, you can install the same version each time without breaking changes unless you are intentionally looking for the latest version.

## Contributing

While we value open-source contributions to this SDK, this library is generated programmatically. Additions made directly to this library would have to be moved over to our generation code, otherwise they would be overwritten upon the next generated release. Feel free to open a PR as a proof of concept, but know that we will not be able to merge it as-is. We suggest [opening an issue](https://github.com/fern-{company}/{company}-java/issues) first to discuss with us!

On the other hand, contributions to the README are always very welcome!
