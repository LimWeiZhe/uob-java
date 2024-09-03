import java.util.*;

public class Day1Assessment {
    public static void main(String[] args) {
        //create ArrayList
        ArrayList<Double> myArray = new ArrayList<Double>() ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number that is a decimal, enter 0 to end");
        double input = sc.nextDouble();
        while (input != 0){
            myArray.add(input);
            System.out.println("Enter a number that is a decimal, enter 0 to end");
            input = sc.nextDouble();
        }
        //mean calculation
        double sum = 0.0;
        int length = myArray.size();
        for (double n: myArray){
            sum= sum+n;
        }
        double mean = sum/((double)length);

        //median calculation
        Collections.sort(myArray);
        int middleIndex = (length/2);
        double median = myArray.get(middleIndex);

        //mode calculation
        Double mode = 0.0;
        int maxCount = 0;
        
        for (double n: myArray){
            int count = 0;
            for(double j: myArray){
                if (n==j){
                    count++;
                }
                }
            if (count>maxCount){
                maxCount =count;
                mode = n;
            }
        }

        System.out.println("The median is: " + median);
        System.out.println("The mode is: " + mode);
        System.out.println("The mean is: " + mean);

        }
    
    }   

