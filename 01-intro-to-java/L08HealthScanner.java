import java.util.Scanner;

public class L08HealthScanner {
    public static void main(String[] args) {
        // A class is a predefined 'container' (or 'package') that consists of data and functionality
        // In other words, a class provides some kind of feature or functionality
        // Before we can use a class. we must create an object (an instance) of the class
        // 'sc' is a variable that can store objects (aka instances) of Scanner 
        Scanner sc = new Scanner(System.in); // System.in => keyboard by default

        //ask the user for the weight
        System.out.println("Enter your weight");
        double weight = sc.nextDouble();

        System.out.println("Enter your height");
        double height = sc.nextDouble();

        double BMI = weight/(height*height);
        
        System.out.println("Your BMI is " + BMI);

        if (BMI<18.5) {
            System.out.println("Underweight");
        }

        if(BMI<25 && BMI>=18.5){
            System.out.println("Healthy Weight");
        }

        if(BMI>= 25 && BMI<30){
            System.out.println("Overweight");
        }

        if(BMI>=30){
            System.out.println("Obese");
        }
        //don't put else, else only follows the latest if
        // a better way will be to use else if

        if (BMI<18.5) {
            System.out.println("Underweight");
        }

        else if(BMI<=25){
            System.out.println("Healthy Weight");
        }

        else if (BMI<=30){
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }

    }
}
