package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FileReaderTestSuite {
    @Test
    void testReadFile(){
        FileReader fileReader = new FileReader();
        assertDoesNotThrow(()->fileReader.readFile("plik"));
    }

    @Test
    void whenFileDosentExistsReadFileShouldThrowException() {
        // given
        FileReader fileReader = new FileReader();
        String fileName = "nie_ma_takiego_pliku.txt";
        // when & then
        assertThrows(FileReaderException.class, () -> fileReader.readFile(fileName));
    }

    @Test
    public void testReadFileWithName() {
        // given
        FileReader fileReader = new FileReader();
        // when & then
        assertAll(
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile("nie_ma_takiego_pliku.txt")),
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile(null)),
                () -> assertDoesNotThrow(() -> fileReader.readFile("names.txt"))
        );
    }

    @Test
    public void testProbablyWillThrowExp(){
        //given
        SecondChallenge secondChallenge = new SecondChallenge();

        //when && then
        Assertions.assertAll(
                ()->Assertions.assertDoesNotThrow(()->secondChallenge.probablyIWillThrowException(1,2)),
                ()->Assertions.assertDoesNotThrow(()->secondChallenge.probablyIWillThrowException(1.5, 1)),
                ()->Assertions.assertThrows(Exception.class,()->secondChallenge.probablyIWillThrowException(2,1)),
                ()->Assertions.assertThrows(Exception.class,()->secondChallenge.probablyIWillThrowException(0,1.5)),
                ()->Assertions.assertThrows(Exception.class, ()->secondChallenge.probablyIWillThrowException(1,1.5))
        );
    }
}
