package edu.animals;

import java.util.ArrayList;

/**
 * Created by mgreen14 on 12/27/17.
 * Author Matt Green
 * Version 1.5
 *
 * Class is the driver class using the main method
 */

public class Main {

    private final static FileOutput outFile = new FileOutput("animals.txt");
    private final static FileInput inFile = new FileInput("animals.txt");
    public static void main(String[] args) {

        /**
         * creates array list
         */
        ArrayList<Talkable> zoo = new ArrayList<>();

        //Lines to Replace
        /**
         * adds items into arrayList
         */
        zoo.add(new Dog(true, "Pete"));
        zoo.add(new Cat(9, "Anne Belly"));
        zoo.add(new Student(19, "Joe John Johnson"));
        //End Lines to Replace

        /**
         * information for each entry in arrayList is written to screen as String
         */
        for (Talkable thing: zoo) {
            printOut(thing);
        }
        /**
         * closes file
         */
        outFile.fileClose();
        /**
         * reads file
         */
        inFile.fileRead();
        /**
         * closes file
         */
        inFile.fileClose();
        /**
         * names file
         */
        FileInput indata = new FileInput("animals.txt");
        String line;
        /**
         * prints information from file as long as line has information on it
         */
        while ((line = indata.fileReadLine()) != null) {
            System.out.println(line);
        }
    }

    /**
     * Prints out pet name followed by what that animal says as String. Also writes to file.
     * @param p
     */
    public static void printOut(Talkable p)  {
        System.out.println(p.getName() + " says=" + p.talk());
        outFile.fileWrite(p.getName() + "|" + p.talk());
    }
}
