import java.util.Scanner;
public class averageOfThreeNumber{
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       int a,b,c,avg;
       System.out.println("Enter three number");
       a=in.nextInt();
       b=in.nextInt();
       c=in.nextInt();
       avg=(a+b+c)/3;
       System.out.println("Avrage of three number: "+avg);
    }
}