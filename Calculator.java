import java.util.Scanner;
public class Calculator{
public static void main(String[] args)
{
    int a,b,c,d,e;
    double f;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter two number");
    a=in.nextInt();
    b=in.nextInt();
    c=a+b;
    d=a-b;
    e=a*b;
    f=a/b;
    System.out.println("your answer is:addition:"+c+
    " Substraction:"+d+" multiplication:"+e+" Division:"+f);
}
}