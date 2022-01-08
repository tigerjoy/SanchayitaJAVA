import java.util.Scanner;
class DateDifference
{
  static Scanner sc = new Scanner(System.in);
  String date1;
  String date2;
  int d1, m1, y1;
  int d2, m2, y2;
  
  // Takes input into date1 and date2
  void input()
  {
    System.out.println("Date 1 : ");
    date1 = sc.nextLine();
    System.out.println("Date 2 :");
    date2 = sc.nextLine();
  }
  
  // Extracts the date from String to nte
  void extractDate()
  {
    String components[] = date1.split("/");
    d1 = Integer.parseInt(components[0]);
    m1 = Integer.parseInt(components[1]);
    y1 = Integer.parseInt(components[2]);
    components = date2.split("/");
    d2 = Integer.parseInt(components[0]);
    m2 = Integer.parseInt(components[1]);
    y2 = Integer.parseInt(components[2]);
  }
  
  // Checks if a date is valid
  boolean isValidDate(int day, int month, int year)
  {
    int days[] ={31,28,31,30,31,30,31,31,30,31,30,31};
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
  
  // Checks if the year is leap year
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
  
  // Checks if the year is within range 
  // (meaning greater than 1600)
  boolean isDateInRange(int year)
  {
    if(year>=1600)
    {
      return true;
    }
    else{
      return false;
    }
  }

  // Returns the total number of days for a year
  int totalNumberOfDays(int year) {
    if (isLeapYear(year)) {
      return 366;
    } else {
      return 365;
    }
  }

  // Returns the numbers of days from 1600 to given date
  int daysFromMinDate(int day, int month, int year)
  {
    // All days(1600 -> year - 1) + Day number of year
    int dayNumber = 0;
    for(int i = 1600;i<=year-1;i++)
    {
      dayNumber += totalNumberOfDays(i);
    }
    
    // Calculation of day number for current year
    int days[] ={31,28,31,30,31,30,31,31,30,31,30,31};
    // Setting the correct number of days for February
    if(isLeapYear(year))
    {
      days[1]=29;
    }
    
    for(int i = 0;i<=month-2;i++)
    {
      dayNumber+= days[i];
    }
    dayNumber+= day;
    return dayNumber;
  }
  
  public static void main(String[]args)
  {
     DateDifference obj = new DateDifference();
     obj.input();
     obj.extractDate();
     if(obj.isValidDate(obj.d1,obj.m1,obj.y1)&& 
        obj.isValidDate(obj.d2,obj.m2,obj.y2))
      {
        if(obj.isDateInRange(obj.y1)&&
          obj.isDateInRange(obj.y2))
          {
            int dayNumber1 = obj.daysFromMinDate(obj.d1, obj.m1, obj.y1);
            int dayNumber2 = obj.daysFromMinDate(obj.d2, obj.m2, obj.y2);
            int diff = Math.abs(dayNumber1-dayNumber2) + 1;
            System.out.println("DIFFERENCE : "+ diff+" DAYS.");
          }
          else
          {
            System.out.println("One of the date is earlier than 1600.");
          }
      }
      else
      {
        System.out.println("One of the date is invalid.");
      }
 }
}