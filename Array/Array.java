package Array;

public class Array {
    public static void main(String[] args) {
        int [] arr= new int[3];
        arr[2]= 10;
        arr[0]= 20;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);


        int [] arr2= new int [5];
        System.out.println(arr2[1]);
        // default is [0,0,0,0,0]
    }
}
