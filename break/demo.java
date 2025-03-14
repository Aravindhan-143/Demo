public class demo {

    public static void main(String[] args) {
        int i=0;
        while (i<=10) {
            if(i%2==0){
                if(i>=6){
                    break;
                }
                System.out.println(i);
            }
            i++;
        }
    }
}