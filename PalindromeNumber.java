import java.util.Scanner;
public class PalindromeNumber{
    public static void main(String[] args){
        int a,b,c=0,d;
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
            a=in.nextInt();
            d=a;
            while(a!=0){
                b=a%10;
                c=c*10+b;
                a=a/10;
            }
            if(d==c){
                System.out.println("Given Number is palindrome Number:"+c);
            }
            else{
                System.out.println("Given number is not palindrome Number:"+c);
            }
        
    }
}