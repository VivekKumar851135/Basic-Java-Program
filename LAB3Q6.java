public class LAB3Q6 {
    void compare(int x, int y) {
        if (x > y)
            System.out.println(x);
        else
            System.out.println(y);
    }

    void compare(char x, char y) {
        if (x > y)
            System.out.println(x);
        else
            System.out.println(y);
    }

    void compare(String x, String y) {
        if (x.length() > y.length())
            System.out.println(x);
        else
            System.out.println(y);
    }

    public static void main(String[] args) {
        LAB3Q6 obj = new LAB3Q6();
        obj.compare(8, 100);
        obj.compare('z', 'Z');
        obj.compare("vivek", "kumar");
    }
}
