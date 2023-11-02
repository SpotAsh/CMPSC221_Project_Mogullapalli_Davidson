// course class
public class Course {
    // variables
    private String courseNumber;
    private int numberOfCredits;
    private double pricePerCredit;

    // default constructor
    public Course(){
        courseNumber = "";
        numberOfCredits = 0;
        pricePerCredit = 500.00;
    }

    // overloaded constructor
    public Course(String courseNumber, int numberOfCredits, double pricePerCredit){
        this.courseNumber = courseNumber;
        this.numberOfCredits = numberOfCredits;
        this.pricePerCredit = pricePerCredit;
    }

    // setters
    public void setCourseNumber(){ this.courseNumber = courseNumber;}
    public  void setNumberOfCredits(){ this.numberOfCredits = numberOfCredits;}
    public void setPricePerCredit() { this.pricePerCredit = pricePerCredit;}

    // getters
    public String getCourseNumber() {return courseNumber;}
    public int getNumberOfCredits() {return numberOfCredits;}
    public double getPricePerCredit() {return pricePerCredit;}

    // display information
    public void displayCourseInformation(){
        System.out.println("Course Number: " + courseNumber);
        System.out.println("Number of Credits: " + numberOfCredits);
        System.out.println("Price per credit: " + pricePerCredit);
    }
}
