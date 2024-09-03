public class L02Array {
    public static void main(String[] args) {
      // define an integer array named 'numbers' that can store three values String[], int[]
    //1. arrays can only store a finite amount of values (aka elements)
    //2. it can only store only one data type
    int [] numbers = new int[3];
    // new int[3] means 3 elemenents max, cannot resize
    // 3. indexes in arrays are 0-based
    numbers[0] = 11;
    numbers[1] = 13;
    numbers[2] = 17;
    System.out.println(numbers[1]);
    
    // define an array that contains three strings
    String[] superheroes = {"Ironman","Spiderman", "Antman"};
    }

    
}
