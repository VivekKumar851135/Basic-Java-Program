import java.util.Scanner;
public class LeapYears{
    public static void main(String[] args){
        System.out.println("Enter a years");
        int a,b;
        Scanner in = new Scanner(System.in);
        a=in.nextInt();
        b=a%4;
        if(b==0){
            System.out.println(a+":is leap year");
        }
        else{
            System.out.println(a+":is not leap Year");
        }
    }
}