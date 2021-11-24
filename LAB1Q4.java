import java.util.Scanner;
public class LAB1Q4 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Principal: ");
        double p= sc.nextDouble();
        double c1=p*((1+0.05)-1);
        double c2=p*(Math.pow((1+0.05),2)-1);
        double Amount=p*Math.pow((1+0.05),3); System.out.println("Interest for the first year = "+ c1); System.out.println("Interest for the second year = "+c2); System.out.println("Amount after the third year = "+Amount);
        }
}
