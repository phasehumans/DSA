package Java_Basics;

import java.util.Scanner;

public class Case_Check {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char a= sc.next().trim().charAt(0);
//        System.out.println(a);

        if (a >= 'a' &&  a <= 'z'){
            System.out.println("Lower Case");
        }
        else{
            System.out.println("Upper Case");
        }
    }
}
