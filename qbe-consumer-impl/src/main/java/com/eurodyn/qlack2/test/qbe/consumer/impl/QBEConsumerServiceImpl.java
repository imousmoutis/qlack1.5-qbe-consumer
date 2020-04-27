package com.eurodyn.qlack2.test.qbe.consumer.impl;

import com.eurodyn.qlack2.test.qbe.consumer.api.QBEConsumerService;

public class QBEConsumerServiceImpl implements QBEConsumerService {

  @Override
  public String getWelcomeMessage() {
    return "Hey!";
  }
}
