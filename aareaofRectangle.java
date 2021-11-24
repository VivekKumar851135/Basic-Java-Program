import java.util.Scanner;
public class aareaofRectangle{
    public static void main(String[] args)
    {
        double l,b,a;
        System.out.println("Enter length and breath");
        Scanner in = new Scanner(System.in);
        l=in.nextDouble();
        b=in.nextDouble();
        a=l*b;
        System.out.println("Area of rectangle : "+a);

    }
}