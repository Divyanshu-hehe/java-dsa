import java.util.*;
public class incometax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float income=sc.nextFloat();
        if (income>10.0f) {
            System.out.println("income tax "+income*30/100);
            if (income>5.0f) {
                System.out.println("income tax "+income*20/100);
                } 
            if (income>2.5f) {
                System.out.println("income tax "+income*5/100);
                
            } else {
                System.out.println("no tax");
                
            }
                
            }
            
        }
        
    }
    
