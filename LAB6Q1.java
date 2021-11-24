public class LAB6Q1 {
    public static void main(String args[]){
        int year; 
        java.util.Calendar current;
        current=java.util.Calendar.getInstance();
        System.out.println("Current Year: "+current.get(java.util.Calendar.YEAR));
        int month = current.get(java.util.Calendar.MONTH);
        System.out.println("Current Month: "+(month+1));
        }
   
}

