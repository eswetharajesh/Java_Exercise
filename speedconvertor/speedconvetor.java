public class SpeedConverter {
    public static long tomilesPerHour ( double kilometersPerHour){
        if ( kilometersPerHour < 0 ){
            return -1;
        }
        return Math.round ( kilometersPerHour / 1.609);
    }
    public static void printconversion ( double kilometersPerHour){
        if ( kilometersPerHour < 0){
            System.out.println (" Invalid value");
        }
        else
        {
            long milesPerHour = tomilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour +
                    "km/h =" + milesPerHour +
                    "mi/h =");
        }
    }
}
