import java.util.Scanner;
public class UpperCaseLowerCase{
    public static void main(String[] args)
    {  System.out.println("Enter a character");
        Scanner in = new Scanner(System.in);
        char a;
        a=in.next().charAt(0);
        if(a=='A'||a=='B'||a=='C'||a=='D'||a=='E'||a=='F'||a=='G'||a=='H'||a=='I'||
        a=='J'||a=='K'||a=='L'||a=='M'||a=='N'||a=='O'||a=='P'||a=='Q'||a=='R'||a=='S'||
        a=='T'||a=='U'||a=='V'||a=='W'||a=='X'||a=='Y'||a=='Z')
        {
           System.out.println("Upper Case Charecter");
        }
        else if(a=='a'||a=='b'||a=='c'||a=='d'||a=='e'||a=='f'||a=='g'||a=='h'||a=='i'||
        a=='j'||a=='k'||a=='l'||a=='m'||a=='n'||a=='o'||a=='p'||a=='q'||a=='r'||a=='s'||
        a=='t'||a=='u'||a=='v'||a=='w'||a=='x'||a=='y'||a=='z')
        {
           System.out.println("Lower Case Charecter");
        }
        else{
            System.out.println("Special Character");
        }
    }
}