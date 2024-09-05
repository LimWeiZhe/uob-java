import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        //Polymorphism "of many forms"
        // A more generic reference can store a more specific object
        Product product = new DigitalProduct();
        Product product2 = new PhysicalProduct();

        // one issue: since the variable type is "Product"
        // we cannot use it to refer to any of the methods that the child will have
        // product.getFileName(); will not work

        //this works, but is considered bad practice
        ((DigitalProduct)product).getFileName();

        // if a reference of a more generic type can store an instance of a more specific type
        // that's the case for ArrayList and other collections
        ArrayList<Product> catalog = new ArrayList<>();
        catalog.add(new DigitalProduct());
        catalog.add(new PhysicalProduct());
        for (Product p : catalog){
            System.out.println(p);
        }

    }
    
}
