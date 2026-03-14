import java.util.Scanner;

public class functionq2 {
    public static int CalaculateProduct(int a,int b){
    int product=a*b;
    return product;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int product=CalaculateProduct(a,b);
        System.out.println(product);
    }
    
}
