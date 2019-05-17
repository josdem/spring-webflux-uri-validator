package com.jos.dem.springboot.uri.encoding.controller;

import javax.validation.constraints.Pattern;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.validation.annotation.Validated;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Validated
@RestController
public class EncoderController {

  private Logger log = LoggerFactory.getLogger(this.getClass());

  @GetMapping("/{storeOrderId}")
  public String index(
      @PathVariable
        @Pattern(
          regexp = "^\\d{4}[-]\\d{2}[-]\\d{2}[#]\\d+$",
          message = "Invalid storeOrderId format") String storeOrderId) {
    log.info("Calling to index");
    return "Hello World!";
  }

}
