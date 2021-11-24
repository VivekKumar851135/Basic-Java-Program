import java.util.Scanner;
public class LAB1Q2 {
    public static void main(String args[]) {
        double price;
        Scanner sc=new Scanner(System.in); System.out.println("Enter the price of the digital camera: "); price=sc.nextInt();
        double discountPrice= price - .1*(price);
        double priceAfterGst= discountPrice + .06*(discountPrice); System.out.println("Amount to be paid by customer: " + priceAfterGst );
        }
        
}
