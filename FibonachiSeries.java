
import java.util.Scanner;
public class FibonachiSeries {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms in Fibonacci series: ");
        int n=sc.nextInt(); 
       // Using while loop
        // while(n>0){
        //     System.out.print(a+" ");
        //     int c=a+b;
        //     a=b;
        //     b=c;
        //     n--;
        // }
        // Using for loop
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
