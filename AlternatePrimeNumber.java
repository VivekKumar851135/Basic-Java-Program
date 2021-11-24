import java.util.Scanner;
public class AlternatePrimeNumber
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int i,a;
        a=in.nextInt();
        for(i=2;i<a;i++){
            //i don't know why 9,27 appears as a prime number;
            if(a%i==0)
            {   
             System.out.println(a+": is not prime number");
             break;
            }
             else{
                 
                System.out.println(a+": is a prime number");
               break;
            }
        }
           
           
               
            
            
        
    }
}