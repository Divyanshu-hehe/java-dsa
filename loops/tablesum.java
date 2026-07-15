import java.util.*;
public class tablesum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int table=sc.nextInt();
        int sum=0;
        for(int i=1;i<=10;i++){
            sum+=table*i;
            }
            System.out.println(sum);
    }   
}
