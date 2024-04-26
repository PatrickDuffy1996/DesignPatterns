package com.example.DesignPatterns.FactoryMethod.model.product;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class AmdCPU implements CPU {

  private final String instructionSet = "x86";

  @Override
  public void fetch() {
    log.info("Amd CPU is fetching address");
  }

  @Override
  public void decode() {
    log.info("Amd CPU is decoding instructions");
  }

  @Override
  public void execute() {
    log.info("Amd CPU is executing instructions");
  }
}
