import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number ");
        int number=sc.nextInt();
        for(int i=number-1;i>=1;i--){
            number=number*i;
            
             };
             System.out.println("the factorial of your number is:"+number);
        
    }
    
}
