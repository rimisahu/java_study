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

        int max_int=Integer.MAX_VALUE;      //2,147,483,647
        int min_int=Integer.MIN_VALUE;      //-2,147,483,648
        System.out.println(max_int);
        System.out.println(min_int);


        System.out.println("overflow of max int: "+ (max_int+1));
        System.out.println("overflow of min int: "+ (min_int-1));





    }
}
