package com.example.DesignPatterns.FactoryMethod.service;

import com.example.DesignPatterns.FactoryMethod.model.factory.AmdCPUFactory;
import com.example.DesignPatterns.FactoryMethod.model.factory.ArmCPUFactory;
import com.example.DesignPatterns.FactoryMethod.model.factory.IntelCPUFactory;
import com.example.DesignPatterns.FactoryMethod.model.product.CPU;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class FactoryMethodService {

  private final IntelCPUFactory intelCPUFactory;
  private final AmdCPUFactory amdCPUFactory;
  private final ArmCPUFactory armCPUFactory;



  public FactoryMethodService(IntelCPUFactory intelCPUFactory, AmdCPUFactory amdCPUFactory, ArmCPUFactory armCPUFactory) {
    this.intelCPUFactory = intelCPUFactory;
    this.amdCPUFactory = amdCPUFactory;
    this.armCPUFactory = armCPUFactory;
  }

  public List<CPU> getCPUs(List<String> cpuOrderList) {
    List<CPU> cpus = new ArrayList<>();
    for (String cpuOrder : cpuOrderList) {
      switch (cpuOrder) {
        case "Intel" -> cpus.add(intelCPUFactory.createCPU());
        case "AMD" -> cpus.add(amdCPUFactory.createCPU());
        case "ARM" -> cpus.add(armCPUFactory.createCPU());
        default -> log.error("Invalid CPU type");
      }

    }
    return cpus;
  }
}
