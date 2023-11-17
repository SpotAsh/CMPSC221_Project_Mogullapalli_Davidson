import java.time.LocalDate; // getting the time
import java.time.format.DateTimeFormatter; // formatting the time
import java.time.format.DateTimeParseException;  // error checking the time
import java.util.ArrayList;
import java.util.List;  // to use lists
import java.util.Scanner;  // for user inputs

public class Main {
    private static List<Advisor> advisors = new ArrayList<>();

    public static void main(String[] args) {
        // Sample data
        loadSampleData();

        Scanner scanner = new Scanner(System.in);

        //loop through the menu while true
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Advisor");
            System.out.println("2. Edit Advisor");
            System.out.println("3. Delete Advisor");
            System.out.println("4. Display Advisor Information");
            System.out.println("5. Exit");

            System.out.print("Please select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addAdvisor();
                case 2 -> editAdvisor();
                case 3 -> deleteAdvisor();
                case 4 -> displayAdvisorInformation();
                case 5 -> {
                    System.out.println("Exiting the application.");
                    System.exit(0);
                }
                default -> System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }

    private static void addAdvisor() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adding an advisor...");

        // Get input for advisor details
        System.out.print("Enter the first name: ");
        String firstName = scanner.next();

        System.out.println("Enter the middle name: ");
        String middleName = scanner.next();

        System.out.print("Enter the last name: ");
        String lastName = scanner.next();

        System.out.print("Enter the ID: ");
        String ID = scanner.next();

        System.out.print("Enter the phone number: ");
        int phone = Integer.parseInt(scanner.next());

        System.out.print("Enter the email: ");
        String email = scanner.next();

        System.out.print("Enter the street: ");
        String street_number = scanner.next();

        System.out.print("Enter the city: ");
        String city = scanner.next();

        System.out.print("Enter the state: ");
        String state = scanner.next();

        System.out.print("Enter the zipcode: ");
        int zipcode = Integer.parseInt(scanner.next());

        System.out.print("Enter the title: ");
        String title = scanner.next();

        System.out.print("Enter the annual salary: ");
        double annualSalary = Double.parseDouble(scanner.next());

        System.out.print("Enter the hire date (yyyy-MM-dd): ");
        LocalDate hiredDate = LocalDate.parse(scanner.next());

        // Create and add a new advisor to the list
        Advisor newAdvisor = new Advisor(firstName, middleName, lastName, ID, phone, email, street_number, city, state,
                zipcode, title, annualSalary, hiredDate, new Student[]{});

        advisors.add(newAdvisor);

        System.out.println("Advisor added successfully.");
    }

    private static void editAdvisor() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Editing an advisor...");

        // Provide a list of advisors
        System.out.println("Select an advisor to edit:");

        for (int i = 0; i < advisors.size(); i++) {
            System.out.println((i + 1) + ". " + advisors.get(i).getFName() + " " + advisors.get(i).getLName());
        }

        System.out.print("Enter the advisor number to edit: ");
        int advisorNumber = scanner.nextInt();

