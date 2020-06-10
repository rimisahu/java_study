package set5;

public class testSwitch {

    public static void main(String args[]){
        int switchNumber=2;

        switch (switchNumber){
            case 1:
                System.out.println("value is 1");
                break;

            case 2:
                System.out.println("value is 2");
                break;

            case 3: case 4: case 5:
                System.out.println("either 3, 4 or 5");
                break;

            default:
                System.out.println("none of the values checked");
                break;  //last switch doesnt need break. good practice to add it

        }

        //second test
        System.out.println("\n second testing ... ");
        char secondSwitch='A';
        switch (secondSwitch){
            case 'A':
                System.out.println("found: A");
                break;
            case 'B':
                System.out.println("found: B");
                break;
            case 'C':
                System.out.println("found: C");
                break;
            case 'D':
                System.out.println("found: D");
                break;
            case 'E':
                System.out.println("found: E");
                break;
            default:
                System.out.println("found nothing");

        }
    }
}
