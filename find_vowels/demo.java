import java.util.*;
public class demo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the input:");
        String a=scan.nextLine();
        String b[]={"a","e","i","o","u"};
        
        if(a.equals(b[0])){
            System.out.println("this is vowels:"+a);
        }
        else if(a.equals(b[1])){
            System.out.println("this is vowels:"+a);
        }
        else if(a.equals(b[2])){
            System.out.println("this is vowels:"+a);
        }
        else if(a.equals(b[3])){
            System.out.println("this is vowels:"+a);
        }
        else if(a.equals(b[4])){
            System.out.println("this is vowels:"+a);
        }
        else{
            System.out.println("this is not vowels.");
        }
    }
}