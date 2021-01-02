package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {
    public void readFile() {
        ClassLoader classLoader = getClass().getClassLoader();
        File newFile = new File(classLoader.getResource("names.txt").getFile());
        Path path = Paths.get("aa");//newFile.getPath());
        try(Stream<String> stream = Files.lines(path)){
            stream.forEach(System.out::println);
        }catch(IOException e){
            System.out.println("Bład odczytu pliku " + e);
        }finally {
            System.out.println("Always");
        }
        System.out.print(newFile.getPath());
    }
}
