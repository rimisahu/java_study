package set1;

public class datatype_flt_dbl {

    public static void main(String[] args){

        int int_val=5;
        float float_val=5f;
        double double_val=5d;
        System.out.println("int val: "+int_val);
        System.out.println("float val: "+float_val);
        System.out.println("double val: "+double_val);

        System.out.println("");
        System.out.println("int divided by 2: "+int_val/2);
        System.out.println("float divided by 2: "+float_val/2f);
        System.out.println("double divided by 2: "+double_val/2d);

        System.out.println("");
        System.out.println("int divided by 3: "+int_val/3);  //1
        System.out.println("float divided by 3: "+float_val/3f); //1.6666666
        System.out.println("double divided by 3: "+double_val/3d); //1.6666666666666667


        //calculation lb to kg
        System.out.println("\n calculation lb to kg");
        double lbs_value=185.00;
        double kg_value=0.45359237*lbs_value;
        System.out.println(kg_value);



    }
}
