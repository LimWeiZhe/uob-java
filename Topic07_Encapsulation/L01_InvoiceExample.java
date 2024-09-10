package Topic07_Encapsulation;
import java.util.Scanner;

class Invoice{
    private double total;
    private double gst;
    private double serviceCharge;
    private double netTotal;

    public Invoice(){

    }
    public Invoice(double total, double gst, double serviceCharge){
        this.total = total;
        this.gst = gst;
        this.serviceCharge = serviceCharge;

    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public double getGst() {
        return gst;
    }
    public void setGst(double gst) {
        this.gst = gst;
    }
    public double getServiceCharge() {
        return serviceCharge;
    }
    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }
    public double getNetTotal() {
        return total * (1+gst*serviceCharge);
    }

    // remove the setter to prevent any overwriting
    // public void setNetTotal(double netTotal) {
    //     this.netTotal = netTotal;
    // }

    


}
public class L01_InvoiceExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total of the invoice: ");
        double total = sc.nextDouble();
        Invoice i = new Invoice(total,0.09,0.1);

        // shouldnt allow others to change the nettotal
        // instead, encapsulate it into the class and calculate it in the class
        // i.setNetTotal(i.getTotal() * (1+i.getGst()*i.getServiceCharge()));
        // this will override the net total 
        // i.setNetTotal(2000);
        System.out.println("The net total is: " + i.getNetTotal());
    }
}
