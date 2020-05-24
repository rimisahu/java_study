package set3;

public class test1 {

    public static void main(String[] args){

        System.out.println(calcFeetInchesToCM(6,-13));
        System.out.println(calcFeetInchesToCM(100));

        System.out.println(getDurStr(90));
        System.out.println(getDurStr(61,0));

    }

    public static double calcFeetInchesToCM(double feetVal, double inchVal){
        if (feetVal>=0 && inchVal>=0 && inchVal<=12){
            double cmCalculation=(feetVal*30.48)+(inchVal*2.54);
            return cmCalculation;
        }else return -1;
    }


    public static double calcFeetInchesToCM(double inchVal){
        if (inchVal>=0){
            double feets=inchVal/12;
            double cms=inchVal%12;
            System.out.println("feet: "+feets+" ;inch: "+cms);
            double fullVal=calcFeetInchesToCM(feets,cms);
            return fullVal;
        }else return -1;
    }

    public static String getDurStr( int minuteVal, int secondVal){
        if (minuteVal<0 || secondVal<0 || secondVal>59){
            return "Invalid value";
        }
        int totalSec=minuteVal*60 + secondVal;
        int totalhours=totalSec/3600;
        int leftSecs=totalSec-(totalhours*3600);
        int totalMins=leftSecs/60;
        int totalSecleft=(leftSecs-(totalMins*60));
        return totalhours+"h "+totalMins+"m "+totalSecleft+"s";
    }

    public static String getDurStr(int secondVal){
        int totalMins=secondVal/60;
        int leftSecs=secondVal%60;
        return getDurStr(totalMins,leftSecs);
    }



}
