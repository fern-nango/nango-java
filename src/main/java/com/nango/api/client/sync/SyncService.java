package com.nango.api.client.sync;

import com.fern.java.jersey.contracts.OptionalAwareContract;
import com.nango.api.client.sync.exceptions.AddException;
import com.nango.api.client.sync.types.NangoSyncConfig;
import com.nango.api.core.ObjectMappers;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.jaxrs.JAXRSContract;
import java.lang.String;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/v1/syncs")
interface SyncService {
  @POST
  @Path("")
  void add(NangoSyncConfig body) throws AddException;

  static SyncService getClient(String url) {
    return Feign.builder()
        .contract(new OptionalAwareContract(new JAXRSContract()))
        .decoder(new JacksonDecoder(ObjectMappers.JSON_MAPPER))
        .encoder(new JacksonEncoder(ObjectMappers.JSON_MAPPER))
        .errorDecoder(new SyncServiceErrorDecoder()).target(SyncService.class, url);
  }
}
