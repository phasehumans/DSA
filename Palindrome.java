package Java_Basics;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter String here: ");
        String str= input.next();
        String rev= new StringBuilder(str).reverse().toString() ;

        if (str.equalsIgnoreCase(rev) ) {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
}
