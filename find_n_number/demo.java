import java.util.*;
public class demo {

    public static void main(String[] args) {
        int i =1;
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the input:");
        int j=scan.nextInt();
        while (i<=j) {
            System.out.println(i);
            i++;
        }
    }
}