package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers){
        /*
        przy pomocy strumienia IntStream oraz metody range(int startInclusive, int endExclusive)
        wyświetlić kolejne elementy tablicy, a następnie:
        przy pomocy drugiego strumienia IntStream oraz metody range(int startInclusive, int endExclusive),
        a także kolektora average() obliczyć średnią. Na końcu metoda powinna zwracać średnią jako wynik typu double.
         */
        IntStream.range(0, numbers.length).mapToObj(x->"Value [" + x + "] = " + numbers[x]).forEach(System.out::println);
        return IntStream.range(0,numbers.length).map(x->numbers[x]).average().getAsDouble();
    }
}
