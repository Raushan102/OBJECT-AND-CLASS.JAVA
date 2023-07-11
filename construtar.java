import java.util.*;

class student{

    String name;
    int age;
    int roll_number;
    int classes;

    public void inFoStudent()
    {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.roll_number);
        System.out.println(this.classes);
    }

  public   student(String name, int age, int roll_number, int classes)
    {
        this.name=name;
        this.age=age;
        this.roll_number=roll_number;
        this.classes=classes;
    }

}

// second class

class raushan extends student{

    String friend;
   
 
    public void print()
    {
        System.out.println(this.age);
        System.out.println(this.friend);
        System.out.println(this.classes);

    }
     public raushan(int age, String friend)

     
    {
        super("  raushan kumar saw",0,0,0);
        this.friend=friend;
        
    }
     

  
    

}


public class construtar {
    public static void main(String[] args)
    {
        student student1=new student("neeraj",20,1,13);
        student1.inFoStudent();

        raushan r=new raushan(65,"neeraj");
        r.age=20;
        r.classes=13;
        r.friend="neeraj";
        
        r.inFoStudent();
    }
    
}
