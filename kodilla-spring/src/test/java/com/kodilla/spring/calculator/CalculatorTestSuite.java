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
    public void testCalculations(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addition = calculator.add(2.0,2.0);
        double substraction = calculator.sub(3.5,2.0);
        double multiplication = calculator.mul(2.0,2.0);
        double division = calculator.div(2.0,2.0);
        //Then
        Assert.assertEquals(addition, 4, 0.1);
        Assert.assertEquals(substraction, 1.5, 0.1);
        Assert.assertEquals(multiplication, 4, 0.1);
        Assert.assertEquals(division, 1.0, 0.1);
    }
}
