import java.util.Date;  //needed for admitted date

public class Student extends People{
    private String major;
    private double tuitionPerSemester;
    private Date admittedDate;
    private Course[] courses;

    //constructor
    public Student(String major, double tuitionPerSemester, Date admittedDate, Course[] courses){
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

    public void setAdmittedDate(Date admittedDate) { this.admittedDate = admittedDate; }
    public Date getAdmittedDate() { return admittedDate; }

    public void setCourses(Course[] courses) { this.courses = courses; }
    public Course[] getCourses() { return courses; }
}
