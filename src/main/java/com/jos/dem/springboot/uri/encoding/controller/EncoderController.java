package com.jos.dem.springboot.uri.encoding.controller;

import reactor.core.publisher.Mono;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.validation.constraints.Pattern;
import javax.validation.ConstraintViolationException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.validation.annotation.Validated;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Validated
@RestController
public class EncoderController {

  private Logger log = LoggerFactory.getLogger(this.getClass());

  @GetMapping("/{mnemonic}")
  public Mono<String> index(
      @PathVariable
        @Pattern(
          regexp = "^\\d{4}[-]\\d{2}[-]\\d{2}[-]\\d{6}$",
          message = "Invalid mnemonic format") String mnemonic) {
    log.info("INDEX: Mneminc is valid");
    return Mono.just("valid");
  }

  @ExceptionHandler(ConstraintViolationException.class)
  Mono<String> handleException(ConstraintViolationException cve){
    log.info("Violations: " + ToStringBuilder.reflectionToString(cve.getConstraintViolations()));
    cve.getConstraintViolations().forEach(v -> log.info(ToStringBuilder.reflectionToString(v)));
    return Mono.just(cve.getMessage());
  }

}
