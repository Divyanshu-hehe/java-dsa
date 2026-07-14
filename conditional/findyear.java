import java.util.*;
public class findyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your year:");
        int year=sc.nextInt();
         
        if (year%4==0 && year%100!=0 || year%400==0) {
            System.out.println("its an leap year:");
        }
        else{
            System.out.println("not an leap year");
        }
    }
    
}
