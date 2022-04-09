package urijavasolve;
import java.util.Scanner;
public class Problem1020 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
         int N = obj.nextInt();
         
         int a = N/365;    
         int temp = N%365;   
         int b = temp/30;     
         temp = temp%30;
         System.out.println(a+" ano(s)");
         System.out.println(b+" mes(es)");
         System.out.println(temp+" dia(s)");
    }
}
