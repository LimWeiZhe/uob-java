public class L14Constructors {
    public static void main(String[] args) {
        Customer c = new Customer();
        System.out.println(c.getFirstName());
        System.out.println(c.getLastName());
        System.out.println(c.getMonthsInSystem());

        Bill b = new Bill();
        System.out.println(b.getReference());
        System.out.println(b.getTotal());

        Bill b2 = new Bill(null, 0);

    }
}

class Bill {
    private String reference;
    private double total;

    public Bill() {
        reference = "0000";
        total = 0.0;
    }

    // overloaded constructor = default constructor + setter
    // an overloaded method is a method that the same as another method
    // but with data types as paramenters
    public Bill(String reference, double total) {
        this.reference = reference;
        this.total = total;
    }
    // can add more constructors with different method signatures
    public Bill(String reference){
        this.reference = reference;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}

class Customer {
    private String firstName; // for a variable that stores an object, the default value is null
    private String lastName;
    private int monthsInSystem; // for any primitive, the default is 0
    // a constructor is a method which name is the same as the class and is usually
    // public
    // allow us to assign initial values of the members of a class

    public Customer() {
        firstName = "N/A";
        lastName = "N/A";

    }

    public Customer(String firstName, String lastName){

    }


    public String getFirstName() {
        return firstName;
    }

    // setter allows us to change the value of a property of the class
    public void setFirstName(String newFirstName) {
        // assign newFirstName to be the new value of the firstName property
        firstName = newFirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    // public void setLastName(String lastName){
    // this.lastName = lastName;
    // } use 'this' when using the same name for the variables, the one with 'this'
    // refers to the one linked to the class

    public int getMonthsInSystem() {
        return monthsInSystem;
    }

    public void setMonthsInSystem(int monthsInSystem) {
        if (monthsInSystem >= 0) {
            this.monthsInSystem = monthsInSystem;
        }
    }
}