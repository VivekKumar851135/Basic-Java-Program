import java.util.Scanner;
public class LAB1Q3 {
    public static void main(String args[]) {
        double price,shop1,shop2,s2;
        Scanner sc=new Scanner(System.in); System.out.println("Enter the price of an article: "); price=sc.nextInt();
        shop1= .3*(price);
        s2= .2*(price); shop2=(price-s2)*.1+s2;
        System.out.println("Shopkeeper1 gives a discount of : "+shop1);
        System.out.println("Shopkeeper2 gives a discount of : "+shop2); }
        
}
