
import java.awt.*;
import java.util.Scanner;

public class VolumePrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter base area: ");
        float basearea = sc.nextFloat();
        System.out.print("enter height: ");
        float height= sc.nextFloat();

        double res= basearea * height;

        System.out.println("Volume of Prism: " + res);


    }
}
