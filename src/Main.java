import java.time.LocalDate;


class Main {
    public static void main(String[] args) {
        // creating courses
        Course course1 = new Course("COMP SCI 131", 3, 500.00);
        Course course2 = new Course("Math 141", 4, 450.00);
        Course course3 = new Course("Art 50", 3, 350.00);

        // array for courses
        Course[] courses = {course1, course2, course3};

        // creating students
        LocalDate admittedDate = LocalDate.of(2023, 9, 1);
        Student student = new Student("John", "Doe", "Smith", "12345", 555555555, "john@example.com",
                123, "Springfield", "IL", 62701, "Computer Science", 2500.00, admittedDate, courses);

        // creating advisor
        LocalDate hiredDate = LocalDate.of(2022, 1, 15);
        Advisor advisor = new Advisor("Alice", "Advisor", "Johnson", "56789", 555555556, "alice@example.com",
                456, "Springfield", "IL", 62702, "Academic Advisor", 60000.00, hiredDate, new Student[]{student});

        // displaying student information
        System.out.println("Student Information:");
        student.display();
        student.Payment();  // Calling the Payment method of the student

        // displaying advisor's information
        System.out.println("\nAdvisor Information:");
        advisor.display();
        advisor.Payment();  // Calling the Payment method of the advisor
    }
}
