import java.util.Scanner;

public class L06Scanner {
    public static void main(String[] args) {
        // A class is a predefined 'container' (or 'package') that consists of data and functionality
        // In other words, a class provides some kind of feature or functionality
        // Before we can use a class. we must create an object (an instance) of the class
        // 'sc' is a variable that can store objects (aka instances) of Scanner 
        Scanner sc = new Scanner(System.in); // System.in => keyboard by default
        System.out.println("Enter your name");
        String name = sc.nextLine(); // read the next input as a string and return it as a string
        System.out.println("Hello " + name ); 

        //ask the user for the weight
        System.out.println("Enter your weight");
        double weight = sc.nextDouble();

        System.out.println("Enter your height");
        double height = sc.nextDouble();

        double BMI = weight/(height*height);
        
        System.out.println("Your BMI is " + BMI);


    }
}
