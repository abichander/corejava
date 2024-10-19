package packageaccessspecifier;
class PrivateDemo{
    private String name="EB";
}
public class PrivateClass {
    private static int a=10;
    private PrivateClass() {
        System.out.println("Private Constructor");
    }
    private void msg() {
        System.out.println("Private method");
    }
    public static void main(String[] args) {
        System.out.println("Value of a : "+a);
        PrivateClass p=new PrivateClass();
        p.msg();
        //System.out.println("Name : "+p.name);
        
    }
}//Private scope



