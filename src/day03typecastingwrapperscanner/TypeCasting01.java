package day03typecastingwrapperscanner;

public class TypeCasting01 {


    public static void main(String[] args) {

        //convert smal data type to large data type
        byte b = 47; //47 is in byte type

        int i = b; //47 is int data type

        // convert large data type to small data type

        double d = 1.2;

        short s = (short) d;
        //convert short 257 to byte? Explicit Narrowing

        short r = 257;
        byte y = (byte)r;
        System.out.println(y);


    }

}
