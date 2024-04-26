package com.example.DesignPatterns.FactoryMethod.model.product;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class IntelCPU implements CPU {

  private final String instructionSet = "x86";

  @Override
  public void fetch() {
    log.info("Intel CPU is fetching address");
  }

  @Override
  public void decode() {
    log.info("Intel CPU is decoding instructions using " + instructionSet + " instruction set");
  }

  @Override
  public void execute() {
    log.info("Intel CPU is executing instructions");
  }
}
