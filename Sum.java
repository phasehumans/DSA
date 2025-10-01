package Java_Basics;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        System.out.print("Enter 1st number: ");
        Scanner input= new Scanner(System.in);
        int a= input.nextInt();
        System.out.print("Enter 2nd number: ");
        int b= input.nextInt();

        int res= a+b;
        System.out.println("Sum is " + res);
    }
}
