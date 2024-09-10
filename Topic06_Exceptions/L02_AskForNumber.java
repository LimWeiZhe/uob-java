package Topic06_Exceptions;
import java.util.Scanner;

public class L02_AskForNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        while (true){
            try{
                System.out.println("Enter a number: ");
                number = sc.nextInt();
                sc.nextLine();
                break;
            } catch (Exception e){
                System.out.println("Please enter a valid number");
            }
        }
        System.out.println("Number = " + number);
    }
}
