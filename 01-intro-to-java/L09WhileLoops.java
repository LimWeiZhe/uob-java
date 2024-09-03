import java.util.Scanner;

public class L09WhileLoops {
    public static void main(String[] args) {
        //the while loop is like a if, except that the code in the body will repeat until the condition is false
        int x = 0;
        while (x<=10){
            System.out.println(x);
            x++;
        }

        // we want the user to type in 'y' or 'Y', if he doesn't we keep asking
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter y or Y");
        String input = sc.nextLine();
        while (! input.toLowerCase().equals("y")  ){
            System.out.println("Invalid input. Enter y or Y");
            input = sc.nextLine();
    

        }


        }
    }

