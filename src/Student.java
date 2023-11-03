import java.time.LocalDate;
import java.util.Arrays;

public class Student extends People{
    private String major;
    private double tuitionPerSemester;
    private LocalDate admittedDate;
    private Course[] courses;

    //constructor
    public Student(String firstName, String middleName, String lastName, String academicID, int phone, String email,
                   int street_number, String city, String state, int zipcode, String major, double tuitionPerSemester,
                   LocalDate admittedDate, Course[] courses){
        super(firstName, middleName, lastName, academicID, phone, email, street_number, city, state, zipcode);
        this.major = major;
        this.tuitionPerSemester = tuitionPerSemester;
        this.admittedDate = admittedDate;
        this.courses =  courses;
    }

    //getters and setters

    public void setMajor(String major) { this.major = major; }
    public String getMajor() { return major; }

    public void setTuitionPerSemester(double tuitionPerSemester) { this.tuitionPerSemester = tuitionPerSemester; }
    public double getTuitionPerSemester() { return tuitionPerSemester; }

    public void setAdmittedDate(LocalDate admittedDate) { this.admittedDate = admittedDate; }
    public LocalDate getAdmittedDate() { return admittedDate; }

    public void setCourses(Course[] courses) { this.courses = courses; }
    public Course[] getCourses() { return courses; }

    // superclass method ??
    @Override
    public void Payment(){
      double tuition = tuitionPerSemester;
      System.out.println("The Student's total tuition per Semester is: $" +tuition);
    }

    // display student's information
    public void display(){
        System.out.println("Major: " + major);
        System.out.println("Tuition Per Semester: " + tuitionPerSemester);
        System.out.println("Admission Date: " + admittedDate);
        System.out.println("Course: " + Arrays.toString(courses)); // TODO: make it a loop?
    }
}
