public class L01Intro {
// Define a class first 
    // Defines a method (function), main method is the entry point of all Java programs
    public static void main(String[] args) {
        System.out.println("Hello World");

        // Primitive data types
        // what are data types that a programming language support
        // is the language loosely-type (let in JS) or strongly-type (const in JS)
        // when we define a variable in Java, we must specify its data type and that cannot be changed
        int secretOfLife = 42; //int can store 2bil to -2bil
        //secretOfLife = "forty two"; is illegal! secretOfLife can only store integers
        short moneyInBalance = 3200; // for storing numbers in smaller range

        //Decimal numbers
        double gstPercentage = 0.07; // has a higher range of numbers for precision. this is the default
        float f = 1.0f; // floating point value have a "f" at the back
        
        //Strings (must be defined with double quotes)
        //Strings are objects in JavaScript, not a primitive data type
        String sentence = "She sells seashells at the seashore";
        String word = "hello";

        //char (defined with a single quote)
        //to represent one character
        char alpha = 'A';

        //boolean - true/false
        boolean isRaining = false;

        System.out.println("Secret of Life =" + secretOfLife);
        System.out.println(isRaining);
    }
}