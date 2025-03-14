public class demo{
    public void add(int a,int b){
        System.out.println("adding two number:"+(+b));
    }
    public void add(int a,int b,int c){
        System.out.println("adding three number:"+(a+b+c));
    }
    public static void main(String[] args) {
        demo obj=new demo();
        obj.add(10,20);
        obj.add(12,15,32);
   }
}