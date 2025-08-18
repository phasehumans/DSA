package Java_Basics;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 1;

        while(count <= num){
            if (num % count == 0){
                System.out.print(count + " ");
                count ++;
            }else{
                count ++;
            }
        }


    }
}
