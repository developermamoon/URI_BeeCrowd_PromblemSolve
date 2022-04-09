package urijavasolve;
import java.util.Scanner;
public class Problem1014 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int X = obj.nextInt();
        float Y = obj.nextFloat();
        
        float mileage = X/Y;
        
        System.out.println(String.format("%.3f",mileage)+" km/l");
    }
    
}
