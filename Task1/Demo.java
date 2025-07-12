/**
 * QAP 3 SD13 - Problem 1: Inheritance — HighSchool System
 * Demo class to test the inheritance hierarchy
 * 
 * @author Ivan
 * @date July 2025
 */
public class Demo {
    
    /**
     * Main method to demonstrate all classes
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("QAP 3 SD13 - Problem 1: HighSchool System");
        System.out.println("===========================================");
        System.out.println();
        
        // Create Person object
        System.out.println("1. Creating Person object:");
        Person person = new Person("John Smith", 35, "Male");
        System.out.println(person.toString());
        System.out.println();
        
        // Create Student object
        System.out.println("2. Creating Student object:");
        Student student = new Student("Anna Johnson", 16, "Female", "ST2025001", "Grade 11", 4.2);
        System.out.println(student.toString());
        System.out.println();
        
        // Create Teacher object
        System.out.println("3. Creating Teacher object:");
        Teacher teacher = new Teacher("Mary Wilson", 42, "Female", "T001", "Mathematics", 75000.0);
        System.out.println(teacher.toString());
        System.out.println();
        
        // Create CollegeStudent object
        System.out.println("4. Creating CollegeStudent object:");
        CollegeStudent collegeStudent = new CollegeStudent("Alex Brown", 20, "Male", 
                                                          "CS2023042", "Bachelor", 3.8, 
                                                          "Computer Science", 3);
        System.out.println(collegeStudent.toString());
        System.out.println();
        
        // Demonstrate using setters
        System.out.println("5. Demonstrating data modification through setters:");
        System.out.println("Changing student age from " + student.getAge() + " to 17");
        student.setAge(17);
        System.out.println("Updated student information:");
        System.out.println(student.toString());
        System.out.println();
        
        System.out.println("Changing teacher salary from $" + teacher.getSalary() + " to $80000");
        teacher.setSalary(80000.0);
        System.out.println("Updated teacher information:");
        System.out.println(teacher.toString());
        System.out.println();
        
        System.out.println("Promoting college student to next year:");
        System.out.println("Year changed from " + collegeStudent.getYear() + " to " + (collegeStudent.getYear() + 1));
        collegeStudent.setYear(collegeStudent.getYear() + 1);
        System.out.println("Updated college student information:");
        System.out.println(collegeStudent.toString());
        System.out.println();
        
        // Demonstrate polymorphism
        System.out.println("6. Demonstrating polymorphism:");
        Person[] people = {person, student, teacher, collegeStudent};
        
        for (int i = 0; i < people.length; i++) {
            System.out.println("Object " + (i + 1) + ": " + people[i].toString());
        }
        
        System.out.println();
        System.out.println("===========================================");
        System.out.println("Demo completed successfully!");
        System.out.println("===========================================");
    }
}
