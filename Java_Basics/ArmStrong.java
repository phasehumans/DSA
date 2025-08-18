package Java_Basics;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter num: ");
        int num= sc.nextInt();

        int original= num;
        int sum= 0;

        int lengthNum= String.valueOf(num).length();

        while(num != 0){
            int lastDigit= num % 10;
            sum += Math.pow(lastDigit, lengthNum);
            num /= 10;
            System.out.println(sum);
        }
        if (sum == original){
            System.out.println("ArmStrong");
        }else{
            System.out.println("Not ArmStrong");
        }

    }
}
