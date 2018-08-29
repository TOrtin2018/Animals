package edu.animals;

/**
 * Created by mgreen14 on 12/27/17.
 * Author Matt Green
 *
 * Class Creates a Cat Object
 */
public class Cat extends Pet implements Talkable {
    private int mousesKilled;

    /**
     * Constructor that creates and initializes cat object
     *
     * @param mousesKilled # of mice killed
     * @param name name of cat
     */
    public Cat(int mousesKilled, String name) {
        super(name);
        this.mousesKilled = mousesKilled;
    }

    /**
     *
     * @return # of mice killed
     */
    public int getMousesKilled() {
        return mousesKilled;
    }

    /**
     * Method increases total # mice killed by 1
     */
    public void addMouse() {
        mousesKilled++;
    }

    /**
     *
     * @return what a cat says as a String
     */
    @Override
    public String talk() {
        return "Meow";
    }

    /**
     *
     * @return String of cat information
     */
    @Override
    public String toString() {
        return "Cat: " + "name=" + name + " mousesKilled=" + mousesKilled;
    }
}

