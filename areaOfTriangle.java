import java.util.Scanner;
public class areaOfTriangle{
    public static void main(String[] args)
    {
        double a,b,h;
        System.out.println("Enter base and height");
        Scanner in = new Scanner(System.in);
        b=in.nextDouble();
        h=in.nextDouble();
        a=(b*h)/2;
        System.out.println(a);
    }
}