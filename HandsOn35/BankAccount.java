package HandsOn35;
import java.util.ArrayList;
import java.util.List;

class BankAccount {
   public String accountNumber;
   public String accountHolderName;
   public double balance;
   public List<Transaction> transactions;

   public BankAccount(String accountNumber, String accountHolderName, double balance) {
       this.accountNumber = accountNumber;
       this.accountHolderName = accountHolderName;
       this.balance = balance;
       this.transactions = new ArrayList<>();
   }

   private void addTransaction(long ID, double amount, String type){
        transactions.add(new Transaction(ID, amount, type));
   }
   // information expert principle, better to enforce this in the bank account level
   public void deposit(double amount) {
    if (amount >0){
        balance += amount;
        addTransaction(randomID, amount, "DEPOSIT");
    }

    public void withdrawal(){

    }

    public boolean isValidAmount

}