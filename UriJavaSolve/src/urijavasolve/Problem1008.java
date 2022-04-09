package urijavasolve;
import java.util.Scanner;
public class Problem1008 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();
        int hours = obj.nextInt();
        double rate = obj.nextDouble();
        double salary = hours*rate;
        
        System.out.println("NUMBER = "+number);
        System.out.println("SALARY = U$ "+String.format("%.2f",salary));
    }
    
    
}
