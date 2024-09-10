import java.util.*;

public class Practice21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // getting the number of shapes
        System.out.println("Enter the number of shapes: ");
        int noShapes = sc.nextInt();
        
        // generating a list to store the objects created
        ArrayList<Shape> newList = new ArrayList<>();
        ArrayList<Drawable> drawableList = new ArrayList<>();

        //appending objects into an ArrayList called newList
        while (noShapes > 0) {
            System.out.println("Enter the type of shape (rectangle/circle): ");
            String shapeType = sc.next();
            sc.nextLine(); // Consume the newline character
            if (shapeType.equals("circle")) {
                System.out.println("Enter the X portion of the center coordinate: ");
                double x = sc.nextDouble();
                System.out.println("Enter the Y portion of the center coordinate: ");
                double y = sc.nextDouble();
                System.out.println("Enter the RADIUS of the shape: ");
                double radius = sc.nextDouble();
                sc.nextLine(); // Consume the newline character
                //append the Circle to array
                newList.add(new Circle(x, y, radius));
                drawableList.add(new Circle(x, y, radius));
            } else if (shapeType.equals("rectangle")) {
                System.out.println("Enter the TOP portion of the top-left coordinate: ");
                double t = sc.nextDouble();
                System.out.println("Enter the LEFT portion of the top-left coordinate: ");
                double l = sc.nextDouble();
                System.out.println("Enter the LENGTH of the shape: ");
                double length = sc.nextDouble();
                System.out.println("Enter the WIDTH of the shape: ");
                double width = sc.nextDouble();
                sc.nextLine(); // Consume the newline character
                //append the Rectangle to array
                newList.add(new Rectangle(t, l, length, width));
                drawableList.add(new Rectangle(t, l, length, width));
            } else {
                System.out.println("Invalid shape type. Please enter 'rectangle' or 'circle'.");
                continue;
            }
            noShapes--;
        }

        // Adding text labels
        System.out.println("Enter the number of text labels: ");
        int noTextLabels = sc.nextInt();

        while (noTextLabels > 0) {
            System.out.println("Enter the font family: ");
            String fontFamily = sc.next();
            sc.nextLine(); // Consume the newline character
            System.out.println("Enter the font size: ");
            int fontSize = sc.nextInt();
            System.out.println("Enter the TOP portion of the top-left coordinate: ");
            double t = sc.nextDouble();
            System.out.println("Enter the LEFT portion of the top-left coordinate: ");
            double l = sc.nextDouble();
            System.out.println("Enter the text of the label: ");
            String text = sc.next();
            sc.nextLine(); // Consume the newline character
            //append the TextLabel to array
            drawableList.add(new TextLabel(fontFamily, fontSize, t, l, text));
            noTextLabels--;
        }

        System.out.println(drawableList.size());

        System.out.println("Would you like to display all drawables? (Y/N)?");
        sc.nextLine(); // Consume the newline character
        String display = sc.nextLine();
        // Display all drawables
        if (display.toLowerCase().equals("y")) {
            for (Drawable drawable : drawableList) {
                drawable.display();
            }
        }

        System.out.println("Would you like to edit shapes? (Y/N)?");
        String editShapes = sc.nextLine();
        if (editShapes.toLowerCase().equals("y")) {
            for (int i = 0; i < newList.size(); i++) {
                if (newList.get(i) instanceof Circle) {
                    System.out.println("Circle " + (i + 1));
                    System.out.println("Center coordinate: (" 
                    + ((Circle)newList.get(i)).getX() + ", " + ((Circle)newList.get(i)).getY() + ").");
                    System.out.println("Radius: " + ((Circle)newList.get(i)).getRadius());
                    System.out.println("Area: " + newList.get(i).getArea());
                    System.out.println("Would you like to edit this shape? (Y/N)?");
                    String edit = sc.nextLine();
        
                    if (edit.toLowerCase().equals("y")) {
                        System.out.println("Enter the new X portion of the center coordinate: ");
                        double x = sc.nextDouble();
                        System.out.println("Enter the new Y portion of the center coordinate: ");
                        double y = sc.nextDouble();
                        System.out.println("Enter the new RADIUS of the shape: ");
                        double radius = sc.nextDouble();
                        // Update the Circle object
                        Circle circle = (Circle) newList.get(i);
                        circle.setX(x);
                        circle.setY(y);
                        circle.setRadius(radius);
                        System.out.println("Circle " + (i + 1));
                        System.out.println("Center coordinate: (" 
                        + ((Circle)newList.get(i)).getX() + ", " + ((Circle)newList.get(i)).getY() + ").");
                        System.out.println("Radius: " + ((Circle)newList.get(i)).getRadius());
                        System.out.println("Area: " + newList.get(i).getArea());
                        System.out.println(" ");

                    }
            
                } else if (newList.get(i) instanceof Rectangle) {
                    System.out.println("Rectangle " + (i + 1));
                    System.out.println("Top-left coordinate: (" 
                    + ((Rectangle)newList.get(i)).getT() + ", " + ((Rectangle)newList.get(i)).getL() + ").");
                    System.out.println("Bottom-right coordinate: (" 
                    + ((Rectangle)newList.get(i)).getB() + ", " + ((Rectangle)newList.get(i)).getR() + ").");
                    System.out.println("Length: " + ((Rectangle)newList.get(i)).getLength());
                    System.out.println("Width: " + ((Rectangle)newList.get(i)).getWidth());
                    System.out.println("Area: " + newList.get(i).getArea());
                    System.out.println("Would you like to edit this shape? (Y/N)?");
                    String edit = sc.nextLine();

                    if (edit.toLowerCase().equals("y")) {
                        System.out.println("Enter the new TOP portion of the top-left coordinate: ");
                        double t = sc.nextDouble();
                        System.out.println("Enter the new LEFT portion of the top-left coordinate: ");
                        double l = sc.nextDouble();
                        System.out.println("Enter the new LENGTH of the shape: ");
                        double length = sc.nextDouble();
                        System.out.println("Enter the new WIDTH of the shape: ");
                        double width = sc.nextDouble();
                        // Update the Rectangle object
                        Rectangle rectangle = (Rectangle) newList.get(i);
                        rectangle.setT(t);
                        rectangle.setL(l);
                        rectangle.setLength(length);
                        rectangle.setWidth(width);
                        System.out.println("Rectangle " + (i + 1));
                        System.out.println("Top-left coordinate: (" 
                        + ((Rectangle)newList.get(i)).getT() + ", " + ((Rectangle)newList.get(i)).getL() + ").");
                        System.out.println("Bottom-right coordinate: (" 
                        + ((Rectangle)newList.get(i)).getB() + ", " + ((Rectangle)newList.get(i)).getR() + ").");
                        System.out.println("Length: " + ((Rectangle)newList.get(i)).getLength());
                        System.out.println("Width: " + ((Rectangle)newList.get(i)).getWidth());
                        System.out.println("Area: " + newList.get(i).getArea());
                        System.out.println(" ");
    
                    }
                }
            }
        }

    }
}

