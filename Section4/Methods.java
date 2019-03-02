package Section4;

public class Methods {
    public static void main(String[] args) {

        displayHighScorePosition("steve", calculateHighScorePosition(600));

    }

    private static void displayHighScorePosition(String name, int position) {

        System.out.println(name + "managed to get position " + position);

    }


    private static int calculateHighScorePosition(int Score){

        return(Score > 1000 ? 1 : Score > 500 ? 2 : Score > 100 ? 3 : 4 );

    }
}
