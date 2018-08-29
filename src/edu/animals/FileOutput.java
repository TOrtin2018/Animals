package edu.animals;

import java.io.*;

/**
 * Created by mgreen14 on 12/27/17.
 * Author Matt Green
 *
 * Class controls file being written to
 */
public class FileOutput {

    Writer out = null;
    private String fileName;

    /**
     * Opens file to write to
     * @param fileName name of file
     */
    public FileOutput(String fileName) {
        this.fileName = fileName;
        try {
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));
        }
        catch(FileNotFoundException e) {
            System.out.println("File Open Error: " + fileName + " "  + e);
        }
    }

    /**
     * Writes to File
     * @param line line of file
     */
    public void fileWrite(String line) {
        try {
            out.write(line+"\n");
        }
        catch(Exception e) {
            System.out.println("File Write Error: " + fileName + " "  + e);
        }
    }

    /**
     * Closes File
     */
    public void fileClose() {
        if (out != null) {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}