package urijavasolve;
import java.util.Scanner;
public class Problem1019 {
    public static void main(String[] args) {
         Scanner obj = new Scanner(System.in);
         int N = obj.nextInt();
         
         int a = N/3600;    
         int temp = N%3600;   
         int b = temp/60;     
         temp = temp%60;      
         
         System.out.println(a+":"+b+":"+temp);
    }
    
}
