//==================================================>test 1===================================>>

/* class student {
    String name;
    int age;
    int classes;

    public student(String name, int age, int classes) {
        this.name = name;
        this.age = age;
        this.classes = classes;
    }

    public student(String name, int age) {
        this.name = name;
        this.age = age;
        this.classes = 0;
    }

    public void printINformations() {

        System.out.println(name);
        System.out.println(age);
        System.out.println(classes);

    }
    

}

public class test {

    public static void main(String[] args)
    {
        student firstStudent=new student("raushan",22,12);

        firstStudent.printINformations();

        student1 sececoStudent1=new student1("raushan kumar saw",0, 0, 54);
        
        sececoStudent1.printINformations();
    }

    

}
class student1 extends student{
    int rollnumber;


     public student1(String name,int age,int classes,int rollnumber)
     {
        super(name=null,age,classes);
       
        this.rollnumber=rollnumber;


        
        

     }
     public void   printINformations()
        {
          super.printINformations();
             System.out.println(rollnumber);
        }

} */

// ================================test 2=========================================================>>

/* class Animal
{
    public void speak ()
    { 
         
         System.out.println("able to speak");
    }

} 

class dogs extends Animal{
    public void speak()
    {
        System.out.println("dog can bark");
    }
}
class cat extends dogs{
    public void speak()
    {
        System.out.println("miaao");
    }
}


public class test{
    public static void main(String[] args)
    {
        Animal[] animal=new Animal[3];

        animal[0]=new dogs();
        animal[1]=new cat();
        animal[2]=new Animal();


        for(int i=0; i<animal.length; i++)
        {
            animal[i].speak();
        }
    }
} */

/* 
class first{

    int a;
      first(int a)
      {
        System.out.println("hello  iam constructor of first class"+ a);
      }

      first()
      {
        System.out.println("hello kam constructor of first class but not any parameters");
      }

}

class second extends first
{

    second()
    {   
        super();
        System.out.println("hello iam constructor of second class but not any parameters");
    }
    second(int b ,int c)
    {
        super(b);
        System.out.println("hello a am constructor of second class with a parameter "+c);
    }

}
class third extends second{
    third()
    {   
        super();
        System.out.println("hello iam constructor of third class but not any parameters");
    }
    third(int b,int c,int d)
    {
        super(c,d);
        System.out.println("hello a am constructor of third class with a parameter "+d);
    }

}



public class test
{
    public static void main(String[] args) {

        first f1=new first(34);

        second s2=new second(3,4);

        third s3=new third(43,56,44);
        
    }
} */

//=================================>clg assignment ================>

//==============================>question 1=========================>

/* class Factorial{
    int number;

   public  Factorial(int number)
   {
      this.number=number;
      FactorialNumber(number);

   }

   public void FactorialNumber(int number)
   {
    int fact=1;

    while(number!=0)
    {
        fact=fact*number;
        number--;
    }
    System.out.println("factorial of number is = " + fact);
   }

   
}





public class test
{
    public static void main(String[] args) {

        Factorial f1=new Factorial(10);

      
        
    }
}
 */

//=========================question 2=======================================>

/* class reverse {
    int number;

    public reverse(int number) {
        this.number = number;
        reverseNumber(number);

    }

    public void reverseNumber(int number) {
        int reverse = 0;

        while (number != 0) {

            int r = number % 10;

            reverse = reverse * 10 + r;

            number = number /10;
        }

        System.out.println("reverse of the number is = " + reverse);
    }

}

public class test {
    public static void main(String[] args) {

        reverse f1 = new reverse(345);


    }
}
 */

//=======================question 3================================================>

/* import java.util.*;

class palindrome {
   int number;

   public palindrome(int number) {
       this.number = number;
      palindromeNumber(number);

   }

   public void palindromeNumber(int number) {

       int number2=number;
       int reverse= 0;

       

       while (number != 0) {

           int r = number % 10;

          reverse =reverse * 10 + r;

           number = number /10;
       }

      if(number2==reverse)
      {
        System.out.println("enter number is palindrome number ");
      }
      else{
       System.out.println("enter number is not palindrome number ");
      }
   }

}

public class test {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);

       System.out.println("enter number");

       int f2=sc.nextInt();


      palindrome f1 = new palindrome(f2);


   } 
}*/

//=======================question 4=================================================>

/* import java.util.*;

 class Armestrong {
    int number;

    public Armestrong(int number) {
        this.number = number;
       ArmestrongNumber(number);

    }

    public void ArmestrongNumber(int number) {

        int number2=number;
        int Armestrong = 0;

        

        while (number != 0) {

            int r = number % 10;

           Armestrong =Armestrong + r*r*r;

            number = number /10;
        }

       if(number2==Armestrong)
       {
         System.out.println("enter number is Armestrong number ");
       }
       else{
        System.out.println("enter number is not Armestrong number ");
       }
    }

}

 public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter number");

        int f2=sc.nextInt();


       Armestrong f1 = new Armestrong(f2);


    } 
}
 */

//===================question 5===========================================>

