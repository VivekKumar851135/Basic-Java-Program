import java.util.Scanner;
public class SwapTwoNumber{
    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int a,b,c;
        a=in.nextInt();
        b=in.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);

    }
}