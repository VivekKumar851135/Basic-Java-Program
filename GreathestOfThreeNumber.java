import java.util.Scanner;
public class GreathestOfThreeNumber{
public static void main(String[] args){
  System.out.println("Enter three number");
  Scanner in = new Scanner(System.in);
  int a,b,c;
  a=in.nextInt();
  b=in.nextInt();
  c=in.nextInt();
  if(a>b&&a>c){

      System.out.println(a+"is greather");
  }
  else if(b>a&&b>c){
      System.out.println(b+"is greather");
  }
  else if(c>a&&c>b){
      System.out.println(c+"is greather");
  }
  else{
      System.out.println("Invalid Input");
  }
}
}