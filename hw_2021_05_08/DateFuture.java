import java.util.Scanner;
public class DateFuture 
{
    static Scanner sc = new Scanner(System.in);
    static String dates;
    static int dayNumber;
    static int monthNumber;
    static int year;
    void input()
    {
        System.out.println("DATES : ");
        dates = sc.nextLine();
        dayNumber = Integer.parseInt(dates.substring(0,2));
        monthNumber = Integer.parseInt(dates.substring(2,4));
        year = Integer.parseInt(dates.substring(4));
    }
    
    boolean isValidFormat(String date)
    {
      boolean isValid = true;
      if(date.length() != 10)
      {
        System.out.println("Date does not have 10 characters");
        isValid = false;
      }
      else if(!(date.charAt(2)=='/'&& date.charAt(5)=='/'))
      {
        System.out.println("Date is not properly separated by slash");
        isValid=false;
      }
      else
      {
        int count = 0;
        for(int i = 0;i<=date.length()-1;i++)
        {
          if(Character.isDigit(date.charAt(i)))
          {
            count++;
          }
        }
        if(count!=8)
        {
          System.out.println("Date does not have 8 digits.");
          isValid = false;
        }
      }
      return isValid;
    }

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
    String monthName[] = { "01", "02", "03", "04", "05", "06", "07", "08", "09",
        "10", "11", "12" };
    int month = 0;

    for (;;) {
      if (dayNumber > days[month]) {
        dayNumber -= days[month];
        month++;
      } else {
        break;
      }
    }

    String date = dayNumber + "/ " + monthName[month] + "/ " + year;
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
     DateFuture obj = new DateFuture();
    obj.input();
    if(obj.isValidFormat(dates))
    {
    System.out.println("Enter number of days after :");
    int N = sc.nextInt();
    if (1 <= dayNumber && dayNumber <= obj.totalNumberOfDays(year)) {
      if (1 <= N && N <= 100) {
       
        System.out.println("FUTURE DATE : " + obj.getFutureDate(dayNumber, N, year));
      } else {
        System.out.println("DAYS AFTER N DAYS OUT OF RANGE.");
      }
    } else {
      System.out.println("DAY NUMBER OUT OF RANGE");
    }
    }
   

  }
}


