import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
 * -Before the user enters the number, print the message gEnter number:h
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
 *
 * Hint:
 * -Use an endless while loop.
 *
 * Bonus:
 * -Create a project with the name MinAndMaxInputChallenge.
 */




public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
       // int min = 0;
        //int max = 0;
        //boolean first = true;
        while (true){
            System.out.println("Enter the number:");
            boolean isAnInt = sc.hasNextInt();
            if(isAnInt) {
                int number = sc.nextInt();
                //if (first) {
                  //  first = false;
                    //min = number;
                    //max = number;
                //}
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            }else{
                break;
            }
            sc.nextLine();
        }
        System.out.println("min= " + min + ", max= " + max);
        sc.close();
    }
}