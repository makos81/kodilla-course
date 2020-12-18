package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        /*
        Test powinien przygotować tablicę z przykładowymi wartościami typu int i wywołać metodę
        getAverage(int[] numbers) interfejsu ArrayOperations
         */
        //given
        int[] tableInt = new int[]{2,1,2,3};
        double expected = 2.0;
        //when
        double result = ArrayOperations.getAverage(tableInt);
        //then
        Assertions.assertEquals(expected, result);

    }
}
