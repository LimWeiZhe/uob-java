import java.util.ArrayList;

public class L15Inheritance {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount("Jon","Snow",1000,1.5);
        System.out.println(account);

        // when we define a class we are defining a new data type
        // This arraylist can only store instances of SavingsAccount
        ArrayList<SavingsAccount> accounts = new ArrayList<SavingsAccount>();
        accounts.add(account); // works
        // accounts.add(new CheckingAccount()); <-- error

        // what if we want to be able to store chacking accounts and saving account?
        // use the parent class
        ArrayList<BankAccount> allAccounts = new ArrayList<BankAccount>();
        allAccounts.add(new SavingsAccount());
        allAccounts.add(new CheckingAccount());
    }
}

// do inheritance with extends
// the child class inherits all the properties and methods of the parent class
// syntax: class <child class> extends <parent class> {}
class SavingsAccount extends BankAccount{
    private double interestRate;

    // set default interest rate to 0.001
    public SavingsAccount(){
        super(); // 'super' here refers to the parent class
        interestRate = 0.001;
    }

    //overloaded constructor
    public SavingsAccount(String firstName, String lastName, double balance, double interestRate){
        super(firstName, lastName, balance); // 'super' here refers to the parent class
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public String getInfo(){
        // return a string that shows the balance, the interest rate and the first name and last name
        // note: we need to use getFirstName() because firstName is private in the parent class
        // whereas lastName and 
        return getFirstName() + " " + lastName + balance;
    }

    public String toString(){
        return getFirstName()+" " + lastName + ", balance = " + balance +  ", interest rate = " + interestRate;
    }

}   

class CheckingAccount extends BankAccount{

    private double overdraftLimit;
    public CheckingAccount(){
        super();
        overdraftLimit = 0.0;
    }

    public CheckingAccount(String firstName,String lastName,double balance, double overdraftLimit){
        super(firstName, lastName, balance);      
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
    
    
}

class BankAccount{
    private String firstName; // best practice is private tho
    protected String lastName; // protected means descendant classes can access
    protected double balance;

    public BankAccount() {
        firstName ="N/A";
        lastName ="N/A";
        balance = 0;
    }

    public BankAccount(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString(){
        return  firstName + lastName + balance ;
    }

}

// inheritance chain
// class DebitCardAccount extends SavingsAccount{
//     private String creditCardNumber;
//     private int cvc;

//     public DebitCardAccount(String firstName, String lastName, double balance, 
//     double interestRate, String creditCardNumber, int cvc){
//         super(firstName, lastName, balance, interestRate);
//         this.creditCardNumber = creditCardNumber;
//         this.cvc = cvc;
//     }
// }

// How to support saving accounts and checking account
// savings accounts has interest rate, but no overdraft limit
// checking accounts don't have interest rate, but have overdraft limit
// monolithic class = class that has a lot of objects but not everything is used all the time