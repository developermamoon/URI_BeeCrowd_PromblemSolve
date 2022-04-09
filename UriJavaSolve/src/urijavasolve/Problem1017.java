package urijavasolve;
import java.util.Scanner;
public class Problem1017 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int time = obj.nextInt();
        int averageSpeed = obj.nextInt();
        
        float litre = (float) ((averageSpeed/12.0)*time);
        
        System.out.println(String.format("%.3f",litre));
    }
    
}
