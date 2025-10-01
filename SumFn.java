package Java_Basics;

import java.util.Scanner;

public class SumFn {
    public static void main(String[] args) {
        int ans= add();
        System.out.println("Sum is " + ans);


    }

    static int add(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1= sc.nextInt();
        System.out.print("Enter num2: ");
        int num2= sc.nextInt();

        int sum= num1 + num2;
        return  sum;
    }
}
