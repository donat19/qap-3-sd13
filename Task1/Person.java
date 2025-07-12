/**
 * QAP 3 SD13 - Problem 1: Inheritance — HighSchool System
 * Base Person class for the school system
 * 
 * @author Ivan
 * @date July 2025
 */
public class Person {
    // Private fields
    private String name;
    private int age;
    private String gender;
    
    /**
     * Default constructor
     */
    public Person() {
        this.name = "";
        this.age = 0;
        this.gender = "";
    }
    
    /**
     * Parameterized constructor
     * @param name person's name
     * @param age person's age
     * @param gender person's gender
     */
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    // Getters
    /**
     * Get the name
     * @return person's name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Get the age
     * @return person's age
     */
    public int getAge() {
        return age;
    }
    
    /**
     * Get the gender
     * @return person's gender
     */
    public String getGender() {
        return gender;
    }
    
    // Setters
    /**
     * Set the name
     * @param name new name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Set the age
     * @param age new age
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    /**
     * Set the gender
     * @param gender new gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    /**
     * String representation of the object
     * @return string with person information
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
