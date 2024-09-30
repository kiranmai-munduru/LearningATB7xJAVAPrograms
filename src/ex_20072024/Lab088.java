package ex_20072024;

import java.util.Scanner;

public class Lab088 {
    public static void main(String[] args) {
        //Max number in  two inputs
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number 1");
        int num1 = sc.nextInt();

        System.out.println("Enter the number 2");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        }else if (num1 < num2) {
            System.out.println(num2 + " is greater than " + num1);
        }else {
            System.out.println(num1 + " is equal to " + num2);
        }
        System.out.println(Math.max(num1, num2));
    }
}
