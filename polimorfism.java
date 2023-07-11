class student {

    String name;
    int age;

    int classes;

    public void info(String name) {
        System.out.println(name);
    }

    public void info(int age) {
        System.out.println(age);
    }

    public void info(String name, int classes) {
        System.out.println(name + " " + classes);
    }
}

class number {

    public void polimorfism(int number) {
        int reverse = 0;
        int copyNumber = number;
        while (number != 0) {
            
            int reminder = number % 10;
            reverse = reverse * 10 + reminder;
            number = number / 10;
        }
        if (copyNumber == reverse) {
            System.out.println("enter number is palindrome number");
        } else
            System.out.println("enter number is not palindrome number");
    }

    public int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            int rem = number % 10;
            reverse = number * 10 + rem;
            number = number / 10;

        }
        return reverse;

    }

}

public class polimorfism {

    public static void main(String[] args) {

        student first = new student();

        student second = new student();

        first.name = "raushan";
        first.age = 20;
        first.classes = 13;

        second.name = "neeraj";
        second.classes = 13;
        second.age = 22;

        first.info(first.name);
        second.info(second.age);
        first.info(first.name,first.age);

        number number1 = new number();
        number1.polimorfism(256);
        int reverseNumber = number1.reverse(252);
        System.out.println(reverseNumber);

    }

}