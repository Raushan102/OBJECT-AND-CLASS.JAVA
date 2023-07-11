/**
 * The "table" class in Java takes user input for a number and prints out the multiplication table for
 * that number up to 10.
 */

import java.util.*;

public class table {

    public static void main(String[] args) {

        table();

    }

    public static void table() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");

        int number = sc.nextInt();
        System.out.println("table of " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "*" + i + "=" + number * i);
        }
    }

}
