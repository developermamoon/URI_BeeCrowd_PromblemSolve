package urijavasolve;

import java.util.Scanner;
public class problem1002 {
    public static void main(String[] args) {
    
        Scanner obj = new Scanner(System.in);
        double R = obj.nextDouble();
        double A = 3.14159 * R*R;
        System.out.println("A="+String.format("%.4f", A));
    }
}
