package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        int addResult = calculator.add(3,4);
        if(addResult==7){
            System.out.println("Poprawny wynik dodawania");
        }else{
            System.out.println("Niepoprawny wynik dodawania");
        }

        int substractResult = calculator.subtract(2,4);
        if(substractResult==-2){
            System.out.println("Poprawny wynik odejmowania");
        }else{
            System.out.println("Niepoprawny wynik odejmowania");
        }
    }
}
