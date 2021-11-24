import java.util.Scanner;

public class LAB_Exam_Q1 {
    void compute(int x, char m) {
        if (m == 's')
            System.out.println("Square of an integer : " + Math.pow(x, 2));
        else
            System.out.println("Cube of an integer : " + Math.pow(x, 3));
    }

    void compute(double side, char a) {
        if (a == 'v')
            System.out.println("Volume of a cube : " + Math.pow(side, 3));
        else
            System.out.println("Diagonal of cube : " + Math.sqrt(3) * side);
    }

    void compute(int length, int breadth, char rect) {
        if (rect == 'a')
            System.out.println("Area of rectangle : " + length * breadth);
        else
            System.out.println("Perimeter of rectangle : " + 2 * (length + breadth));
    }

    public static void main(String[] args) {
        LAB_Exam_Q1 obj = new LAB_Exam_Q1();
        obj.compute(3, 's');
        obj.compute(3.0, 'x');
        obj.compute(10, 3, 'a');
        obj.compute(3, 't');
        obj.compute(3.0, 'v');
        obj.compute(3, 5, 'b');
    }
}
