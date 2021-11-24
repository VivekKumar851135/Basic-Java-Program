import java.util.Scanner;
public class LAB1Q5 {
    public static void main(String args[]) { int nominalValue=10;
        int annualDividend=2000;
        int div=10;
        int sharesHeld = ( annualDividend * 100)/(nominalValue * div); System.out.println("No. of shares held currently = "
        + sharesHeld);
        int sharesRequired = 3000 - sharesHeld; System.out.println("No. of shares to purchase = "
        + sharesRequired); }
}
 