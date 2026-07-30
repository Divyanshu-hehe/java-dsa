class shape{
    String colour;
}
class Triangle extends shape{
    public void printcolour(){
        System.out.println(this.colour);
    }

}
public class inheritence {
    public static void main(String[] args) {
        Triangle t1= new Triangle();
        t1.colour="red";
        
        t1.printcolour();
    }
    
}
