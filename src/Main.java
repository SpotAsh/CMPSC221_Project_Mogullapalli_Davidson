import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Creating a course
        Course course1 = new Course("CS101", 3, 500.00);
        Course course2 = new Course("Math101", 4, 450.00);

        // Creating an array of courses
        Course[] courses = {course1, course2};

        // Creating a student
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date admittedDate = null;
        try {
            admittedDate = dateFormat.parse("2023-09-01");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Student student = new Student("John", "Doe", "Smith", "12345", 555555555, "john@example.com",
                123, "Springfield", "IL", 62701, "Computer Science", 2500.00, admittedDate, courses);

        // Creating an advisor
        Date hiredDate = null;
        try {
            hiredDate = dateFormat.parse("2022-01-15");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Advisor advisor = new Advisor("Alice", "Advisor", "Johnson", "56789", 555555556, "alice@example.com",
                456, "Springfield", "IL", 62702, "Academic Advisor", 60000.00, hiredDate, new Student[]{student});

        // Display student information
        System.out.println("Student Information:");
        student.display();
        student.Payment();  // Calling the Payment method of the student

        // Display advisor information
        System.out.println("\nAdvisor Information:");
        advisor.display();
        advisor.Payment();  // Calling the Payment method of the advisor
    }
}