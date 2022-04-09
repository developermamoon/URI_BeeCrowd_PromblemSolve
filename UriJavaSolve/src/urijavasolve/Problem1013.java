package urijavasolve;
import java.util.Scanner;
public class Problem1013 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        
        
        int MaiorAB=(a+b+Math.abs(a-b))/2;
        int MAX=(MaiorAB+c+Math.abs(MaiorAB-c))/2;
        
        System.out.println(MAX+" eh o maior");
        
    }
    
}
