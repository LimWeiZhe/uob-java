import java.util.ArrayList;

public class L10ForLoops {
    public static void main(String[] args) {
        // for (int i = 0; i<10; i++){
        //     System.out.println(i);

        //list out the elements in an array
        int[] numbers = {11,22,33};

        //old method of itererating through array
        for(int i =0; i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        
        //new method (n is the variable name)
        for(int n: numbers){
            System.out.println(n);
        }

        //new method with arraylist
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apples");
        fruits.add("Banana");
        fruits.add("Cherries");

        for (String f: fruits){
            System.out.println(f);
        }

    }
    
}
