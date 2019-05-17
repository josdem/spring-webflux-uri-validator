package com.jos.dem.springboot.uri.encoding.service;

import reactor.core.publisher.Mono;

public interface WebClientService {

  Mono<String> send();

}
