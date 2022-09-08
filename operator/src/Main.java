public class Main {
    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println(" 1 + 2 =" + result);
        int PreviousResult = result;
        System.out.println("PreviousResult= " + result);
        result = result - 1;
        System.out.println(" 3 - 1 =" + result);
        System.out.println("PreviousResult= " + result);
        result = result * 10;
        System.out.println(" 2 * 10 =" + result);
        result = result / 5;
        System.out.println(" 20 / 5 =" + result);
        result = result % 3;
        System.out.println(" 4 % 3 =" + result);
        result += 1;
        System.out.println(" 1+1 =" + result);

        boolean isAlien = false;
        if (isAlien == false) {

            System.out.println(" it is not an alien");
            System.out.println("And I am afraid of alien");


        }
        double myFirstvalue = 20.00d;
        double mySecondvalue = 80.00d;
        double myTotalvalue = (myFirstvalue + mySecondvalue) * 100.00d;
        System.out.println("My Total Value =" + myTotalvalue);
        double theReminder = myTotalvalue % 40.00d;
        System.out.println("The Reminder =" + theReminder);
        boolean isNoReminder = (theReminder == 0) ? true : false;
        System.out.println("Is No Reminder=" + isNoReminder);
        if (!isNoReminder){
            System.out.println (" got some reminder");
        }


    }
}