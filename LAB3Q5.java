public class LAB3Q5 {
    void polygon(int n, char ch) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    void polygon(int n, int y) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print('@' + " ");
            }
            System.out.println();
        }
    }

    void polygon() {
        int n = 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*' + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LAB3Q5 obj = new LAB3Q5();
        obj.polygon(5, 'a');
        obj.polygon(4, 3);
        obj.polygon();
    }
}
