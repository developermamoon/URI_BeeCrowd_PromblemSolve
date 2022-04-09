package urijavasolve;
import java.util.Scanner;
public class Problem1006 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
    
        double A = obj.nextDouble();
        double B = obj.nextDouble();
        double C = obj.nextDouble();

        double MEDIA = (A*2+B*3+C*5)/(2+3+5);
        System.out.println("MEDIA = "+String.format("%.1f",MEDIA));
    }
    
}
