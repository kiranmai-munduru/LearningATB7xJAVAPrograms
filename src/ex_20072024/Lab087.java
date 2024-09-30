package ex_20072024;

import java.util.Scanner;

public class Lab087 {
    public static void main(String[] args) {
        //take a user input and check if number is even or odd
        //logic building
        //1.figure out inputs
        //2.Data type
        //How to take input ---> Scanner class
        //nextInt()--Input
        //3.Do we need conversion or directly
        //4.Rough logic--num%2==0 even, odd
        //5.Optimize

        Scanner sc = new Scanner(System.in); //To take input -creating object of scanner class

        System.out.println("Enter a number: ");
        int user_input = sc.nextInt(); //To assign input to variable

        System.out.println(user_input);

        if (user_input % 2 == 0) {
            System.out.println(user_input + " is even");
        }else if (user_input % 2 != 0) {
            System.out.println(user_input + " is odd");
        }
    }
}
