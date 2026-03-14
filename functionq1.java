import java.util.*;
public class functionq1 {
    public static int NumberSum(int a,int b){
    int sum= a + b;
    return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=NumberSum(a,b);
        System.out.println(sum);
    }
    
}
