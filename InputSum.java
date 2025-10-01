package Java_Basics;

import java.util.Scanner;

public class InputSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input= 1;
        int res= 0;
        while(input != 0){
            input = sc.nextInt();
            res= res + input;
        }
        System.out.println(res);
    }
}