interface Drawable {
    public void display();
}

// create an interface called Shape
abstract class Shape implements Drawable {
    abstract double getArea();
}

// create a class called Circle that implements the Shape interface
class Circle extends Shape {
    private double X;
    private double Y;
    private double radius;

    public Circle(double X, double Y, double radius) {
        this.X = X;
        this.Y = Y;
        this.radius = radius;
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void display() {
        System.out.println("Circle");
        System.out.println("Center coordinate: (" + X + ", " + Y + ").");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
    }

}


// create a class called Rectangle that implements the Shape interface
class Rectangle extends Shape {
    private double T;
    private double L;
    private double length;
    private double width;

    public Rectangle(double T, double L, double length, double width) {
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

    public double getR() {
        return L + width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void display() {
        System.out.println("Rectangle");
        System.out.println("Top-left coordinate: (" + T + ", " + L + ").");
        System.out.println("Bottom-right coordinate: (" + getB() + ", " + getR() + ").");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + getArea());
    }
}

// create a class called TextLabel that implements the Drawable interface
class TextLabel implements Drawable {
    private String fontFamily;
    private int fontSize;
    private double T;
    private double L;
    private String text;

    public TextLabel(String fontFamily, int fontSize, double T, double L, String text) {
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.T = T;
        this.L = L;
        this.text = text;
    }

    @Override
    public void display() {
        System.out.println("TextLabel");
        System.out.println("Font family: " + fontFamily);
        System.out.println("Font size: " + fontSize);
        System.out.println("Top-left coordinate: (" + T + ", " + L + ").");
        System.out.println("Text: " + text);
    }
}