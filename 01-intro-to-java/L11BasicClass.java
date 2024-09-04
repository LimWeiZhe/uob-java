public class L11BasicClass {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.firstName= "Jon";
        customer1.lastName = "Snow";
        System.out.println(customer1.firstName);
        System.out.println(customer1.lastName);

        Customer customer2 = new Customer();
        customer2.firstName = "Jamie";
        customer2.lastName = "Lannister";
        System.out.println(customer2.firstName);
        System.out.println(customer2.lastName);
    }
}
//define a new class
// ocne a class has been created,  we can use it as a data type
class Customer{
    // properties, or fields (sometimes known as attributes or member values)
    String firstName;
    String lastName;
}