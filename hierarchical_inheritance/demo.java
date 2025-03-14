class parent{
    public void add(){
        System.out.println("hello world");
    }
}
class child extends parent{
     public void display(){
        add();
     }
    }
 class thrid extends parent {
      void helper(){
        add();
      }
}
public class demo {

    public static void main(String[] args) {
        thrid obj=new thrid();
        child obj1=new child();
        obj.helper();
        obj1.display();
    }
}