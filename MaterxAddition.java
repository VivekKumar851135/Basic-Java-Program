import java.util.Scanner;
public class MaterxAddition{
    public static void main(String[] args)
    {
        int a[][]=new int[3][3],i,j,b[][]=new int[3][3],c[][]=new int[3][3];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 9 number in a matrix");
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[0].length;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
         System.out.println("Enter 9 number in a matrix");
         System.out.println("Enter 9 number in a matrix");
         for(i=0;i<b.length;i++)
        {
            for(j=0;j<b[0].length;j++)
            {
                b[i][j]=in.nextInt();
            }
        }
        System.out.println("Sum of two matrix is:");
        for(i=0;i<c.length;i++)
        {
            for(j=0;j<c[0].length;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
       for(i=0;i<c.length;i++)
        {
            for(j=0;j<c[0].length;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}