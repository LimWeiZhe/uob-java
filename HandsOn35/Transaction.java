package HandsOn35;
import java.util.Date;
import java.util.UUID;

public class Transaction {
    if (type !="WITHDEAWAL" && type !="DEPOSIT"){
        throw new IllegalArgumentException("Transaction type must be either DEPOSIT or WITHDRAWAL");
    }

   public String transactionId;
   public double amount;
   public String type;
   public Date date;

   public Transaction(String transactionId, double amount, String type) {
       this.transactionId = transactionId;
       this.amount = amount;
       this.type = type;
       this.date = new Date();
    }

    
    
    public void addTransaction(BankAccount account, double amount, String type) {
       if (!isValidTransactionType(type)) {
           System.out.println("Invalid transaction type: " + type);
           return;
       }

       String transactionId = UUID.randomUUID().toString();
       Transaction transaction = new Transaction(transactionId, amount, type);
       account.transactions.add(transaction);
    }

   private static boolean isValidTransactionType(String type) {
    return "DEPOSIT".equals(type) || "WITHDRAWAL".equals(type);
    }
}
