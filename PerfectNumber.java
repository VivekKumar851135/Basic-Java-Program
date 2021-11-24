import java.util.Scanner;
public class PerfectNumber{
    public static void main(String[] args){
        int a,b,c=0,i;
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        a=in.nextInt();
        for(i=1;i<a-1;i++){
            b=a%i;
           if(b==0){
             c=c+i;
           }
        }
       if(a==c){
            System.out.println("Given Number is Perfect Number:"+a);
       }
       else{
            System.out.println("Given Number is Not Perfect Number:"+a);
       }
    }
}