import java.util.*;


public class sume {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.err.println("enter number");
        int number=sc.nextInt();
        int sum=0;

       while(number!=0)
       {
          int r=number%10;
          sum=sum+r;

          number=number/10;
       }

       System.out.println(sum);


        
    }
    
}
