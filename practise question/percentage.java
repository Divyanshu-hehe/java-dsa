import java.util.*;
public class percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float  maths=sc.nextFloat();
        float  science=sc.nextFloat();
        float  english=sc.nextFloat();
        float  hindi=sc.nextFloat();
        float  cs=sc.nextFloat();

        float percentage=( maths + science + english + hindi + cs)*100/500;
        System.out.println(percentage);
       
    }
    
}
