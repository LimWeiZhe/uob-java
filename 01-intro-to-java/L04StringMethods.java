import java.nio.channels.Pipe.SourceChannel;

public class L04StringMethods {
    public static void main(String[] args) {
        
        String word = "The quick brown fox jumps over the lazy dog";

        //calling the 'toUpperCase' method on the string inside the 'word' variable
        System.out.println(word.toUpperCase());

        //the 'contains' method returns true if the substring is found within the string (case sensitive)
        System.out.println(word.contains("fox"));

        // a method to recieve more than one parameter
        System.out.println(word.substring(4,9));
    }
    
}
