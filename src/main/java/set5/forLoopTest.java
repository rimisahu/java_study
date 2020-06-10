package set5;

public class forLoopTest {

    public static void main(String args[]){

        int counter=0;
        int sum=0;

        for (int i=1; i<=1000; i++){
            if ((i%3==0)&&(i%5==0)){
                sum=sum+i;
                counter=counter+1;
                System.out.println("numero found: " +i);
            }
            if(counter==5){
                break;
            }
        }

        System.out.println("Aaaand the final sum is ... " + sum);
    }
}
