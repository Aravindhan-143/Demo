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
     class thrid extends child {
      void helper(){
        display();
      }
}
public class demo {

    public static void main(String[] args) {
        thrid obj=new thrid();
        obj.helper();
    }
}