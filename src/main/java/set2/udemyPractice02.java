package set2;

public class udemyPractice02 {

    public static void main(String args[]){

        System.out.println(calculateFtnInchtoCm(6,0));
        System.out.println(calculateFtnInchtoCm(-1,0));



    }

    public static double calculateFtnInchtoCm(long feetval, long inchval){
        if (feetval >=0 && inchval>=0 && inchval<=12){
            double totalcm=(feetval*30.48)+inchval*2.54;
            return totalcm;
        }else return -1;
    }

    public static double calculateFtnInchtoCm(long inchval){
        if (inchval >=0){
            double totalft=inchval/12;
            return totalft;
        }else return -1;
    }
}
