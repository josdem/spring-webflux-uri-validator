package com.jos.dem.springboot.uri.encoding;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;
import java.time.LocalTime;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.jos.dem.springboot.uri.encoding.service.WebClientService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EncoderTest {

  @Autowired
  private EncoderService service;

  private Logger log = LoggerFactory.getLogger(this.getClass());

	@Test
	public void shouldEncode() throws Exception {
    log.info("Running: Should encode at {}", new Date());
    assertEquals("Hello World!", service.send());
	}

}

