abstract class animal{
  public void walk(){}
  
}
class horse extends animal{
    public void walk(){
        System.out.println("walks on four leg");
    }
    
}
class chicken extends animal{
public void walk(){
    System.out.println("walks on 2 leg");
}
}


public class abstraction {
    public static void main(String[] args) {
        horse horse=new horse();
        horse.walk();
    }
    
}
