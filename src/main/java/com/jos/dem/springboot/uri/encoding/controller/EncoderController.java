package com.jos.dem.springboot.uri.encoding.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class EncoderController {

  private Logger log = LoggerFactory.getLogger(this.getClass());

  @GetMapping("/")
  public String index() {
    log.info("Calling to index");
    return "Hello World!";
  }

}
