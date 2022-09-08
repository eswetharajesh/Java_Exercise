public class Main {
    public static void main(String[] args) {


        CalculateScore(true, 800, 5, 100);
        CalculateScore(true, 10000, 8, 200);
    }

    public static int CalculateScore (boolean gameover, int score, int levelcompleted, int bonus ){


        if(gameover){
            int finalscore = (score + (levelcompleted * bonus));
            finalscore += 2000;
            System.out.println (" your Final Score is =" +finalscore);
            return finalscore;

        }
        return -1;
    }
}