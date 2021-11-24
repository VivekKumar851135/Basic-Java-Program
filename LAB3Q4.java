public class LAB3Q4 {
    long fact(int f) {
        if (f == 1)
            return 1;
        else
            return f * fact(f - 1);
    }

    void series1(int x, int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum = sum + ((double) x / fact(i));
        }
        System.out.println("Sum of the series1: " + sum);
    }

    void series2(int x, int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + Math.pow(x, i) / fact(i + 1);
        }
        System.out.println("Sum of the series2: " + sum);
    }

    void series3(int x, int n) {
        double sum = 0.0, term = 0.0;
        for (int i = 1; i <= n; i++) {
            term = (Math.pow(x, i)) / fact(i + 1);
            if (i % 2 == 0) {
                sum -= term;
            } else {
                sum += term;
            }
        }
        System.out.println("Sum of the seriess3: " + sum);

    }

    public static void main(String[] args) {
        LAB3Q4 obj = new LAB3Q4();
        obj.series1(1, 2);
        obj.series2(2, 4);
        obj.series3(2, 3);
    }
}
