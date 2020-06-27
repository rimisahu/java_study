package set5;

import java.util.Scanner;

public class readUserValue {

    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many scoops of ice cream would you like?");

        //to check if the correct value has been entered.
        //for example, if int is expected, but string is entered,
        // this will check validity of it instead of crashing directly
        boolean nextIntCheckStatus=scanner.hasNextInt();

        if (nextIntCheckStatus){
            int scoopNum = scanner.nextInt();
            scanner.nextLine(); //since next int doesnt process next line properly

            System.out.println("Enter your favorite ice cream flavor");
            String flavor = scanner.nextLine();

            System.out.println("Flavor you would like is "+flavor+". You would like "+scoopNum+" scoops of it");
            scanner.close();

        } else {
            System.out.println("invalid value entered, please re-try");
        }

    }
}
