import java.util.Scanner;
public class CharacterAlphabat{
    public static void main(String[] args)
    {  System.out.println("Enter a character");
        Scanner in = new Scanner(System.in);
        char a;
        a=in.next().charAt(0);
        if(a=='A'||a=='B'||a=='C'||a=='D'||a=='E'||a=='F'||a=='G'||a=='H'||a=='I'||
        a=='J'||a=='K'||a=='L'||a=='M'||a=='N'||a=='O'||a=='P'||a=='Q'||a=='R'||a=='S'||
        a=='T'||a=='U'||a=='V'||a=='W'||a=='X'||a=='Y'||a=='Z')
        {
           System.out.println("Charecter is Alphabet");
        }
        else{
            System.out.println("Charecter is not Alphabet");
        }
    }
}