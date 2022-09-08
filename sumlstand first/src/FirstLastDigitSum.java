public class FirstLastDigitSum {
    public static int sumFirstAndLastdigit(int number)
    {
        int last = 0;
        if(number >= 0){
            last = number % 10;
            while(number > 9){
                number = number /10;
            }
            int sum = last + number;
            return sum;
        }
        else{
            return -1;
        }
    }
}
