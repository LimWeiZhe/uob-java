public class L12PrivateAcces {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        //if all properties can be publically accessed and modified
        // it is hard to implement validation
        // customer1.monthsInSystem = -12;
        // customer1.firstName = null; does not work
        customer1.setFirstName("Jon");
        System.out.println(customer1.getFirstName());
        customer1.setMonthsInSystem(-112); 
        // this will not be assigned based on conditions
        System.out.println(customer1.getFirstName());
    
    }
}
class Customer{
    // if a member of a class is marked as private
    // it means only methods in that class can access it
    // and no other classes could
    private String firstName;
    private String lastName;
    private int monthsInSystem;

    //getter and setter methods
    //public access means can be accessed or used by any class
    public String getFirstName(){
        return firstName;
    }

    //setter allows us to change the value of a property of the class
    public void setFirstName(String newFirstName) {
        // assign newFirstName to be the new value of the firstName property
        firstName = newFirstName;
    }
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String newLastName){
        lastName = newLastName;
    }

    // public void setLastName(String lastName){
    //     this.lastName = lastName;
    // }  use 'this' when using the same name for the variables, the one with 'this' refers to the one linked to the class

    public int getMonthsInSystem(){
        return monthsInSystem;
    }
    public void setMonthsInSystem(int monthsInSystem){
        if (monthsInSystem >=0){
            this.monthsInSystem = monthsInSystem;
        }
    }

    
}