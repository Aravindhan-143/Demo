public class demo {

    public static void main(String[] args) {
        int count=0;
        for(int i=2020;i<=2030;i++){
    
            if(i%4==0){
                count++;
                System.out.println("the leap years:"+i);
                
            }
            
        }
        System.out.println("the count :"+count);
    }
}