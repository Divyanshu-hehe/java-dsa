import java.util.*;
public class website {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter website:");
        String website=sc.next();
        if (website.endsWith(".com")) {
            System.out.println("commercial website");
             } 
        if (website.endsWith(".org")) {
            System.out.println("organisation website");
        }
        if (website.endsWith(".in")){
            System.out.println("indian website");
        }
        
    
    
        else{System.out.println("not in reach");}
        
    }
    
}
