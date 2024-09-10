package Topic07_Encapsulation;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.crypto.Data;


class DataReading{
    private ArrayList<Integer> readings = new ArrayList<>();
    private double mean;

    // constructor
    public DataReading(){

    }

    public void addReading(int reading){
        if(newReading<0 || newReading%2 == 0){
            throw new IllegalArgumentException();
        }
        readings.add(newReading);
    }
    public ArrayList<Integer> getReadings() {
        return readings;
    }

    public double getMean(){
        return mean;
    }

}



public class L02_Mean {
    public static void main(String[] args) {
        // Java will use type inference to set the data type of 'reading'
        // does not apply to polymorphism (new savings account or checking account)
        var reading = new DataReading();

        //Unencapsulated version
        Scanner sc = new Scanner(System.in);

    }
}
