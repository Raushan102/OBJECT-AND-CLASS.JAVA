import java.util.*;


public class facturial {
    public static void main(String[] args) {


        Scanner RausHan=new Scanner(System.in);
        System.out.println("enter number ");
        int number =RausHan.nextInt();
        int fact=1;

        while(number!=0)
        {
       
              fact=fact*number;
              number--;
        }
         RausHan.close();

          System.out.println("facturial of inter number is :"+fact);
    }
   

    
}
