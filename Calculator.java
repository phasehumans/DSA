package Java_Basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1= input.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2= input.nextInt();

        System.out.print("Enter operation: ");
        char opt= input.next().charAt(0);

//        calculations
        if(opt == '+'){
            int res= num1 + num2;
            System.out.println(res);
        } else if (opt == '-'){
            int res= num1 - num2;
            System.out.println(res);
        } else if (opt == '*') {
            int res= num1 * num2;
            System.out.println(res);
        } else if (opt == '/') {
            if(num2 == 0){
                System.out.println("Can't divide by Zero");
            }
            else{
                float res= (float)num1 / (float)num2;
                System.out.println(res);
            }

        } else {
            System.out.println("Invalid operation ``` ");
        }


    }
}
