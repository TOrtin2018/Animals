package edu.animals;

/**
 * Created by mgreen14 on 12/27/17.
 * Author Matt Green
 *
 * Class creates and controls student object
 */
public class Student extends Person implements Talkable {
    private int age;

    /**
     * Construct creates and initializes student object
     * @param age age of student
     * @param name name of student
     */
    public Student(int age, String name) {
        super(name);
        this.age = age;
    }

    /**
     * returns age of student object
     * @return int age
     */
    public int getAge() {
        return age;
    }

    /**
     * sets age of student object
     * @param age age of student
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * returns what the student object would say as a String
     * @return String
     */
    @Override
    public String talk() {
        return "Can we talk about my grade.";
    }
}
