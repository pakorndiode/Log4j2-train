package com.example.testlog4j;

import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  private static final Logger logger = LoggerFactory.getLogger(TestController.class);

  String logPrefix = "API Controller ";

  @GetMapping(value = "/test")
  public String test(@RequestParam("nid") String nid) {
    try {
      logger.info(logPrefix + "Request : " + nid);

      logger.info(logPrefix + "Response : " + nid);
    } catch (Exception e) {
      logger.info(logPrefix + "Error : " + e);
    }
    return nid;
  }
}
