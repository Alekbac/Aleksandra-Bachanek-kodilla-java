package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {
    public void readFile()throws FileReaderException{
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource( "file/names.txt" ).getFile());

        try(Stream<String> fileLanes = Files.lines(Paths.get(file.getPath()))){
            fileLanes.forEach( System.out::println );

        } catch (IOException e){
            throw new FileReaderException();
            //System.out.println("Oh noooo!"+e);

        }finally{
            System.out.println("Will be fine.");
        }

        System.out.println(file.getPath());
    }
}
