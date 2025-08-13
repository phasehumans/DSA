package Java_Basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        for (int num= 1; num <= 5; num++){
            System.out.println(num);
        }


        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        for (int number = 1; number <= n; number++) {
            System.out.print(number + " ");
        }

//        while loop
        int num= 1;
        while (num <=5){
            System.out.println("inside while loop --> num is " + num);
            num++;
        }

//        do while
        int num2= 1;
        do{
            System.out.println("Inside do while loop --> num is " + num2);
            num2++;
        }while(num2 <= 5);

    }
}
