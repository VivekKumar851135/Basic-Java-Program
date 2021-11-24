import java.util.Scanner;
public class CalculatorSwitchCase {
    public static void main(String[] args)
    {
int c,i;
double a,b,d;
Scanner in = new Scanner(System.in);
for(i=1;i<=10;i++)
{
    System.out.println("1. Addition");
    System.out.println("2. Substraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Divide");
    System.out.println("5. exit");
    c=in.nextInt();

    switch(c){
        case 1 :
            System.out.println("Enter two number");
            a=in.nextDouble();
            b=in.nextDouble();
            d=a+b;
            System.out.println("You answer is: "+d);
            break;

            case 2 :
            System.out.println("Enter two number");
            a=in.nextDouble();
            b=in.nextDouble();
            d=a-b;
            System.out.println("You answer is: "+d);
            break;

            case 3 :
            System.out.println("Enter two number");
            a=in.nextDouble();
            b=in.nextDouble();
            d=a*b;
            System.out.println("You answer is: "+d);
            break;

            case 4 :
            System.out.println("Enter two number");
            a=in.nextDouble();
            b=in.nextDouble();
            d=a/b;
            System.out.println("You answer is: "+d);
            break;
            
            default:
            System.out.println("invaild input");
    }
    
}
    }
}