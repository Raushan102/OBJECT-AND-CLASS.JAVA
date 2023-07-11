import java.lang.Math;
import java.util.*;
import java.util.Random;


public class randamNumberGenerter {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    Random random=new Random();

    System.out.println("enter number between 1 to 3");
    //press 1 for  rock;
    //press 2 for paper;
    //press 3 for scissors;

    int choice=sc.nextInt();


    int computer_Input= random.nextInt(3);

    System.out.println("compuetr choice is:"+" "+computer_Input);
    System.out.println("your choice is:"+" "+choice);

    if(computer_Input==choice)
    {
        System.out.println("draw");
    }
    else if( computer_Input==1 && choice==3 || computer_Input==2 && choice==1 || computer_Input==3 && choice==2 )
    {
        System.out.println("computer win");
    }
    else
    {
        System.out.println("you win");
    }

    

    
    
  }
}
