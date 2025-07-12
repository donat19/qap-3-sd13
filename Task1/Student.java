/**
 * QAP 3 SD13 - Problem 1: Inheritance — HighSchool System
 * Student class that inherits from Person
 * 
 * @author Ivan
 * @date July 2025
 */
public class Student extends Person {
    // Additional fields for student
    private String studentId;
    private String grade;
    private double gpa;
    
    /**
     * Default constructor
     */
    public Student() {
        super(); // Call parent class constructor
        this.studentId = "";
        this.grade = "";
        this.gpa = 0.0;
    }
    
    /**
     * Parameterized constructor
     * @param name student's name
     * @param age student's age
     * @param gender student's gender
     * @param studentId student's ID
     * @param grade student's grade/class
     * @param gpa student's GPA
     */
    public Student(String name, int age, String gender, String studentId, String grade, double gpa) {
        super(name, age, gender); // Call parent class constructor
        this.studentId = studentId;
        this.grade = grade;
        this.gpa = gpa;
    }
    
    // Getters for additional fields
    /**
     * Get student ID
     * @return student ID
     */
    public String getStudentId() {
        return studentId;
    }
    
    /**
     * Get grade/class
     * @return student's grade
     */
    public String getGrade() {
        return grade;
    }
    
    /**
     * Get GPA
     * @return student's GPA
     */
    public double getGpa() {
        return gpa;
    }
    
    // Setters for additional fields
    /**
     * Set student ID
     * @param studentId new student ID
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
    /**
     * Set grade/class
     * @param grade new grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    /**
     * Set GPA
     * @param gpa new GPA
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    /**
     * String representation of the object
     * @return string with student information
     */
    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", studentId='" + studentId + '\'' +
                ", grade='" + grade + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
