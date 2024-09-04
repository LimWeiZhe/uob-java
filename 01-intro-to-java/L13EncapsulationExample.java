import java.util.Scanner;

public class L13EncapsulationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter last name: ");
        String lastName = sc.nextLine();
        // using getter and setter is compulsory so that the conditions are compulsory
        // by not putting the business rules in the setters, it means that anytime we
        // change the firstName,
        // we need to write an IF statement
        Employee e = new Employee();
        e.firstName = firstName;
        e.lastName = lastName;

    }
}

class Employee {
    public String firstName;
    public String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() > 0) {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}