package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers){
        List<Integer> evenNumbersList = new ArrayList<>();
        for(int element: numbers){
            if(element%2==0)
                evenNumbersList.add(element);
        }
        return evenNumbersList;
    }
}
