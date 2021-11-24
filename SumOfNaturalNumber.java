import java.util.Scanner;
public class SumOfNaturalNumber{
public static void main(String[] args){
    System.out.println("Enter the nth number");
    Scanner in = new Scanner(System.in);
    int a=in.nextInt();
    int i,j=0;
    for(i=1;i<=a;i++)
    {
        j+=i;
    }
     System.out.println("Sum of nth natural number:"+j);
}
}