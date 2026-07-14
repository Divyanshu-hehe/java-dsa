import java.util.*;
public class weekly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number:");
        int day=sc.nextInt();
        
        if (day==1) {
            System.out.println("monday");
        }
        if (day==2) {
            System.out.println("tuesday");
            
        }
         if (day==3) {
            System.out.println("wednesday");
        }
        if (day==4) {
            System.out.println("thursday");
            
        }
         if (day==5) {
            System.out.println("friday");
        }
        if (day==6) {
            System.out.println("saturday");
            
        }
         if (day==7) {
            System.out.println("sunday");
        }
         else{
            System.out.println("no day");
         }
    }
    
}
