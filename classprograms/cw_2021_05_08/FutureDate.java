import java.util.Scanner;
class FutureDate
{
  static Scanner sc = new Scanner(System.in);
  String date;
  int day;
  int month;
  int year;
  int N;  // Instance variable
  int days[] ={31,28,31,30,31,30,31,31,30,31,30,31};

  void input()
  {
    System.out.println("Enter a date (DD/MM/YYYY) format");
    date = sc.nextLine();
    System.out.println("Enter the number of days after");
    N = sc.nextInt();
  }

  boolean isValidFormat()
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

  void extractDate()
  {
    String components[] = date.split("/");
    day = Integer.parseInt(components[0]);
    month = Integer.parseInt(components[1]);
    year = Integer.parseInt(components[2]);
  }

  boolean isValidDate()
  {
    // Setting the correct number of days for February
    if(isLeapYear(year))
    {
      days[1]=29;
    }
    // Checking if day is valid or not
    if(day<=days[month-1])
    {
      return true;
    }
    else
    {
      return false;
    }
    
  }

  boolean isLeapYear(int year)
  {
    if(year%100==0&&year%400==0)
    {
      return true;
    }
    else if(year%4==0)
    {
      return true;
    }
    else 
    {
      return false;
    }
  }

  int calculateDayNumber()
  {
    int total = 0;
    // Add the days for all the months - 1 month
    for(int i =0;i<=month-2;i++)
    {
      total = total+ days[i];
    }
    // Add the days for the last month
    total += day;
    return total;
  }
  
  String dateFromDay(int dayNumber, int year) {
    int days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    int month = 0;

    for (;;) {
      if (dayNumber > days[month]) {
        dayNumber -= days[month];
        month++;
      } else {
        break;
      }
    }
    //System.out.prinf()
    // DD/MM/YYYY
    // %02d/%02d/%d
    

    String date = String.format("%02d/%02d/%02d", dayNumber, month+1, year);
    return date;
  }

  String getFutureDate(int dayNumber, int N, int year) {
    dayNumber+=N;
    for(;;)
    {
      int days = totalNumberOfDays(year);
      if(days>dayNumber)
      {
        break;
      }
      else
      {
        dayNumber-=days;
        year++;
      }
    }
    return dateFromDay(dayNumber, year);
  }

  int totalNumberOfDays(int year) {
    if (isLeapYear(year)) {
      return 366;
    } else {
      return 365;
    }
  }

  public static void main(String[]args)
  {
    FutureDate obj = new FutureDate();
    obj.input();
    obj.extractDate();
    if(obj.isValidFormat())
    {
      if(obj.isValidDate())
      {
        int currentDayNumber = obj.calculateDayNumber();
        System.out.println("Current Day Number: " + currentDayNumber);
        String newDate = obj.getFutureDate(currentDayNumber, obj.N, obj.year);
        System.out.println("Entered Date: " + obj.date);
        System.out.println("Future Date: " + newDate);
      }
      else
      {
        System.out.println("Invalid date.");
      }
    }
    else
    {
      System.out.println("Invalid date format.");
    }
  }
}