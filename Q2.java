public class Q2 {
    public static void main(String[] args) {
        int m=10;
        int n=m;
        while (n!=1) {
            if(n%2==0){
                n=n/2;
            }else
            n=(3*n)+1;
            System.out.println(n);
        }
    }
}
