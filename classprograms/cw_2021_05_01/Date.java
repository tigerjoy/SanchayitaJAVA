import java.util.Scanner;

class Date {
  static Scanner sc = new Scanner(System.in);

  boolean isLeapYear(int year) {
    if (year % 100 == 0 && year % 400 == 0) {
      return true;
    } else if (year % 4 == 0) {
      return true;
    } else {
      return false;
    }
  }

  int totalNumberOfDays(int year) {
    if (isLeapYear(year)) {
      return 366;
    } else {
      return 365;
    }
  }

  String dateFromDay(int dayNumber, int year) {
    int days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    String monthName[] = { "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER",
        "OCTOBER", "NOVEMBER", "DECEMBER" };
    int month = 0;

    for (;;) {
      if (dayNumber > days[month]) {
        dayNumber -= days[month];
        month++;
      } else {
        break;
      }
    }

    String date = dayNumber + " TH " + monthName[month] + ", " + year;
    return date;
  }

  String getFutureDate(int dayNumber, int N, int year) {
    if (dayNumber + N > totalNumberOfDays(year)) {
      year++;
      int nextYearsDayNumber = dayNumber + N - totalNumberOfDays(year - 1);
      return dateFromDay(nextYearsDayNumber, year);
    } else {
      return dateFromDay(dayNumber + N, year);
    }
  }

  public static void main(String[] args) {
    System.out.println("DAY NUMBER:");
    int dayNumber = sc.nextInt();
    System.out.println("YEAR: ");
    int year = sc.nextInt();
    System.out.println("DAY AFTER N DAYS :");
    int N = sc.nextInt();
    Date obj = new Date();
    if (1 <= dayNumber && dayNumber <= obj.totalNumberOfDays(year)) {
      if (1 <= N && N <= 100) {
        System.out.println("DATE :" + obj.dateFromDay(dayNumber, year));
        System.out.println("DATE AFTER " + N + " DAYS: " + obj.getFutureDate(dayNumber, N, year));
      } else {
        System.out.println("DAYS AFTER N DAYS OUT OF RANGE.");
      }
    } else {
      System.out.println("DAY NUMBER OUT OF RANGE");
    }

  }
}