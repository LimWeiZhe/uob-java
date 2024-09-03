import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class L03GenericCollection {
    public static void main(String[] args) {
        //make sure to have an 'import java.util.Arraylist to the top'
        // <> defines a type
        // an arraylist has no maximum size, functions like a list in python
        ArrayList <Integer> numbers = new ArrayList<Integer>();
        numbers.add(42);
        numbers.add(33);
        numbers.add(55);

        // to access elements in an array list, we use the 'get' methid
        System.out.println(numbers.get(2));
        // the right <> is not compulsory
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Peter");
        names.add("Paul");

        System.out.println(names.get(2));
        //Map (is known as key/value pair - dictionary (Python) and objects (JavaScript))
        //we have to define the data type of the key and directory
        Map<String, Integer> months = new HashMap<String, Integer>(); //the key is String, value is Int
        months.put("Jan", 31);
        months.put("Feb",28);
        months.put("Mar",30);

        System.out.println(months.get("Jan"));
        System.out.println("There are " +months.get("Feb") + " days in February" );

        //When using generic collections, the data type in <> must be the class-eqv. of the primitive
        //data type if we want the collection to store a primitive data type
        //ArrayList<int> primeNumberers = new ArrayList<int> will not work
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        


    }
}