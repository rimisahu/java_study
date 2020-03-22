package set2;

public class practiceSet2a {

    public static void main(String[] args) {

        //testing methods

        //method that takes no input, and send no output. it prints.
        printSong();

        //method that takes inputs, and send no output. it prints.
        farenheightToCelcius(61);


        //method that takes inputs, and sends output
        int celciusValue=25;
        double farenheightTemprature = celciusTofarenheight(celciusValue);
        System.out.println("\nconversion of celcius ("+celciusValue+")C to farenheight: ("+farenheightTemprature+")F");
    }

    public static void printSong(){
        System.out.println("\nAnd i will always love you....");
    }

    public static void farenheightToCelcius(int farenheightTemprature){
        double celciusValue = (farenheightTemprature-32d)*(5d/9d);
        System.out.println("\nconversion of farenheight ("+farenheightTemprature+")F to celcius: ("+celciusValue+")");
    }

    public static double celciusTofarenheight(int celciusValue){
        double farenheightTemprature = (celciusValue*(9d/5d))+32d;
        return farenheightTemprature;
    }

}
