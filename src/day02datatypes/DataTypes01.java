package day02datatypes;

public class DataTypes01 {

    public static void main(String[] args) {

        /*
        What is the difference "primitive" and "non-primitive" data types?
        1)primitive data types contain just values, non-primitive data types contain value + method
        2)primitive data types names use just lowercase characters, but non-primitive data type names use uppercase at the begining

         */

        //Primitive data types: boolean, char, byte, short, int, long, float, double,

        //1)boolean: boolean has 2 values which are true or false. A boolean variable uses just a bit in memory
        boolean isretired = true;
        boolean isOld = false;

        //2)char: char is for just a single character. It uses 16 bits (2 bytes) in memory
        char initial = 'A';



        //3)byte: byte is for whole numbers between -128 and 127. It uses 8 bits (1 byte) in memory
        byte age=14;
        byte mathGrades=76;

        //4)short: short is for whole numbers between -32768 and 32767. ıt uses 16 bits(2 bytes) in memory
        short numberOfStudentsInaSchool = 2134;

        //5)int: int is for whole numbers between -2,147,483,648 and 2,147,483,647. It uses 32 bits( 4 bytes) in memory
        int annualProfitOfApple = 2000000000;

        //6)long: long is for whole numbers between -9,223,372,036,854,755,808 and 9,223,372,036,854,755,807. ıt uses 64 bits(8bytes) in memory
        //Do not forget to put "L" to the end of the value in long data type.
        long populationOfTheWorld= 7000000000L;

        //7)float: float is for decimals. It uses 32 bits in memory
        // Do not Forget to put"F" or "f" to the end of the value
        float priceOfShirt = 12.99F;

        //8) double: double is for decimals. It uses 64 bits in memory
        //In double, decimal part can contain up to 16 digits
        double weightOfACell = 0.00001230004;





        //Non-Primitive Data: String
        String s= "Ali";

        System.out.println(s.toUpperCase());//ALİ

        System.out.println(s.toLowerCase());//ali

    }
}
