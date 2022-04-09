package urijavasolve;
import java.util.Scanner;
public class Problem1009 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String name= obj.next();
        double salary = obj.nextDouble();
        double total= obj.nextDouble();
        
        double TOTAL = (salary + total*0.15);
        
        System.out.println("TOTAL = R$ "+ String.format("%.2f", TOTAL));
    }
}
