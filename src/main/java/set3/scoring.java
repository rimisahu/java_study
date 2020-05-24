package set3;

public class scoring {

    public static void main(String[] args){
        int playerScore=calculatescoring("elon", 8);
        System.out.println("new score: "+playerScore);

        //use second overloaded method
        int playerScore2=calculatescoring(3);
        System.out.println("second result is "+playerScore2);

    }

    public static int calculatescoring(String player, int score){
        System.out.println("player "+player+" score is: "+score);
        return score*10;
    }

    public static int calculatescoring(int score){
        System.out.println("score is: "+score);
        return score*10;
    }


}
