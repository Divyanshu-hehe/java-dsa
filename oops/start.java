class pen{
    String color;
    String type;
    public void write(){
         System.out.println("writing something");
    }
    public void printcolour(){
        System.out.println(this.color);
    }
    
}
// class Student{
//     String name;
//     int age;
//     public void printname(){
//         System.out.println(this.name);
//     }
//     public void printage(){
//         System.out.println(this.age);
//     }

// }
public class start{
    public static void main(String[] args){
        pen pen1 = new pen();
        pen1.color="blue";
        pen1.type="gel";
        

        // pen pen2=new pen();
        // pen2.color="black";
        // pen2.type="ball";
        
        pen1.printcolour();
        // pen2.printcolour();

        // Student s1= new Student();
        // s1.name="aman";
        // s1.age=24;

        // s1.printname();
    }
    
    
}
// this keyword important