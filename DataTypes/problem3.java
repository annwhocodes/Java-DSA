import java.util.*;
public class problem3 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the pencil price :");
        float pencil = sc.nextFloat();
        System.out.print("Enter the pen price :");
        float pen = sc.nextFloat();
        System.out.print("Enter the eraser price: ");
        float eraser = sc.nextFloat();
        float cost = pencil+pen+eraser;
        float gst = cost*18/100;
        float total=cost+gst;
        System.out.println("Billing details : Total cost: " + cost);
        System.out.println("GST :"+ gst);
        System.out.println("Total to be paid: "+ total);
    }
    
}
