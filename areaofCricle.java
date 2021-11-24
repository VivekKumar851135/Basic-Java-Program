import java.util.Scanner;
public class areaofCricle{
    public static void main(String[] args)
    {
        double r,pi=3.14,a;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        r=in.nextDouble();
        a=pi*r*r;
        System.out.println(a);
    }
}