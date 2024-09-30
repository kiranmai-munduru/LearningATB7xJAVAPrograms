
package july.ex_20072024;

import java.util.Scanner;

public class Lab097 {
    public static void main(String[] args) {
        // JDK > 13
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item code");
        int itemcode = sc.nextInt();

        switch (itemcode){
            case 001,002,003:
                System.out.println("It is Electronic Gadget!");
                break;
            case 004,005,007:
                System.out.println("It is Mechinal Gadget!");
                break;
            default:
                System.out.println("None");

        }




    }
}
