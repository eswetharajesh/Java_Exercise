public class Main {
    public static void main(String[] args) {
        boolean year = NumberOfDaysInMonth.isLeapYear(2020);
        int days = NumberOfDaysInMonth.getDaysInMonth(12 ,10000);
        System.out.println(days);
    }
}