package set1;

public class datatypes {

    public static void main(String[] args){


        System.out.println();
        System.out.println("int data type test");

        int max_int=Integer.MAX_VALUE;      //2,147,483,647
        int min_int=Integer.MIN_VALUE;      //-2,147,483,648
        System.out.println(max_int);
        System.out.println(min_int);


        System.out.println("overflow of max int: "+ (max_int+1));  //-2147483648
        System.out.println("overflow of min int: "+ (min_int-1));  //2147483647


        System.out.println();
        System.out.println("byte data type test");

        byte max_byte=Byte.MAX_VALUE;      //127
        byte min_byte=Byte.MIN_VALUE;      //-128
        System.out.println(max_byte);
        System.out.println(min_byte);
        System.out.println("overflow of max byte: "+ (max_byte+1));  //128
        System.out.println("overflow of min byte: "+ (min_byte-1));  //-129


        System.out.println();
        System.out.println("short data type test");

        short max_short=Short.MAX_VALUE;      //32767
        short min_short=Short.MIN_VALUE;      //-32768
        System.out.println(max_short);
        System.out.println(min_short);
        System.out.println("overflow of max short: "+ (max_short+1));  //32768
        System.out.println("overflow of min short: "+ (min_short-1));  //-32769
//        short new_max_short = 32768;  //gives error as its more than allowed size


        System.out.println();
        System.out.println("long data type test");

        long max_long=Long.MAX_VALUE;      //9223372036854775807
        long min_long=Long.MIN_VALUE;      //-9223372036854775808
        System.out.println(max_long);
        System.out.println(min_long);
        System.out.println("overflow of max long: "+ (max_long+1));  //-9223372036854775808
        System.out.println("overflow of min long: "+ (min_long-1));  //9223372036854775807


        byte test_byte=33;
        short test_short=3000;
        int test_int=22222;
        long test_long=50000L+10L*(test_byte+test_short+test_int);
        System.out.println("test of long addition: "+test_long);


        //cast conversion
        //https://www.w3schools.com/java/java_type_casting.asp
        //        In Java, there are two types of casting:
        //
        //        Widening Casting (automatically) - converting a smaller type to a larger type size
        //        byte -> short -> char -> int -> long -> float -> double
        //
        //        Narrowing Casting (manually) - converting a larger type to a smaller size type
        //        double -> float -> long -> int -> char -> short -> byte

        short test_shortnow=(short) (50000+10*(test_byte+test_short+test_int));
        System.out.println("test of test_shortnow: "+test_shortnow);


    }
}
