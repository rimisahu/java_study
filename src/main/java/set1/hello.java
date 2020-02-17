package set1;

public class hello {

    public static void main(String[] args){

        //print statement
        System.out.println("hello world");

        //setting integers
        int first_integer=0;
        System.out.println(first_integer);

        int second_integer=33;
        int third_integer=23;

        int sum_value=first_integer+second_integer+third_integer;
        System.out.println(sum_value);

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




















    }
}
