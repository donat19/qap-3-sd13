/**
 * QAP 3 SD13 - Problem 1: Inheritance — HighSchool System
 * Teacher class that inherits from Person
 * 
 * @author Ivan
 * @date July 2025
 */
public class Teacher extends Person {
    // Additional fields for teacher
    private String employeeId;
    private String subject;
    private double salary;
    
    /**
     * Default constructor
     */
    public Teacher() {
        super(); // Call parent class constructor
        this.employeeId = "";
        this.subject = "";
        this.salary = 0.0;
    }
    
    /**
     * Parameterized constructor
     * @param name teacher's name
     * @param age teacher's age
     * @param gender teacher's gender
     * @param employeeId employee ID
     * @param subject subject taught
     * @param salary teacher's salary
     */
    public Teacher(String name, int age, String gender, String employeeId, String subject, double salary) {
        super(name, age, gender); // Call parent class constructor
        this.employeeId = employeeId;
        this.subject = subject;
        this.salary = salary;
    }
    
    // Getters for additional fields
    /**
     * Get employee ID
     * @return employee ID
     */
    public String getEmployeeId() {
        return employeeId;
    }
    
    /**
     * Get subject taught
     * @return subject
     */
    public String getSubject() {
        return subject;
    }
    
    /**
     * Get salary
     * @return teacher's salary
     */
    public double getSalary() {
        return salary;
    }
    
    // Setters for additional fields
    /**
     * Set employee ID
     * @param employeeId new employee ID
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    
    /**
     * Set subject taught
     * @param subject new subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    /**
     * Set salary
     * @param salary new salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    /**
     * String representation of the object
     * @return string with teacher information
     */
    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", subject='" + subject + '\'' +
                ", salary=$" + salary +
                '}';
    }
}
