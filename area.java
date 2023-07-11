import java.util.*;

class rectangle
{
    int width;
    int length;


    public void area(int width,int length)

    {
        System.out.println("area of rectangle is =" +length*width );
    }

    public void  perimeter(int width,int length)
    {
        System.out.println("perimeter of rectangle is =" +2*(length+width) );
    }
    
}



class circle {

    int Radioous;
    
    public void area(int Radioous)
    {
          System.out.println("area of rectangle is =" +3.14*Radioous*Radioous);
    }
    public void perimeter(int Radioous)
    {
        System.out.println("perimeter of rectangle is =" +2*3.14*Radioous);
    }
}




class mark
{
  
    String name;
    int[] marks;

    public mark(String name,int[] marks)
    {
        this.name = name;
        this.marks = marks;
    }

    

    public double calculate()
    {

        int total=0;
      for(int i=0;i<marks.length;i++)
      {
          total+= marks[i];
      }

     

      return  (double)total/500*100;
    }  

    public  void printInfo()
    {
        int total=0;

        System.out.println("name of student is :"+this.name);

        System.out.println("marks: ");
       
        for(int i=0;i<marks.length;i++)
        {   

            System.out.println(marks[i]);
           
            total+= marks[i];
        }
        System.out.println("total marks: " + total);
        System.out.println("percentage: " + calculate());
    }
    
}


public class area{
    public static void main(String[] args) {
        
        int [] marks={75,84,70,74,32};


        mark student=new mark("komal",marks);

      

        student.printInfo();


        
    }
}

