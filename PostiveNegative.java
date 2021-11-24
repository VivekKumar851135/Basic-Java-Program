import java.util.Scanner;
public class PostiveNegative{
    public static void main(String[] args)
    { System.out.println("Enter a number");
       Scanner in = new Scanner(System.in);
       int a=in.nextInt();
       if(a<0){
           System.out.println(a+" :negative");
       }
       else if(a>0){
           System.out.println(a+" :positive");
       }
       else if(a==0){
           System.out.println(a+" :Zero");
       }
       else{
           System.out.println("Invaild input");
       }
    }
}