import java.util.Scanner;
public class Vowwel_Consonent {
    public static void main(String[] args) {
       char value;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Char");
        value=in.nextLine().charAt(0);
        if (value=='A'||value=='E'||value=='I'||value=='O'||value=='U'||value=='a'||value=='e'||value=='i'||value=='o'||value=='u') {
            System.out.println("vowel");
        }else  System.out.println("Consonent");

    }
}
