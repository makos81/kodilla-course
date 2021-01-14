package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    Calculator calculator;

    @Test
    public void testCalculations(){
        //given

        //when

        //then
        Assertions.assertAll(
                ()->assertEquals(5, calculator.add(1,4)),
                ()->assertEquals(-3, calculator.sub(1,4)),
                ()->assertEquals(4, calculator.mul(1,4)),
                ()->assertEquals(0.25, calculator.div(1,4))
        );

    }
}
