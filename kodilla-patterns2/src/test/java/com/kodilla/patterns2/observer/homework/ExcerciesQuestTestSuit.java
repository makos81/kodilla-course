package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExcerciesQuestTestSuit {
    @Test
    public void shouldGetExcercises(){
        Mentor mentorJava = new Mentor("Java");
        Mentor mentorPython = new Mentor("Python");
        ExcerciseQueue excerciseQueueJava = new ExcerciseQueue("Java Queue");
        ExcerciseQueue excerciseQueuePython = new ExcerciseQueue("Python Queue");
        excerciseQueueJava.registerObserver(mentorJava);
        excerciseQueuePython.registerObserver(mentorPython);

        excerciseQueueJava.addExcercise("zadanie 1");
        excerciseQueueJava.addExcercise("zadanie 2");
        excerciseQueuePython.addExcercise("zadanie 1");
        excerciseQueuePython.addExcercise("zadanie 2");
        excerciseQueuePython.addExcercise("zadanie 3");

        assertEquals(3, mentorPython.getCount());
        assertEquals(2, mentorJava.getCount());
    }
}