/* import java.util.*;

class prime {
    int number;
   

    public prime(int number) {
        this.number = number;
         ISprime(number);

    }

    public void ISprime(int number) {
        int count = 0;

        if (number == 0 && number == 1) {
            System.out.println("enter number is not prime number ");

        } else {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                } else {
                    continue;
                }
            }
        }

        if(count==2)
        {
            System.out.println("enter number is prime number ");
        }
        else{
              System.out.println("enter number is not  prime number ");
        }

    }

}

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number");

        int f2 = sc.nextInt();

        prime f1 = new prime(f2);

    }
} */

//============================question 6=============================>

/* public class test {
    public static void main(String[] args) {
        
        int[] ArrayFirst={3,6,9,13,15,18};

    
        if(seriesCheck(ArrayFirst)!=0)
        {
           System.out.println("given array is not a series");
        }
        else{
            System.out.println("given array is series");
        }
      
       

    }


     public   static int  seriesCheck(int [] ArrayFirst)
        {
            int count=0;

            int constantDifference=ArrayFirst[1]-ArrayFirst[0];

           for(int i=1; i<ArrayFirst.length-1; i++)
            {

                
                if(constantDifference ==ArrayFirst[i+1]-ArrayFirst[i])
                {
                    continue;
                }
                else
                {
                       count++;
                }
            }

            return count;

        }
} */

//=========================question 7===========================================>

/* public class test {
    public static void main(String[] args) {
        
        int[] ArrayFirst={3,6,9,13,15,18,23,32,32,2,3};
        int sume=0;

        for(int i=0; i<ArrayFirst.length; i++)
        {

            sume+=ArrayFirst[i];
            
        }

        System.out.println("sume="+sume);

    
    }

    } */

///==========================question 8==================================>

/* import java.sql.Array;
import java.util.*;

public class test {
    public static void main(String[] args) {

        //==================creating first 2d matrix====================>

        int[][] arra = new int[5][6];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                System.out.println("enter number on index of [" + i + "][" + j + "] is ");

                arra[i][j] = sc.nextInt();

            }
        }

       

        //====================creating second 2d matrix==========================>

        System.out.println("ente number is second matrix");

        int [][] arr2 = new int[2][2];

        for(int i= 0; i< 2; i++)
        {
            for(int j = 0; j<2;j++)
            {
                System.out.println("enter number on index of [" +i+ "][" + j + "] is ");

                arr2[i][j] = sc.nextInt(); 
            }
        }
  System.out.println("first matrix");
    //=====================printing first matrix=======================>

      for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                System.out.print(arra[i][j] + " ");

            }
            System.out.println();

        }

        System.out.println("second matrix ");
     
    //======================printing second matrix========================>
 
        for(int i= 0; i< 2; i++)
        {
            for(int j = 0; j<2;j++)
            {
               

                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }

        addFun(arra, arr2);

    }


    //===================adding first and second matrix============================<
public static void  addFun(int[][] arra,int[][] arr2)
   { 
    int [][] addArray=new int[2][2];

    for(int i=0; i<2;i++)
    {
        for(int j=0; j<2;j++)
        {

            addArray[i][j] =  arra[i][j] + arr2[i][j];
               
        }
    }

   System.out.println("final matrix");
for(int i=0; i<2;i++)
    {
        for(int j=0; j<2;j++)
        {
              System.out.print(addArray[i][j]+" ");
        }
        System.out.println();
    }

}

}

 */
//==========================question 9==============================>





/*  import java.sql.Array;
import java.util.*;

public class test {
    public static void main(String[] args) {

        //==================creating first 2d matrix====================>

        int[][] arra = new int[5][6];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                System.out.println("enter number on index of [" + i + "][" + j + "] is ");

                arra[i][j] = sc.nextInt();

            }
        }

       

        //====================creating second 2d matrix==========================>

        System.out.println("ente number is second matrix");

        int [][] arr2 = new int[2][2];

        for(int i= 0; i< 2; i++)
        {
            for(int j = 0; j<2;j++)
            {
                System.out.println("enter number on index of [" +i+ "][" + j + "] is ");

                arr2[i][j] = sc.nextInt(); 
            }
        }
  System.out.println("first matrix");
    //=====================printing first matrix=======================>

      for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                System.out.print(arra[i][j] + " ");

            }
            System.out.println();

        }

        System.out.println("second matrix ");
     
    //======================printing second matrix========================>
 
        for(int i= 0; i< 2; i++)
        {
            for(int j = 0; j<2;j++)
            {
               

                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }

        multiplyFun(arra, arr2);

    }


    //===================adding first and second matrix============================<
public static void  multiplyFun(int[][] arra,int[][] arr2)
   { 
    int [][] addArray=new int[2][2];

    for(int i=0; i<2;i++)
    {
        for(int j=0; j<2;j++)
        {

            addArray[i][j] =  arra[i][j] * arr2[i][j];
               
        }
    }

   System.out.println("final matrix");
for(int i=0; i<2;i++)
    {
        for(int j=0; j<2;j++)
        {
              System.out.print(addArray[i][j]+" ");
        }
        System.out.println();
    }

}

} */