package urijavasolve;
import java.util.Scanner;
public class Problem1015 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        float x1 = obj.nextFloat();
        float y1 = obj.nextFloat();
        float x2 = obj.nextFloat();
        float y2 = obj.nextFloat();
        
        float d = (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
        double Distance =  Math.sqrt(d); 
        
        System.out.println(String.format("%.4f",Distance));
    }
}
