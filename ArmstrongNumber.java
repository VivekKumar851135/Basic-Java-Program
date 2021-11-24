import java.util.Scanner;
public class ArmstrongNumber{
    public static void main(String[] args){
        System.out.println("Enter a number");
        int a,b,c,d=0,count=0;
        Scanner in = new Scanner(System.in);
        a=in.nextInt();
        c=a;
        while(a!=0){
          a=a/10;
          count++;
       }
       a=c;

       if(count==0||count==1||count==2||count==3){
       while(a!=0){
           b=a%10;
           a=a/10;
           d=d+b*b*b;
       }
       if(d==c){
       System.out.println(c+": is armstrong number");
       }
       else{
           System.out.println(c+": is not a armstrong number");
       }
       }

       else if(count==4){
       while(a!=0){
           b=a%10;
           a=a/10;
           d=d+b*b*b*b;
       }
       if(d==c){
       System.out.println(c+": is armstrong number");
       }
       else{
           System.out.println(c+": is not a armstrong number");
       }
       }

       else if(count==5){
       while(a!=0){
           b=a%10;
           a=a/10;
           d=d+b*b*b*b*b;
       }
       if(d==c){
       System.out.println(c+": is armstrong number");
       }
       else{
           System.out.println(c+": is not a armstrong number");
       }
       
       }
       else{
           System.out.println("Armstrong not found:"+c);
       }

       
    }

}