package set2;

public class udemyPractice01 {

    public static void main(String args[]){

        printConversion(2.0);

        System.out.println("\n");
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);

        System.out.println("\n");
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));

        System.out.println("\n is leap year test:");
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1924));

        System.out.println("\n decimal comparison:");
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));

        System.out.println("\n has Equal Sum:");
        System.out.println(hasEqualSum(1,1,1));
        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(1,-1,0));

        System.out.println("\n has teen:");
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        System.out.println("\n is teen:");
        System.out.println(isTeen(9));
        System.out.println(isTeen(13));


    }

    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        } else {
            long finalValue=Math.round(kilometersPerHour/1.609);
            return finalValue;
        }
    }

    public static void printConversion(double kilometersPerHour){

        if (kilometersPerHour <0){
            System.out.println("Invalid Value");
        } else {
            long finalValue=toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour+" km/h = "+finalValue+" mi/h");
        }
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes<0){
            System.out.println("Invalid Value");
        }else {
            int mb=kiloBytes/1024;
            int kb=kiloBytes%1024;
            System.out.println(kiloBytes+" KB = "+mb+" MB and "+kb+" KB");
        }
    }

    public static boolean shouldWakeUp(boolean barking,int hourOfDay){
        if(barking && (hourOfDay<8 || hourOfDay>22) && (hourOfDay>=0 && hourOfDay<=23)){
            return true;
        } else return false;
    }

    public static boolean isLeapYear(int year){

        if (year>=1 && year<=9999){
            if((year%4)==0){
                if ((year%100)==0){
                    if ((year%400)==0){
                        return true;
                    }
                } else return true;
            }
            return false;
        }
        return false;
    }

    public static boolean areEqualByThreeDecimalPlaces(double value1, double value2){
        String[] editedValue1= Double.toString(value1).split("\\.",2);
        String[] editedValue2= Double.toString(value2).split("\\.",2);
        String last1=editedValue1[1];
        String last2=editedValue2[1];
        if (editedValue1[1].length()>3){
            last1=editedValue1[1].substring(0,3);
        }
        if (editedValue2[1].length()>3){
            last2=editedValue2[1].substring(0,3);
        }
        if ((editedValue2[0]+"."+last2).equals(editedValue1[0]+"."+last1)){
            return true;
        }
        return false;

    }

    public static boolean hasEqualSum(int val1, int val2, int val3){
        if ((val1+val2)==val3){
            return true;
        }
        return false;
    }

    public static boolean hasTeen(int val1, int val2, int val3){
        if(isTeen(val1) || isTeen(val2) || isTeen(val3)) return true;
        return false;
    }

    public static boolean isTeen(int val1){
        if(val1>=13 && val1<=19) return true;
        return false;
    }
}
