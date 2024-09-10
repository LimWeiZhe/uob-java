package Topic05_Packages.shipping;

// only classes within the shipping package(i.e the package that we are in right now),
// can create, access, and mutate Address objects)
//Note: no access modifier before the 'class' means "package access"
class Address {
    // if a variable has no access modifier, then it is assumed to be 'package access'
    // all other classes in the same package can modify it
    String streetName;
    String buildingNumber;
    String postalCode;
    String unitNumber;
    int region;

    public Address(String streetName, String buildingNumber, String postalCode, String unitNumber, int region) {
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
        this.postalCode = postalCode;
        this.unitNumber = unitNumber;
        this.region = region;
    }

    String getAddress(){
        return streetName + " " + buildingNumber + " " + unitNumber + " " + postalCode + " " + region;
    }
}
