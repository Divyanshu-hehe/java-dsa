// class pen{
//    private String community;
//     int batch;
// public void printcommunity(){
//     System.out.println(this.community);
// }
// public String getcommunity(){
//     return this.community;
// }
//  public void setcommunity(String name){
//         this.community=name;
//     }
// }
class Student{
    static String batch="the uniques";
    static int year =2025; 
   
    String name;
    private String marks;
    int age;
    
    Student(String name,int age,String marks){
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
    public void setMarks(String marks){
        if(marks.equals("A")||marks.equals("B")){
            this.marks=marks;}
        else{
            System.out.println("invalid marks");
        }  }
        public String getMarks(){
            return marks;
        }
}
public class revise{
    public static void main(String[] args) {
          
        Student student1 = new Student("Deva", 18, "A");

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(Student.batch);
        System.out.println(Student.year);
        System.out.println(student1.getMarks());

        student1.setMarks("B");
        System.out.println(student1.getMarks());

    }


    
}
// pen pen1=new pen();
        // pen1.setcommunity("the uniques");        
        //  System.out.println(pen1.getcommunity());