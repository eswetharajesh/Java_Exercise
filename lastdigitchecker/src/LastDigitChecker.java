public class LastDigitChecker {
    public static boolean hasSameLastDigit(int X, int Y, int Z){
        if ((X >= 10 && X <= 1000) && (Y >= 10 && Y <= 1000) && (Z >= 10 && Z <= 1000)){
            int Xlast = X % 10;
            int Ylast = Y % 10;
            int Zlast = Z % 10;
            if((Xlast == Ylast) || (Xlast == Zlast) || (Ylast == Zlast)){
                return true;
            }
        }
        return false;
    }
    public static boolean isValid ( int A){
        if (A >= 10 &&  A <= 1000 ){
            return true;
        }
        return false;
    }
}
