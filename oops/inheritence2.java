class shape{
    public void area(){
        System.out.println("display area");
    }

}
    class Triangle extends shape{
        public void area(int l,int h){
System.out.println(1/2*l*h);
        }
    }
    class equilaterialTriangle extends Triangle {
     public void area(int l,int h){
}
    }
    class Circle extends shape{
        public void area(int r){
            System.out.println((3.14)*r*r);
        }
    }

public class inheritence2 {
    public static void main(String[] args) {
        
    }
    
}
