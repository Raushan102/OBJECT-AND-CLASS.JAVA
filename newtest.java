/**
 * The class defines three subclasses of a shape class, each with their own area calculation method,
 * and demonstrates their use in the main method.
 */
import java.util.*;

///======================================multi level inheritance================================>

class shape{
    int length;
    int breath;
    int height;
    int radious;
    
    String name;
    

    public void area()
    {
        System.out.println("display area of that particular shape");
    }
};

class triangle extends shape{

    triangle(String name, int length, int height)
    {
        this.name=name;
        this.length=length;
        this.height=height;
    }

    
    public void area()
    {
        System.out.println("area of the "+name+"is ="+length*height/2);
    }

    
};

class rectangle extends shape
{

     rectangle (String name, int length, int breath)
     {
        this.name=name;
        this.length=length;
        this.breath=breath;
     }
    public void area()
    {
       System.out.println("area of the "+name+"is ="+length*breath);
    }
}


class circle extends shape
{

    circle(String name,int radious)
    {
        this.name=name;
        this.radious=radious;
    }
   public void area()
   {
      System.out.println("area of the "+name+"is ="+3.14*radious*radious);
   }

}
public class newtest {

    public static void main(String[] args)
    {
        triangle triangle1=new triangle("triangle",10,20);

        triangle1.area();

        rectangle rectangle1=new rectangle("rectangle",23,3);

        rectangle1.area();

        circle circle1=new circle("circle",3);
        
        circle1.area();
    }
    
}


//========================polymorphism =======================>


