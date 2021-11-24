import java.util.Scanner;
public class LAB1Q1{
public static void main(String args[]) {
double l,g,t;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length: "); l=sc.nextDouble();
System.out.println("Enter the acc due to gravity: "); g=sc.nextDouble();
t=2*Math.PI*Math.sqrt(l/g); System.out.println("Time period: " +t);
}
} 