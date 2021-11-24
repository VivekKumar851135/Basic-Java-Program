import java.util.Scanner;
public class ReverseANumber{
    public static void main(String[] args){
        System.out.println("Enter a number");
        int a,b=0,c;
        Scanner in = new Scanner(System.in);
        a=in.nextInt();
        while(a!=0){
           c=a%10;
           b=b*10+c;
           a=a/10;
        }
       System.out.print(b);
    }
}