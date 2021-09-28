public class NextDayCalculator {

    public static final String CONCATENATION = "/";
    public static final int lastDayOfYear = 31;
    public static final int lastMonthOfYear = 12;
    public static final int StartMonthOfYear = 1;

    public static String getNextDay(int day, int month, int year) {
        int lastOfMonth = getLastOfMonth(month);
        int startOfMonth = 1;
        if (day == lastOfMonth && month != lastMonthOfYear) {
            day = startOfMonth;
            month++;
        } else if (day == lastDayOfYear && month == lastMonthOfYear) {
            day = startOfMonth;
            month = StartMonthOfYear;
            year++;
        }
        else {
            day++;
        }
        return day + CONCATENATION + month + CONCATENATION + year;
    }

    private static int getLastOfMonth(int month) {
        int lastOfMonth = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                lastOfMonth=31;
                break;
            case 2:
            case 4:
            case 6:
            case 9:
            case 11:
                lastOfMonth=30;
                break;




        }
        return lastOfMonth;
    }
}
