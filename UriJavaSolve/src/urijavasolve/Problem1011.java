package urijavasolve;
import java.util.Scanner;
public class Problem1011 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double pi = 3.14159;
        double R = obj.nextDouble();
        
        double sphere= (4.0/3) * pi * (R*R*R);
        
        System.out.println("VOLUME = "+ String.format("%.3f",sphere));
    }
    
}