        if (advisorNumber >= 1 && advisorNumber <= advisors.size()) {
            Advisor advisorToEdit = advisors.get(advisorNumber - 1);

            System.out.println("Editing the advisor: " + advisorToEdit.getFName() + " " + advisorToEdit.getLName());

            // Get the details for the selected advisor and update them
            System.out.print("Enter the new first name: ");
            advisorToEdit.setFName(scanner.next());

            System.out.print("Enter the new last name: ");
            advisorToEdit.setLName(scanner.next());

            System.out.print("Enter the new ID: ");
            advisorToEdit.setID(scanner.next());

            System.out.print("Enter the new phone number: ");
            advisorToEdit.setPhoneNumber(scanner.nextInt());

            System.out.print("Enter the new email: ");
            advisorToEdit.setEmail(scanner.next());

            System.out.print("Enter the new street number: ");
            advisorToEdit.setStreetNumber(String.valueOf(scanner.next()));

            System.out.print("Enter the new city: ");
            advisorToEdit.setCity(scanner.next());

            System.out.print("Enter the new state: ");
            advisorToEdit.setState(scanner.next());

            System.out.print("Enter the new ZIP code: ");
            advisorToEdit.setZipcode(scanner.nextInt());

            System.out.print("Enter the new title: ");
            advisorToEdit.setTitle(scanner.next());

            System.out.print("Enter the new annual salary: ");
            advisorToEdit.setAnnualSalary(scanner.nextDouble());

            System.out.print("Enter the new hired date (yyyy-MM-dd): ");
            try {
                String hiredDateString = scanner.next();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate hiredDate = LocalDate.parse(hiredDateString, formatter);
                advisorToEdit.setHiredDate(hiredDate);
            } catch (DateTimeParseException e) {
                e.printStackTrace();
                // if the input doesn't match the given format, the code will throw an error and
                // tell the user what the correct format is
            }

            System.out.println("Advisor information updated successfully.");
        } else {
            System.out.println("Invalid advisor number. Please choose a valid advisor to edit.");
        }

    }

    private static void deleteAdvisor() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Deleting an advisor...");

        // Provide a list of advisors to choose from
        System.out.println("Select an advisor to delete:");

        for (int i = 0; i < advisors.size(); i++) {
            System.out.println((i + 1) + ". " + advisors.get(i).getFName() + " " + advisors.get(i).getLName());
        }

        System.out.print("Enter the advisor number to delete: ");
        int advisorNumber = scanner.nextInt();

        if (advisorNumber >= 1 && advisorNumber <= advisors.size()) {
            Advisor deletedAdvisor = advisors.remove(advisorNumber - 1);
            System.out.println(deletedAdvisor.getFName() + " " + deletedAdvisor.getLName() + " has been deleted.");
        } else {
            System.out.println("Invalid advisor number. Please choose a valid advisor to delete.");
        }
    }


    private static void displayAdvisorInformation() {
        // Display information of all advisors and their advisees
        System.out.println("Advisor Information:");
        for (Advisor advisor : advisors) {
            advisor.display();
            System.out.println("Advisees Information:");
            for (Student student : advisor.getAdvisees()) {
                student.display();
            }
        }
    }

    private static void loadSampleData() {
        // Create a course
        Course course1 = new Course("CS101", 3, 500.00);
        Course course2 = new Course("Math101", 4, 450.00);

        // Create an array of courses
        Course[] courses = {course1, course2};

        // Create a student
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate admittedDate = null;
        try {
            admittedDate = LocalDate.parse("2023-09-01", formatter1);
        } catch (DateTimeParseException e) {
            e.printStackTrace();
        }
        Student student = new Student("John", "Doe", "Smith", "12345",
                555555555, "john@example.com", "123", "Springfield", "IL",
                62701, "Computer Science", 2500.00, admittedDate, courses);

        // Create an advisor
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate hiredDate = null;
        try {
            hiredDate = LocalDate.parse("2022-01-15", formatter2);
        } catch (DateTimeParseException e) {
            e.printStackTrace();
        }
        Advisor advisor = new Advisor("Alice", "Advisor", "Johnson", "56789",
                555555556, "alice@example.com", "456", "Springfield", "IL",
                62702, "Academic Advisor", 60000.00, hiredDate, new Student[]{student});

        advisors.add(advisor);
    }
}

/*
Menu:
1. Add Advisor
2. Edit Advisor
3. Delete Advisor
4. Display Advisor Information
5. Exit
Please select an option (1-5): 1

Adding an advisor...
Enter the first name: Alice
Enter the last name: Advisor
Enter the ID: 12345
Enter the phone number: 555555555
Enter the email: alice@example.com
Enter the street number: 123
Enter the city: Springfield
Enter the state: IL
Enter the ZIP code: 62702
Enter the title: Academic Advisor
Enter the annual salary: 60000.00
Enter the hired date (yyyy-MM-dd): 2022-01-15
Advisor added successfully.

Menu:
1. Add Advisor
2. Edit Advisor
3. Delete Advisor
4. Display Advisor Information
5. Exit
Please select an option (1-5): 2

Editing an advisor...
Select an advisor to edit:
1. Alice Advisor
Enter the advisor number to edit: 1
Enter the new first name: Bob
Advisor information updated successfully.

Menu:
1. Add Advisor
2. Edit Advisor
3. Delete Advisor
4. Display Advisor Information
5. Exit
Please select an option (1-5): 3

Deleting an advisor...
Select an advisor to delete:
1. Bob Advisor
Enter the advisor number to delete: 1
Bob Advisor has been deleted.

Menu:
1. Add Advisor
2. Edit Advisor
3. Delete Advisor
4. Display Advisor Information
5. Exit
Please select an option (1-5): 4

Advisor Information:

Menu:
1. Add Advisor
2. Edit Advisor
3. Delete Advisor
4. Display Advisor Information
5. Exit
Please select an option (1-5): 5

Exiting the application.

*/