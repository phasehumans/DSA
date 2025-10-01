package Java_Basics;

import java.util.Scanner;

public class Currency_Convert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount in Rupees: ");
        int amount = input.nextInt();

        float res= (float) ( (float)amount / 88.07);
        System.out.println("$" + res);


    }
}
