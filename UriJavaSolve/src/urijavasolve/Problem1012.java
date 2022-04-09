package urijavasolve;
import java.util.Scanner;
public class Problem1012 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double A = obj.nextDouble();
        double B = obj.nextDouble();
        double C = obj.nextDouble();
        
        double triangle = 0.5*A*C;
        double circle = 3.14159*C*C;
        double trapezium = (A+B)/2*C;
        double square = B*B;
        double rectangle = A*B;
        
        System.out.println("TRIANGULO: "+String.format("%.3f",triangle));
        System.out.println("CIRCULO: "+String.format("%.3f",circle));
        System.out.println("TRAPEZIO: "+String.format("%.3f",trapezium));
        System.out.println("QUADRADO: "+String.format("%.3f",square));
        System.out.println("RETANGULO: "+String.format("%.3f",rectangle));
        
    }
}
