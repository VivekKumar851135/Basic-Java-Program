import java.util.Scanner;
public class SumOfNumberInGivenRange{
    public static void main(String[] args){
        System.out.println("Enter the range between two number");
        int i,j=0,a,b;
        Scanner in = new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        for(i=a+1;i<b;i++){
          j+=i;
        }
        System.out.println("Sum of number between range"+j);
    }
}