package Java_Basics;

public class SwapFn {
    public static void main(String[] args) {
        int a= 10;
        int b= 20;
        swap(10,20);
        System.out.println(a + " " + b);
    }

    static void swap(int a, int b){
        int temp= a;
        a= b;
        b= temp;
    }
}

// no change due to java only has pass by value
// not modifying but creating new so no change
