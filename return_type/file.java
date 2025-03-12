public class file{
            public int add(int a,int b){
                int c=a+b;
                return c;
            }
    public static void main(String arg[]){
           file obj=new file();
          int d=obj.add(10,20);
          System.out.println(d);
    }
}