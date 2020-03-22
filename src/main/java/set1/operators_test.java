package set1;

public class operators_test {

    public static void main(String[] args){

        /*
        list of java operators:
            Unary Operator,
            Arithmetic Operator,
            Shift Operator,
            Relational Operator,
            Bitwise Operator,
            Logical Operator,
            Ternary Operator and.
            Assignment Operator.

         */

        int test_value=10;
        System.out.println("addition: " + (test_value += 2));
        System.out.println("subtraction: "+ (test_value -= 2));
        System.out.println("multiplication: "+ (test_value *= 2));


        //------------------------------

        //operator precedence
        //ternary operator

        //(5==5) --> check if the condition is true
        //true --> if condition ^ is true, then choose this
        //false --> if condition ^ is false, then choose false
        boolean result= (5==5) ? true : false;
        System.out.println("\nternary operator result: "+result);



    }
}
