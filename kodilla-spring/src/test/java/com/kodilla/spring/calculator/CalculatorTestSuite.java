package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double resultAdd = calculator.add(1, 1);
        double resultSub = calculator.sub(1, 1);
        double resultMul = calculator.mul(1, 1);
        double resultDiv = calculator.div(1, 1);
        //Than
        Assert.assertEquals(2, resultAdd, 1);
        Assert.assertEquals(0, resultSub, 1);
        Assert.assertEquals(1, resultMul, 1);
        Assert.assertEquals(1, resultDiv, 1);
    }
}
