public class NumberToWords {

    public static void getNumberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        }
        else {
            int reversenumber = reverse(number);
            int numberdigitcount = getDigitCount(number);
            int reversenumberdigitcount = getDigitCount(reversenumber);
            int reminder = 0;
            while(reversenumber > 0){
                reminder = reversenumber % 10;
                switch(reminder){
                    
                }


            number = number / 10;
        }
        }
    }

    public static int reverse(int number){

        int numbercopy = number;
        int reverse = 0;
        while(numbercopy != 0){
            int lastnum = numbercopy % 10;
            reverse = (reverse * 10) + lastnum;
            numbercopy /= 10;
        }
        return reverse;

    }
    public static int getDigitCount(int number){
        if (number == 0){
            return 1;
        }
        else if(number < 0){
            return -1;
        }
        else{
            int count = 0;
            while( number > 0){
                  number = number / 10;
                count ++;
            }
            return count;
        }


    }
}
