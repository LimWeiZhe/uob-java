package Topic06_Exceptions;

import java.util.Scanner;

public class L03_SpecificExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter two numbers: ");
            int number1 = sc.nextInt(); // we have to use try/catch to handle exceptions caused by processes outside our control
            int number2 = sc.nextInt(); // i.e file doesnt exist, network error, etc
            // if possible, use if/else to avoid exceptions (best practice)
            if (number2!=0){ 
                System.out.println(number1/number2);
            }
        } catch (java.util.InputMismatchException e){
            System.out.println("You must enter a valid integer");
        } catch (java.lang.ArithmeticException e){
            System.out.println("Division by zero is not allowed");
        } catch (Exception e){
            System.out.println("An error occurred");
        }
    }

    
}