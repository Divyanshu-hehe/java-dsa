import java.util.*;
public class incometax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double  income=sc.nextDouble();
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
    
// import java.util.*;

// public class IncomeTax {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your annual income: ");
//         double income = sc.nextDouble();

//         double tax = 0;

//         if (income <= 250000) {
//             tax = 0;
//         } 
//         else if (income <= 500000) {
//             tax = (income - 250000) * 0.05;
//         } 
//         else if (income <= 1000000) {
//             tax = (250000 * 0.05) + (income - 500000) * 0.20;
//         } 
//         else {
//             tax = (250000 * 0.05) + (500000 * 0.20) + (income - 1000000) * 0.30;
//         }

//         System.out.println("Income Tax to be paid = ₹" + tax);

//         sc.close();
//     }
// }