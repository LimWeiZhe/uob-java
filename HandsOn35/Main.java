package HandsOn35;

import java.util.Date;
import java.util.UUID;

public class Main {
   public static void main(String[] args) {
       BankAccount account = new BankAccount("123456", "John Doe", 1000.0);

       // Attempting to deposit money
       if (account.isValidAmount(500.0)) {
           account.balance += 500.0;
           addTransaction(account, 500.0, "DEPOSIT");
       }

       // Attempting to withdraw money with balance check
       double withdrawalAmount = 2000.0;
       if (isValidAmount(withdrawalAmount) && account.balance >= withdrawalAmount) {
           account.balance -= withdrawalAmount;
           addTransaction(account, -withdrawalAmount, "WITHDRAWAL");
       } else {
           System.out.println("Withdrawal failed: Insufficient funds or invalid amount");
       }

       // Attempting to withdraw a valid amount
       withdrawalAmount = 300.0;
       if (isValidAmount(withdrawalAmount) && account.balance >= withdrawalAmount) {
           account.balance -= withdrawalAmount;
           addTransaction(account, -withdrawalAmount, "WITHDRAWAL");
       }

       // Attempting to modify transaction details (which shouldn't be allowed)
       if (!account.transactions.isEmpty()) {
           Transaction lastTransaction = account.transactions.get(account.transactions.size() - 1);
           // This modification shouldn't be possible in a well-encapsulated system
           lastTransaction.amount = -1500.0;
           lastTransaction.date = new Date(lastTransaction.date.getTime() - 86400000); // Subtract one day
       }

       // Printing account details
       System.out.println("Account Number: " + account.accountNumber);
       System.out.println("Account Holder: " + account.accountHolderName);
       System.out.println("Balance: $" + account.balance);
       System.out.println("Transactions:");
       for (Transaction t : account.transactions) {
           System.out.println("  " + t.transactionId + ": $" + t.amount + " (" + t.type + ") on " + t.date);
       }
   }






