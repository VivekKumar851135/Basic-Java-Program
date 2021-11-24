import java.util.Scanner;
class Area{
   double length, breadth;
   Area(double l, double b){  
      length = l;
      breadth= b;
    }
  Area(double len){  
     length = breadth = len;
   }
  double calculate(){ 
    return length * breadth ;
  }
}
public class LAB_Exam_Q2 extends Area{    
double height;
LAB_Exam_Q2(double l,double h)
{
 super(l);
 this.length = l;
 this.height = h;
}
LAB_Exam_Q2(double l,double b,double h)
{
  super(l,b);
  this.length=l;
  this.breadth=b;
  this.height=h;
}
double calculate()
{
 return length*breadth*height; 
}
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);                                                        
	double l=sc.nextDouble(); 
	double b=sc.nextDouble(); 	
	double h=sc.nextDouble();
	LAB_Exam_Q2 myshape1 = new LAB_Exam_Q2(l,h);
	LAB_Exam_Q2 myshape2 = new LAB_Exam_Q2(l,b,h);
	double volume1;
	double volume2;
	volume1 = myshape1.calculate();
	volume2=myshape2.calculate();
	System.out.println(volume1);
	System.out.println(volume2);
	}
}