public class Main {

    public static void main(String[] args) {

        int HighScorePosition = calculateHighScorePosition ( 1500 );
        displayHighScorePosition ( "sweety" ,HighScorePosition );

         HighScorePosition = calculateHighScorePosition ( 900 );
        displayHighScorePosition ( "miny" ,HighScorePosition );

         HighScorePosition = calculateHighScorePosition ( 400 );
        displayHighScorePosition ( "sassy" ,HighScorePosition );

        HighScorePosition = calculateHighScorePosition ( 50 );
        displayHighScorePosition ( "jammy" ,HighScorePosition );



        HighScorePosition = calculateHighScorePosition ( 1000 );
        displayHighScorePosition ( " hobby " ,HighScorePosition );

        HighScorePosition = calculateHighScorePosition ( 500 );
        displayHighScorePosition ( " Hello how are you " ,HighScorePosition );

        HighScorePosition = calculateHighScorePosition ( 100 );
        displayHighScorePosition ( " raaju " ,HighScorePosition );
    }
    public static void displayHighScorePosition( String PlayerName , int HighScorePosition)
    {
        System.out.println ( PlayerName + " managed to get into the position " +
                HighScorePosition + " on the highscore table ");
    }
    public static int calculateHighScorePosition ( int playerScore)
    {
        if (playerScore >= 1000)
        {
            return 1;
        }
        else if ( playerScore >= 500 )
        {
            return 2;
        }
        else if ( playerScore >= 100 )
        {
            return 3;
        }
        return 4;

    }
}