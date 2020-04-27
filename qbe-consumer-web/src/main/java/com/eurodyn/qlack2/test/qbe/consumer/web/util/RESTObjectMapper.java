package com.eurodyn.qlack2.test.qbe.consumer.web.util;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

public class RESTObjectMapper extends ObjectMapper {

  public boolean serialiseNullValues;

  public RESTObjectMapper() {
    super();
  }

  public void setAcceptSingleValueAsArray(boolean state) {
    super.configure(DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY, state);
  }

  public void setSerialiseNullValues(boolean b) {
    super.setSerializationInclusion(b ? Inclusion.ALWAYS : Inclusion.NON_EMPTY);
  }

}
