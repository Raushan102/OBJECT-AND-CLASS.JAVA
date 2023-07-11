
import java.util.*;

// class for find reverse of any number
class reverseNumber {

    public int getReverse(int number) {// function and parameter of class reverseNumber
        int reverse = 0;
        while (number != 0)// condition

        {

            int rem = number % 10;// for remender
            reverse = reverse * 10 + rem;
            number = number / 10;// for division result
        }
        return reverse;// returning reverse of number

    }
}

class palindrome {
    public void palindromeCalculater(int number) {
        int number2 = number;

        int reverse = 0;
        while (number != 0) {
            int r = number % 10;// for remender
            reverse = reverse * 10 + r;
            number = number / 10;// for division result
        }

        if (number2 == reverse) {
            System.out.println("enter number is palindrome");
        } else {
            System.out.println("enter number is not palindrome");
        }
    }
}

class armstrong {
    public void armstrongCalculator(int number) {

        int number3 = number;

        int armstrongNumber=0;

        while (number != 0) {

            int r = number % 10;

            armstrongNumber = armstrongNumber + (r * r * r);

            number = number / 10;


        }
        if(armstrongNumber ==number3) {
            System.out.println("enter number is armstrong");
        }

        else
        {
            System.out.println("enter number is not  armstrong");
        }

}
}


public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        reverseNumber rNumber = new reverseNumber();// object for find reverse of
        System.out.println("enter number");
        int number = sc.nextInt();

        System.out.println("reverse of number is " + rNumber.getReverse(number));

        palindrome first = new palindrome();
        first.palindromeCalculater(number);

        armstrong third= new armstrong();
        third.armstrongCalculator(number);
    }

}
