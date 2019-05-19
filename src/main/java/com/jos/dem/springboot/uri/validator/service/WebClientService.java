package com.jos.dem.springboot.uri.validator.service;

import reactor.core.publisher.Mono;

public interface WebClientService {

  Mono<String> send(String path);

}
