package Java_Basics;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= 0;
        int b= 1;
        int n= sc.nextInt();
        int count= 2;

        while(count < n){
            int temp= b;
            b= b + a;
            a= temp;
            System.out.print(b+ " ");
            count++;

        }
        System.out.println();
        System.out.println(n + "th number is -> " + b);
    }

}
