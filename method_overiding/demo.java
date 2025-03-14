class parent{
    public void display(){
        System.out.println("hello world");
    }
}
class child extends parent{
     public void display(){
        System.out.println("home");
     }
    }

public class demo {

    public static void main(String[] args) {
        child obj=new child();
        obj.display();
    }
}