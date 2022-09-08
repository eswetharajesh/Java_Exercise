public class Main {
    public static void main(String[] args) {
        boolean gameover = true ;
        int score = 800;
        int levelcompleted = 5;
        int bonus = 100;


        if (gameover == true){
            int finalscore = (score + ( levelcompleted * bonus));
            System.out.println (" your final score is =" + finalscore);

        }
        boolean newgameover = true;
        int newscore = 10000;
        int newlevelcompleted = 8;
        int newbonus = 200;

        if (newgameover == true){
            int finalscore = (newscore + ( newlevelcompleted * newbonus));
            System.out.println (" your final score is =" + finalscore);

        }

    }
}