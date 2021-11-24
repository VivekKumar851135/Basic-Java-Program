import java.util.Scanner;
public class LAB_Exam_Q3 {
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int p = scan.nextInt();
    int q;
    try {
    switch (p) {
    case 0 :
    int zero = 0;
    q = 92/ zero;
    break;
    case 1 :
    int b[ ] = null;
    q = b[0] ;
break;
default:
System.out.println("No exception");
}
}
// catch block
catch (Exception e) {
System.out.println(e) ;
}
   }
}
