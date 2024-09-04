import java.util.*;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of shapes: ");
        int noShapes = sc.nextInt();
        ArrayList<Shape> newList = new ArrayList<Shape>();
        
        while (noShapes>0){
            System.out.println("Enter the top portion of the top-left coordinate: ");
            double t = sc.nextDouble();
            System.out.println("Enter the left portion of the top-left coordinate: ");
            double l = sc.nextDouble();
            System.out.println("Enter the length of the shape: ");
            double length = sc.nextDouble();
            System.out.println("Enter the width of the shape: ");
            double width = sc.nextDouble();
            //append the shape to array
            newList.add(new Shape(t,l,length,width));
            noShapes--;
        }
        for (int i=0;i<newList.length;i++ ){
            System.out.println("Shape " +  
            System.out.println("Top-left coordinate: (" 
            + shapes.getT() + ", "+shapes.getL()+").");
            System.out.println("Bottom-right coordinate: (" 
            + shapes.getB() + ", "+shapes.getR()+").");
            System.out.println("Length: (" 
            + shapes.getB() + ", "+shapes.getR()+").");
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
        return L + width;
    }

    public void setB(double b) {
        B = b;
    }

    public double getR() {
        return T + length;
    }

    public void setR(double r) {
        R = r;
    }

}
