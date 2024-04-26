package com.example.DesignPatterns.FactoryMethod.model.factory;

import com.example.DesignPatterns.FactoryMethod.model.product.AmdCPU;
import com.example.DesignPatterns.FactoryMethod.model.product.CPU;
import org.springframework.stereotype.Component;

@Component
public class AmdCPUFactory extends CPUFactory {

  @Override
  public CPU createCPU() {
    return new AmdCPU();
  }

}
