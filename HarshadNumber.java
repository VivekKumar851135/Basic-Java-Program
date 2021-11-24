import java.util.Scanner; 
public class HarshadNumber{
    public static void main(String[] args ){
        System.out.println("Enter a number");
        int a,b,c=0,d,e;
        Scanner in = new Scanner(System.in);
        a=in.nextInt();
        d=a;
        while(a!=0){
            b=a%10;
            c=c+b;
            a=a/10;
        }
       e=d%c;
       if(e==0){
           System.out.println("Given Number is Harshad Number:"+d);
       }
       else{
           System.out.println("Given Number is Not Harshad Number:"+d);
       }
    }
}