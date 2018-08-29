package edu.animals;

/**
 * Created by mgreen14 on 12/27/17.
 * Author Matt Green
 * Version 1.5
 *
 * Class sets the name of any given pet type
 */
public abstract class Pet {
    protected String name;
    public Pet(String name) {
        this.name = name;
    }

    /**
     *
     * @return String name of pet
     */
    public String getName() {
        return name;
    }


}