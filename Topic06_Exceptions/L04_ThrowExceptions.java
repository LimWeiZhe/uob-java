package Topic06_Exceptions;
import java.util.Scanner;

public class L04_ThrowExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to divide: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        // the exeception will be thrown to divideTwoNumbers method, and if theres nothing to catch it,
        // it will be thrown to the main method to handle, and if theres nothing to catch it,
        // it will be thrown and the main method will crash
        //int result = divideTwoNumbers(number1, number2);
        int result = 0;
        try{
            result = divideTwoNumbers(number1, number2);
        } catch (IllegalArgumentException e){
            System.out.println("An error occurred");
        }


        // if (number2 == 0){
        //     throw new ArithmeticException("Cannot divide by 0, please retry");
        // }
        System.out.println(number1/number2);
    }

    // defensive programming, preemptively avoid exceptions
    public static int divideTwoNumbers(int x, int y){
        if (y == 0){
            throw new IllegalArgumentException("Divisor cannot be zero");
        }
        return x/y;
    }

    //the "throws  illegllaArgumentException" means there's a chance that 
    //this method will throw that particular argument
    public static int foobar(int x){
        // if x is 10 wwe will throw an illegal argument exception
        if (x == 10){
            throw new IllegalArgumentException("x cannot be 10");
        }
        return x*x;
    }
}
