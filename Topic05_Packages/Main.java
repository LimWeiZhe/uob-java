package Topic05_Packages;

import Topic05_Packages.shipping.Transaction;
//import 'Topic05_Packages.accounting.Transaction' will result in a name clash


public class Main {
    // The 'Transaction' class below refers to the one from 'Topic05_Packages.shipping.Transaction'
    Transaction t = new Transaction("Yishun Ring Road Blk 666",
        "Tan Ah Kow", 123L);
    
    // Using the fully quantified name to a class
    Topic05_Packages.accounting.Transaction accountingTransaction = new Topic05_Packages.accounting.Transaction(100.0, 123L, 456L);





}
