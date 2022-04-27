package com.rahul.commons.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SimpleConfigProvider implements IConfigProvider {

  @Override
  public String getOrderConfig() {
    return "orders";
  }

  @Override
  public String getProductConfig() {
    return "products";
  }
}
