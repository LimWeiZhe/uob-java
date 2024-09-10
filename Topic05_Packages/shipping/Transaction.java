package Topic05_Packages.shipping;

public class Transaction {
    private Address address;
    private String recipientName;
    private Long shipmentID;

    public Transaction(String destinationAddress, String recipientName, Long shipmentID) {
        this.address = new Address(recipientName, recipientName, destinationAddress, address.unitNumber, address.region);
        this.recipientName = recipientName;
        this.shipmentID = shipmentID;
    }
    
    @Override
    public String toString(){
        // use package access to get the streetname
        return address.streetName;
    }

    //package only access
    void doSomeProcessing(){

    }
}
