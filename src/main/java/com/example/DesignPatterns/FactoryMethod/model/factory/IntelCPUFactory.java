package com.example.DesignPatterns.FactoryMethod.model.factory;

import com.example.DesignPatterns.FactoryMethod.model.product.CPU;
import com.example.DesignPatterns.FactoryMethod.model.product.IntelCPU;
import org.springframework.stereotype.Component;

@Component
public class IntelCPUFactory extends CPUFactory {

      @Override
      public CPU createCPU() {
          return new IntelCPU();
      }

}
