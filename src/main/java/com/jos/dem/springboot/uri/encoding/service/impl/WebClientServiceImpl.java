package com.jos.dem.springboot.uri.encoding.service.impl;

import reactor.core.publisher.Mono;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.reactive.function.client.WebClient;

import com.jos.dem.springboot.uri.encoding.service.WebClientService;

@Service
public class WebClientServiceImpl implements WebClientService {

  @Autowired
  private WebClient webClient;

  public Mono<String> send() {
    return Mono.just("Hello World!");
  }

}
