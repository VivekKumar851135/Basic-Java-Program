import java.util.Scanner;
public class SumOfDigits{
    public static void main(String[] args){
        System.out.println("Enter a number");
        int a,b=0;
        Scanner in = new Scanner(System.in);
        a=in.nextInt();
       while(a!=0){
           b=b+a%10;
           a=a/10;
       }
       System.out.println("Sum of digits is:"+b);
    }
}