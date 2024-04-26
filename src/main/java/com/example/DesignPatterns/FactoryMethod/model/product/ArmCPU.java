package com.example.DesignPatterns.FactoryMethod.model.product;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class ArmCPU implements CPU {

  private final String instructionSet = "ARMv8";

  @Override
  public void fetch() {
    log.info("Arm CPU is fetching address");
  }

  @Override
  public void decode() {
    log.info("Arm CPU is decoding instructions");
  }

  @Override
  public void execute() {
    log.info("Arm CPU is executing instructions");
  }
}
