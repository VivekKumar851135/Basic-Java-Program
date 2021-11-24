import java.util.Scanner;

public class LAB3Q2 {
    boolean isPrime(int x) {
        int i;
        if (x == 1)
            return false;
        for (i = 2; i < x; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }

    int sumOfPrimeDigits(int x) {
        int sum = 0, r;
        while (x > 0) {
            r = x % 10;
            if (isPrime(r) == true)
                sum = sum + r;
            x = x / 10;
        }
        return sum;
    }

    void check() {
        System.out.print("Enter 10 integers separated by space: ");
        int ans = 0, temp;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            temp = scan.nextInt();
            if (isPrime(temp))
                ans += temp;
        }
        scan.close();
        System.out.println(isPrime(ans));
    }

    public static void main(String[] args) {
        LAB3Q2 obj = new LAB3Q2();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean x = obj.isPrime(num);
        int sum = obj.sumOfPrimeDigits(num);
        if (x == true)
            System.out.println(" prime Number");
        else
            System.out.println("Not a prime Number");
        System.out.println("Sum of prime digits is : " + sum);
        obj.check();
    }
}
