package edu.animals;

/**
 * Created by mgreen14 on 12/27/17.
 * Author Matt Green
 */
public class Dog extends Pet implements Talkable {
    private boolean friendly;

    /**
     * Constructor that creates and initializes Dog Object
     * @param friendly boolean if dog is friendly or not
     * @param name name of dog
     */
    public Dog(boolean friendly, String name) {
        super(name);
        this.friendly = friendly;
    }

    /**
     *
     * @return boolean friendly, dog is or is not friendly
     */
    public boolean isFriendly() {
        return friendly;
    }

    /**
     *
     * @return what a dog says as a String
     */
    @Override
    public String talk() {
        return "Bark";
    }

    /**
     *
     * @return description of Dog Object as a String
     */
    @Override
    public String toString() {
        return "Dog: " + "name=" + name + " friendly=" + friendly;
    }


}