import java.util.*;

public class Practice21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // getting the number of shapes
        System.out.println("Enter the number of shapes: ");
        int noShapes = sc.nextInt();

        // generating a list to store the objects created
        ArrayList<Shape> newList = new ArrayList<Shape>();
        
        //appending objects into an ArrayList called newlist
        while (noShapes>0){
            System.out.println("Enter the TOP portion of the top-left coordinate: ");
            double t = sc.nextDouble();
            System.out.println("Enter the LEFT portion of the top-left coordinate: ");
            double l = sc.nextDouble();
            System.out.println("Enter the LENGTH of the shape: ");
            double length = sc.nextDouble();
            System.out.println("Enter the WIDTH of the shape: ");
            double width = sc.nextDouble();
            //append the shape to array
            newList.add(new Shape(t,l,length,width));
            noShapes--;
        }

        // iterating through the newList to print out the Top-left coordinate, bottom-right coordinate, length, width
        for (int i=0;i<newList.size();i++ ){
            System.out.println("Shape " + (i+1));
            System.out.println("Top-left coordinate: (" 
            + newList.get(i).getT() + ", "+newList.get(i).getL()+").");
            System.out.println("Bottom-right coordinate: (" 
            + newList.get(i).getB() + ", "+newList.get(i).getR()+").");
            System.out.println("Length: "+ newList.get(i).getLength() );
            System.out.println("Width: " + newList.get(i).getWidth());
            System.out.println(" ");
        }
    }
}

class Shape{
    private double T;  
    private double L;
    private double length;
    private double width;
    private double B;
    private double R; 

    public Shape(double T, double L, double length, double width){
        this.T = T;
        this.L = L;
        this.length = length;
        this.width = width;
    } 

    public double getT() {
        return T;
    }
    public void setT(double t) {
        T = t;
    }
    public double getL() {
        return L;
    }
    public void setL(double l) {
        L = l;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getB() {
        return T + length;
    }

    public void setB(double b) {
        B = b;
    }

    public double getR() {
        return L + width;
    }

    public void setR(double r) {
        R = r;
    }

}
