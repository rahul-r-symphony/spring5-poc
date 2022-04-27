package com.rahul.orders.web.controller;
import com.rahul.commons.config.IConfigProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/orders")
public class OrderController {

  @Autowired
  private IConfigProvider configProvider;

  @GetMapping("/")
  public String get(){
    return configProvider.getOrderConfig();
  }

}
