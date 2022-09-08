public class DecimalComparator{
    public static boolean areEqualByThreeDecimalplaces ( double A , double B)
    {
        if ( A <0 && B >0 || A >0 && B <0) {
            return false;
        }
        double result1 = ( A * 1000);
        int res1 = (int) result1;

        double result2 = ( B * 1000);
        int res2 = (int)result2  ;


        if ( res1 == res2)
        {
            return true ;
        }
        else
        {
            return false ;
        }
    }
}
