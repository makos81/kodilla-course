package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.SaySomething;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("to tekst do upiekszenia", x->x.toUpperCase());
        poemBeautifier.beautify("a teraz dodamy literki przed tekstem", x->"ABC".concat(x));
        poemBeautifier.beautify("a teraz dodamy literki przed tekstem i za tekstem", x->"ABC" + x + "ABC");
        poemBeautifier.beautify("a teraz potworzymy napis 2 razy ", x->x.repeat(2));
    }
}
