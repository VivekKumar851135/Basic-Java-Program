import java.util.Scanner;
public class Digits{
    public static void main(String[] args){
        System.out.println("Enter a number");
        int a,d=0;
        Scanner in = new Scanner(System.in);
        a=in.nextInt();
       while(a!=0){
           a=a/10;
           d++;
       }
       System.out.println("Number of digits:"+d);
    }

}