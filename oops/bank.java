
 class Account{
    public String name;
    protected String email;
    private String password;

    public String getpassword(){
        return this.password;
    }
    public void setpassword(String pass){
        this.password=pass;
    }
 }
public class bank {
    public static void main(String[] args) {
        Account Account1= new Account();
        Account1.name="apna college";
        Account1.email="apnacollegae@gmail.com";
        Account1.setpassword("abcd");
        System.out.println(Account1.getpassword());
        System.out.println(Account1.email);
    }
    
}
