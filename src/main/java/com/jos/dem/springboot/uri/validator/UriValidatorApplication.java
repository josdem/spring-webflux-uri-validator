package com.jos.dem.springboot.uri.validator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class UriValidatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(UriValidatorApplication.class, args);
	}

  @Bean
  WebClient webClient() {
    return WebClient.create("http://localhost:8080");
  }

}
