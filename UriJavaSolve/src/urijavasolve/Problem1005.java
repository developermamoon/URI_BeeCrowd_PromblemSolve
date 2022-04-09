package urijavasolve;
import java.util.Scanner;
public class Problem1005 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
    
        double A = obj.nextDouble();
        double B = obj.nextDouble();

        double MEDIA = (A*3.5+B*7.5)/(3.5+7.5);
        System.out.println("MEDIA = "+String.format("%.5f",MEDIA));
    }
}
