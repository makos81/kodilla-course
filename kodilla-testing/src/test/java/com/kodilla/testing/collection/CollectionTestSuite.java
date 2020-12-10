package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Testing Odd numbers exterminator")
public class CollectionTestSuite {

    @BeforeEach
    public void before(){
        System.out.println("Running test case for Odd Numbers Exterminator");
    }

    @AfterEach
    public void after(){
        System.out.println("Finished test case for Odd Numbers Exterminator");
    }


    @Test
    @DisplayName("Validating when list is empty")
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> resultList;
        List<Integer> expectedList = new ArrayList<>();
        //when
        resultList = oddNumbersExterminator.exterminate(new ArrayList<>());
        //then
        Assertions.assertTrue(expectedList.equals(resultList));
    }

    @Test
    @DisplayName("Testing when list contains odd and even integer numbers")
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> expectedList = new ArrayList<>();
        expectedList.addAll(Arrays.asList(2, 4));
        //when
        List<Integer> testedList = oddNumbersExterminator.exterminate(Arrays.asList(1, 2, 3, 4));
        //then
        Assertions.assertTrue(expectedList.equals(testedList.toArray()));
    }
}
