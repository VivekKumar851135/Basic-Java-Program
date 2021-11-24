import java.util.Scanner;
public class AbundantNumber{
    public static void main(String[] args){
        System.out.println("Enter a Number");
        int a,b,i,c=0;
        Scanner in = new Scanner(System.in);
        a=in.nextInt();
        for(i=1;i<a-1;i++){
            b=a%i;
           if(b==0){
           c=c+i;
           }
        }
       if(c>a){
            System.out.println("Given Number Is Abundant Number:"+a);
       }
       else{
            System.out.println("Given Number Is Not Abundant Number:"+a);
       }
    }
}