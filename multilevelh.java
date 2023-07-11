
class animal{

    public void eat()
    {
        System.out.println("animal can eat");
    }
}
class dog extends animal{
    public void speak()
    {
        System.out.println("dog only brak");
    }
}
class cat extends dog{

    public void name()
    {
      System.out.println("cat name is cauity");  
    }
}





public class multilevelh {

    public static void main(String[] args)
    {
      
    animal p=new animal();
    p.eat();
    
    }
    
}
