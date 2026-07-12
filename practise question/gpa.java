import java.util.*;
public class gpa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float maths=sc.nextFloat();
        float science=sc.nextFloat();
        float english=sc.nextFloat();
        float hindi=sc.nextFloat();
        float cs=sc.nextFloat();
        float percentage=(maths + science + english + hindi + cs)/5;
        float gpa= percentage/9.5f;
        System.out.println(gpa);
    }
    
}
