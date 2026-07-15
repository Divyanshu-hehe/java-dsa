// public class even {
//     public static void main(String[] args) {
//          int m=1;
         
//         while(m<=10){
//             if (m%2==0) {
//             System.out.println(m);
                
//             }
//             m++;
            
//         }
//     }
// }
// public class even {
//     public static void main(String[] args) {
//         int count = 1;
//         int sum = 0;

//         while (count <= 10) {
//             sum = sum + (2 * count);
//             count++;
//         }

//         System.out.println("Sum of first 10 even numbers = " + sum);
//     }
// }
public class SumEvenNumbers {
    public static void main(String[] args) {
        int i = 2;
        int sum = 0;

        while (i <= 10) {
            sum = sum + i;
            i = i + 2;
        }

        System.out.println("Sum of even numbers up to 10 = " + sum);
    }
}