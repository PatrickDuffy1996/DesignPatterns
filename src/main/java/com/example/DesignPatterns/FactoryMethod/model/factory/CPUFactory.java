package com.example.DesignPatterns.FactoryMethod.model.factory;

import com.example.DesignPatterns.FactoryMethod.model.product.CPU;
import org.springframework.stereotype.Component;

@Component
public abstract class CPUFactory {

  public abstract CPU createCPU();


}
