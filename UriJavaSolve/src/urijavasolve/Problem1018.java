package urijavasolve;
import java.util.Scanner;
public class Problem1018 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        
        System.out.println(N);
        System.out.println(N/100+" nota(s) de R$ 100,00");
        int temp = N%100;
        System.out.println(temp/50+" nota(s) de R$ 50,00");
        temp = temp%50;
        System.out.println(temp/20+" nota(s) de R$ 20,00");
        temp = temp%20;
        System.out.println(temp/10+" nota(s) de R$ 10,00");
        temp = temp%10;
        System.out.println(temp/5+" nota(s) de R$ 5,00");
        temp = temp%5;
        System.out.println(temp/2+" nota(s) de R$ 2,00");
        temp = temp%2;
        System.out.println(temp/1+" nota(s) de R$ 1,00");
        
    }
    
}
