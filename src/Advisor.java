import java.util.Date;  //needed for hiredDate

public class Advisor extends People{
    private String title;
    private double annualSalary;
    private Date hiredDate;
    private Student[] advisees;

    //constructor
    public Advisor(String firstName, String middleName, String lastName, String ID, int phone, String email,
                   int street_number, String city, String state, int zipcode,
                   String title, double annualSalary, Date hiredDate, Student[] advisees) {
        super(firstName, middleName, lastName, ID, phone, email, street_number, city, state, zipcode);
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

    @Override
    public void Payment(){
        double monthlyPayment = annualSalary / 2;
        System.out.println("Advisor's monthyl payment: " + monthlyPayment);
    }
    public void display(){
        System.out.println("Name: ");
    }
}
