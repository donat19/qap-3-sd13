/**
 * QAP 3 SD13 - Problem 1: Inheritance — HighSchool System
 * CollegeStudent class that inherits from Student
 * 
 * @author Ivan
 * @date July 2025
 */
public class CollegeStudent extends Student {
    // Additional fields for college student
    private String major;
    private int year;
    
    /**
     * Default constructor
     */
    public CollegeStudent() {
        super(); // Call parent class constructor
        this.major = "";
        this.year = 1;
    }
    
    /**
     * Parameterized constructor
     * @param name student's name
     * @param age student's age
     * @param gender student's gender
     * @param studentId student's ID
     * @param grade student's grade/class
     * @param gpa student's GPA
     * @param major student's major
     * @param year year of study
     */
    public CollegeStudent(String name, int age, String gender, String studentId, String grade, 
                         double gpa, String major, int year) {
        super(name, age, gender, studentId, grade, gpa); // Call parent class constructor
        this.major = major;
        this.year = year;
    }
    
    // Getters for additional fields
    /**
     * Get major
     * @return student's major
     */
    public String getMajor() {
        return major;
    }
    
    /**
     * Get year of study
     * @return year of study
     */
    public int getYear() {
        return year;
    }
    
    // Setters for additional fields
    /**
     * Set major
     * @param major new major
     */
    public void setMajor(String major) {
        this.major = major;
    }
    
    /**
     * Set year of study
     * @param year new year
     */
    public void setYear(int year) {
        this.year = year;
    }
    
    /**
     * String representation of the object
     * @return string with college student information
     */
    @Override
    public String toString() {
        return "CollegeStudent{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", studentId='" + getStudentId() + '\'' +
                ", grade='" + getGrade() + '\'' +
                ", gpa=" + getGpa() +
                ", major='" + major + '\'' +
                ", year=" + year +
                '}';
    }
}
