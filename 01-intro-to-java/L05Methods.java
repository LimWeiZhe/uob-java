public class L05Methods {
    //the main method is the starting point of all Java programs
    //it is automatially called by Java when you run a Java program
    //should not name any of own methods as 'main'
    public static void main(String[] args) {
    // if the method does not return a value, void
    int foobar = addTwoNumber(4, 5);
    System.out.println(foobar);
    }
    
    //method that takes two integers as parameters
    //and return their sum
    //public static ??? addTwoNumber(int x, int y){  since we want to return the sum, we should put ??? as int
    public static int addTwoNumber(int x, int y){
        int sum = x+y;
        return sum; // the result of addTwoNumber is the sum of x and y
    }
    //define a method named calculateGST
    //takes in two parameters, the amount to pay, and the gst percentage
    public static double calculateGST(double amount, double gstPercentage){
        return amount*gstPercentage;
    }
    //define a method named calculatePerimeter
    public static double squarePerimeter(double squareLength){
        return squareLength*4;
    }

    //if method doesn't return a value
    public static void HelloWorld(){
        System.out.println("Hello World");
    }


}
