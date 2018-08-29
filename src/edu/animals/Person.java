package edu.animals;

/**
 * Created by mgreen14 on 12/27/17.
 * Author Matt Green
 *
 * Class creates and controls person object
 */
public abstract class Person {
    private String name;

    /**
     * Constructor that creates and initializes person object
     * @param name of person
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     *
     * @return name of person as a String
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name of person object
     * @param name of person
     */
    public void setName(String name) {
        this.name = name;
    }


}