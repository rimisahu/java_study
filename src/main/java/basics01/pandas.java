package basics01;


//testing class, constuctor and initializers

public class pandas {

    int numbercubs;
    String babyname="cutie";
    String secondBabyName="pawws";
    {System.out.println("initialized value: "+secondBabyName);}

    public pandas(){
        secondBabyName="fluffy ears";
        {System.out.println("constructor value: "+secondBabyName);}
    }


    public static void main(String args[]){
        pandas mommy = new pandas();
        mommy.numbercubs=3;


        System.out.println(mommy.numbercubs);
        System.out.println(mommy.babyname);
        System.out.println(mommy.secondBabyName);
    }
}
