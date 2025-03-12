public class file3{
    public String demo(String a,String b){
        String c=a+b;
        return c;
    }
    public static void main(String[] args) {
        file3 obj=new file3();
        String d=obj.demo("wel","com");
        System.out.println(d);
    }
}