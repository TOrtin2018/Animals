package edu.animals;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * Created by mgreen14 on 12/27/17.
 * Author Matt Green
 *
 * Class controls the file being read from
 */
public class FileInput {

    private BufferedReader in = null;
    private String fileName;

    /**
     * Writes to file
     * @param fileName name of file
     */
    public FileInput(String fileName) {
        this.fileName = fileName;
        try {
            in = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("File Open Error: " + fileName + " " + e);
        }
    }

    /**
     * Reads from file
     */
    public void fileRead() {
        String line;
        try {
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("File Write Error: " + fileName + " " + e);
        }
    }

    /**
     *
     * @return single line of file as String
     */

    public String fileReadLine() {
        try {
            String line = in.readLine();
            return line;
        } catch (Exception e) {
            System.out.println("File Write Error: " + fileName + " " + e);
            return null;
        }
    }

    /**
     * Closes file
     */
    public void fileClose() {
        if (in != null) {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}