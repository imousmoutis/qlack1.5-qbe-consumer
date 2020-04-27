package com.eurodyn.qlack2.test.qbe.consumer.web;

import com.eurodyn.qlack2.test.qbe.consumer.api.QBEConsumerService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/consumer")
public class QBEConsumerRest {

  private QBEConsumerService qbeConsumerService;

  public void setQbeConsumerService(QBEConsumerService qbeConsumerService) {
    this.qbeConsumerService = qbeConsumerService;
  }

  @GET
  @Path("/")
  @Produces(MediaType.APPLICATION_JSON)
  public String welcome() {
    return qbeConsumerService.getWelcomeMessage();
  }
}
