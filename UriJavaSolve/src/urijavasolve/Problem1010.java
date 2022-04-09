package urijavasolve;
import java.util.Scanner;
public class Problem1010 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int code1 = obj.nextInt();
        int unit1 = obj.nextInt();
        double price1 = obj.nextDouble();
        
        int code2 = obj.nextInt();
        int unit2 = obj.nextInt();
        double price2 = obj.nextDouble();
        
        double bill = unit1*price1+unit2*price2;
        
        System.out.println("VALOR A PAGAR: R$ "+String.format("%.2f",bill));
    }
}
