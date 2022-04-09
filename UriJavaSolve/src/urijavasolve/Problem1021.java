package urijavasolve;
import java.util.Scanner;
public class Problem1021 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        float N = obj.nextFloat();
        int n = (int) N;
        int temp1 = (int) (N*100);
        
        
        System.out.println("NOTAS:");
        System.out.println(n/100+" nota(s) de R$ 100,00");
        int temp = (n%100);

        System.out.println(temp/50+" nota(s) de R$ 50,00");
        temp = temp%50;

        System.out.println(temp/20+" nota(s) de R$ 20,00");
        temp = temp%20;

        System.out.println(temp/10+" nota(s) de R$ 10,00");
        temp = temp%10;
        
        System.out.println(temp/5+" nota(s) de R$ 5,00");
        temp = temp%5;
        
        System.out.println(temp/2+" nota(s) de R$ 2,00");
        temp =temp%2;
        
        
        
        
        System.out.println("MOEDAS:");
        System.out.println(temp/1+" moeda(s) de R$ 1.00");
        
        
        temp1 = temp1%100;
                
        System.out.println(temp1/50+" moeda(s) de R$ 0.50");
        temp1 = (temp1%50);
                
        System.out.println(temp1/25+" moeda(s) de R$ 0.25");
        temp1 = (temp1%25); 
                
        System.out.println(temp1/10+" moeda(s) de R$ 0.10");
        temp1 = (temp1%10);
                
        System.out.println(temp1/5+" moeda(s) de R$ 0.05");
        temp1 = (temp1%5);
                
        System.out.println(temp1/1+" moeda(s) de R$ 0.01");
                
        
    }
}
