package com.company.tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MessageReader {

    private String filename;

    private File myFile;
    private Scanner fileScanner;
    List<String> lineContainer = new ArrayList<String>();

    private Map<String, Integer> uniqueWords = new HashMap<>();

    public void obtainFilename(String arguments[]){
        if (arguments.length >=1){
            this.filename = arguments[0];
        }else{

            Scanner inputReader = new Scanner(System.in);
            System.out.println("Zadaj nazov suboru z ktoreho chces precitat (pomocka: tvoryNaZemi.txt)");

            filename = inputReader.nextLine();

        }

        System.out.println("Nazov suboru je: "+ filename);
    }

    public void openAndRead(){
        try{
           myFile = new File(filename);
           fileScanner = new Scanner(myFile);
           while (fileScanner.hasNextLine()){
               lineContainer.add(fileScanner.nextLine());
           }
        }catch (FileNotFoundException e){
            System.out.println("Nenasiel sa subor");
            e.printStackTrace();
        }
    }

    public void processMessage(){
        for (int i = 0; i < lineContainer.size(); i++) {
            String temp = lineContainer.get(i);
            Integer count = uniqueWords.getOrDefault(temp, 0);
            count++;
            uniqueWords.put(temp, count);
        }

        System.out.println("Zoznam tvorov");
        uniqueWords.forEach((key, value) -> System.out.println(key + ": "+ value));
    }
}
