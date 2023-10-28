import java.util.Date;  //needed for hiredDate

public class Advisor extends People{
    private String title;
    private double annualSalary;
    private Date hiredDate;
    private Student[] advisees;

    //constructor
    public Advisor(String title, double annualSalary, Date hiredDate, Student[] advisees) {
        this.title = title;
        this.annualSalary = annualSalary;
        this.hiredDate = hiredDate;
        this.advisees = advisees;
    }

    //getters and setters
    public void setTitle(String title) { this.title = title; }
    public String getTitle() { return title; }

    public void setAnnualSalary(double annual_salary) { this.annualSalary = annual_salary; }
    public double getAnnualSalary() { return annualSalary; }

    public void setHiredDate(Date hiredDate) { this.hiredDate = hiredDate; }
    public Date getHiredDate() { return hiredDate; }

    public void setAdvisees(Student[] advisees) { this.advisees = advisees; }
    public Student[] getAdvisees() { return advisees; }
}
