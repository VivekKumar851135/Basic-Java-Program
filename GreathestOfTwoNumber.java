import java.util.Scanner;
public class GreathestOfTwoNumber{
public static void main(String[] args){
  System.out.println("Enter two number");
  Scanner in = new Scanner(System.in);
  int a,b;
  a=in.nextInt();
  b=in.nextInt();
  if(a>b){
      System.out.println(a+"is greather");
  }
  else if(b>a){
      System.out.println(b+"is greather");
  }
}
}