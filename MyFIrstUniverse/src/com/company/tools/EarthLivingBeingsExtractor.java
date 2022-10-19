package com.company.tools;

import com.company.zive_tvory.Tvor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class EarthLivingBeingsExtractor {
    private String filename = "tvoryNaZemi.txt";


    public void getBeingsOnEarth(LinkedList<Tvor> poleTvorov){
        this.createFile(this.filename);
        this.writeToFile(this.filename, poleTvorov);
    }


    private void createFile(String filename){
        try {
            File myObj = new File("tvoryNaZemi.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    private void writeToFile( String filename, LinkedList<Tvor> poleTvorov){
        try(FileWriter fileWriter = new FileWriter(filename)) {
            //fileWriter.write(line);
            poleTvorov.forEach((tvor) -> {
                if (tvor.getKonkretnyTvorName()!= null){
                    try {
                        fileWriter.write(tvor.getKonkretnyTvorName());
                        fileWriter.write('\n');
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }

    }

}
