import java.util.Scanner;
public class PrimeNumber{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int i,a;
        a=in.nextInt();
        for(i=2;i<a;i++){
            //i don't know why 9 appers as a prime number;
            if(a%i==0)
            {
            
            break;
            }
        }
           
            if(a==i){
                System.out.println(a+": is a prime number");
            }
             else{
                System.out.println(a+": is a composite number");
            }
        
    }
}