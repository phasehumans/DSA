

public class TypeCasting {
    public static void main(String[] args) {

//        type casting - big to small explicitly
        int num= (int)(48.23f);
        System.out.println(num);

//        automatic type promotion in expression: auto promotion when needed
        int a= 259;
        byte b= (byte)(a);
        System.out.println(b);
//        256(byte size) %  259

//        java is Unicode (all lang support)
        System.out.println("नमस्ते");

    }
}
