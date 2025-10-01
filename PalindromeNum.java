package Java_Basics;

import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num= sc.nextInt();

        int original= num;
        int ans = 01;

        while(num != 0){
            int last= num % 10;
            ans= ans * 10 + last;
            num/=10;
        }

        if (ans == original){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
