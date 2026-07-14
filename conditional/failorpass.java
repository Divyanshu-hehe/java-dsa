import java.util.*;
public class failorpass {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        float maths=input.nextFloat();
        float cs=input.nextFloat();
        float hindi =input.nextFloat();
        float percentage=maths + cs + hindi/3;
        if (percentage>40) {
            System.out.println("pass");
             }
        else{
            System.out.println("fail");
        }
   
   
    }


}
