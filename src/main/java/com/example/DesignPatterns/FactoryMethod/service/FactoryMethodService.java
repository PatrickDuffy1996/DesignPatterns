package com.example.DesignPatterns.FactoryMethod.service;

import com.example.DesignPatterns.FactoryMethod.model.factory.CPUFactory;
import com.example.DesignPatterns.FactoryMethod.model.product.CPU;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class FactoryMethodService {

  private final List<CPUFactory> cpuFactories;

  public FactoryMethodService(List<CPUFactory> cpuFactories) {
    this.cpuFactories = cpuFactories;
  }

  public List<CPU> getCPUs(List<String> cpuOrderList) {
    List<CPU> cpus = new ArrayList<>();
    for (String cpuOrder : cpuOrderList) {
      cpus.add(cpuFactories.stream()
          .filter(cpuFactory -> cpuFactory.name().equals(cpuOrder))
          .findFirst()
          .orElseThrow(() -> new IllegalArgumentException("Invalid CPU type"))
          .createCPU());
    }
    return cpus;
  }
}
