public class Vivek {
    public static void main(String[] args) {
        InnerVivek obj= new InnerVivek();
        obj.age=20;
        System.out.println(obj.age);
        int a=obj.Inc();
        System.out.println(a);
    }
    
    public static class InnerVivek {
    
        int age;
        int Inc(){
            int inc=0;
            inc++;
            return inc;
          
        }
      }
    }
    