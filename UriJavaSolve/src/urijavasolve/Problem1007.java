package urijavasolve;
import java.util.Scanner;
public class Problem1007 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
    
        int A = obj.nextInt();
        int B = obj.nextInt();
        int C = obj.nextInt();
        int D = obj.nextInt();

        int difference = (A * B - C * D);
        System.out.println("DIFERENCA = "+difference);
    }
    
}
