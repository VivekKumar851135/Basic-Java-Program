import java.util.Scanner;

class LAB3_Q1 {

    int sumOfDigits(int x) {
        int sum = 0, r;
        while (x > 0) {
            r = x % 10;
            sum = sum + r;
            x = x / 10;
        }
        return sum;
    }

    boolean isMagic(int x) {
        int b = sumOfDigits(x);
        int c = sumOfDigits(b);
        if (c == 1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        LAB3_Q1 obj = new LAB3_Q1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = obj.sumOfDigits(n);
        boolean w = obj.isMagic(325);
        System.out.println("Sum of Digits : " + m);
        if (w == true)
            System.out.println("Magic Number");
        else
            System.out.println("Not a Magic Number");
    }
}
