package basics01;

public class testmethod01 {
    public static void main(String args[]){

        //add following in the 'program arguments' section:
        //panda paw paww
        //alternatively pass this wile calling the class:
        //  javac testmethod01.java
        //  java testmethod01 panda paw paww

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);

        //testing error
        //System.out.println(args[3]);

        //error output
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        //	at basics01.testmethod01.main(testmethod01.java:15)
    }
}
