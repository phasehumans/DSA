package Java_Basics;

import java.util.Scanner;

public class InputLargest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int input= 1;
        int largest= 0;

        while(input != 0){
            System.out.print("Enter Number: ");
            input= sc.nextInt();
            if (input > largest){
                largest = input;
            }
        }
        System.out.println("Largest number --> " + largest);
    }
}
