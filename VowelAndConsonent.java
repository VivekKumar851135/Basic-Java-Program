import java.util.Scanner;
public class VowelAndConsonent{
    public static void main(String[] args)
    {   System.out.println("Enter a character");
        char a;
        Scanner in= new Scanner(System.in);
        a=in.next().charAt(0);
        if(a=='a'||a=='A')
        {
           System.out.println(a+":Consonent");
        }
        else if(a=='e'||a=='E') 
        {
           System.out.println(a+":Consonent");
        }
        else if(a=='i'||a=='I')
        {
           System.out.println(a+":Consonent");
        }
        else if(a=='o'||a=='O')
        {
           System.out.println(a+":onsonent");
        }
        else if(a=='u' ||a=='U')
        {
           System.out.println(a+":Consonent");
        }
        else
        {
            System.out.println(a+":Vowel");
        }
}
}