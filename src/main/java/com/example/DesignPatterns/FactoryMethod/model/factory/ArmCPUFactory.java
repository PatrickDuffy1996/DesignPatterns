package com.example.DesignPatterns.FactoryMethod.model.factory;

import com.example.DesignPatterns.FactoryMethod.model.product.ArmCPU;
import com.example.DesignPatterns.FactoryMethod.model.product.CPU;
import org.springframework.stereotype.Component;

@Component
public class ArmCPUFactory extends CPUFactory{
  @Override
  public CPU createCPU() {
    return new ArmCPU();
  }


}
