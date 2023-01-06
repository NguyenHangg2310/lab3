

public class DateUtil {
    public static String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static String[] strDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public static int[] daysInMoths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static int[] nonLeapYearMonthNumbers = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
    public static int[] leapYearMonthNumbers = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

    public static void main(String[] args) {
        System.out.println(isLeapYears(2012));
        //System.out.println(isValidDate(2022, 2, 29));
        //getDayOfWeek(2022, 2, 29);
        System.out.println(getDayOfWeek(2012, 2, 17));
        printDayOfWeek(getDayOfWeek(2012, 2, 17));
        System.out.println(toString(2012, 2, 14));
    }

    public static boolean isLeapYears(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year >= 1 && year <= 9999) {
            if (month >= 1 && month <= 12) {
                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                    if (day >= 1 && day <= 31) {
                        return true;
                    }
                } else if (month == 4 || month == 4 || month == 6 || month == 9 || month == 11) {
                    if (day >= 1 && day <= 30) {
                        return true;
                    }
                } else if (month == 2) {
                    if (isLeapYears(year)) {
                        if (day >= 1 && day <= 29) {
                            return true;
                        }
                    } else {
                        if (day >= 1 && day <= 28) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        int firstTwoDigitsOfYear = 6 - 2 * ((year / 100) % 4);
        int lastTwoDigitsOfYear = year % 100;
        int magicYearNumber = lastTwoDigitsOfYear / 4;
        int magicMonthNumber = isLeapYears(year) ? leapYearMonthNumbers[month - 1] : nonLeapYearMonthNumbers[month - 1];
        int magicSum = (firstTwoDigitsOfYear + lastTwoDigitsOfYear + magicYearNumber + magicMonthNumber + day) % 7;
        return magicSum;
    }

    public static void printDayOfWeek(int magicSum) {
        switch (magicSum) {
            case 0:
                System.out.println("0:Sun");
                break;
            case 1:
                System.out.println("1:Mon");
                break;
            case 2:
                System.out.println("2:Tues");
                break;
            case 3:
                System.out.println("3:Wednes");
                break;
            case 4:
                System.out.println("4:Thus");
                break;
            case 5:
                System.out.println("5:Fri");
                break;
            case 6:
                System.out.println("6:Satur");
                break;
        }
    }

    public static String toString(int year, int month, int day) {
        if (!(isValidDate(year, month, day))) {
            return "Not a valid date!";
        }
        int d = getDayOfWeek(year, month, day);
        return strDays[d] + " " + day + " " + strMonths[month - 1] + " " + year;
    }
}
