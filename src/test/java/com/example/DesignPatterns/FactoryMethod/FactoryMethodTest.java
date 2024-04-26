package com.example.DesignPatterns.FactoryMethod;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.example.DesignPatterns.FactoryMethod.service.FactoryMethodService;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FactoryMethodTest {

  @Autowired
  private FactoryMethodService factoryMethodService;

  @Test
  void testFactoryMethod() {
    List<String> orderList = List.of("Intel", "AMD", "ARM");
    var result = factoryMethodService.getCPUs(orderList);
    assertThat(result.size()).isEqualTo(3);
    assertThat(result.get(0).getClass().getSimpleName()).isEqualTo("IntelCPU");
    assertThat(result.get(1).getClass().getSimpleName()).isEqualTo("AmdCPU");
    assertThat(result.get(2).getClass().getSimpleName()).isEqualTo("ArmCPU");
  }

}
