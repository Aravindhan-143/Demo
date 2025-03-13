import java.util.*;
public class demo {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("addition is enter:1");
        System.out.println("sub is enter:2");
        System.out.println("multi is enter:3");
        System.out.println("divid is enter:4");
        int a=scan.nextInt();
        if(a==1){
            System.out.println("enter the input:");
            int b=scan.nextInt();
            int c=scan.nextInt();
            int d=b+c;
            System.out.println("the addition of two numbers:"+d);
        }
        else if(a==2){
            System.out.println("enter the input:");
            int num1=scan.nextInt();
            int num2=scan.nextInt();
            int num3=num1-num2;
            System.out.println("the sub of two numbers:"+num3);
        }
         else if(a==3){
            System.out.println("enter the input:");
            int num4=scan.nextInt();
            int num5=scan.nextInt();
            int num6=num4*num5;
            System.out.println("the multi of two numbers:"+num6);
        }
        else if(a==4){
            System.out.println("enter the input:");
            int num7=scan.nextInt();
            int num8=scan.nextInt();
            int num9=num7/num8;
            System.out.println("the divid of two numbers:"+num9);
        }else{
            System.out.println("worng command");
        }
    }
}