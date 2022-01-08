import java.util.Scanner;
class DayOfWeek
{
  static Scanner sc = new Scanner(System.in);
  // 01/01/1753 fell on Monday (0)
  boolean isLeapYear(int year)
  {
    if((year%100==0&&year%400==0) || (year%4==0&& year%100!=0))
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  
  // Calculates the day number in the year
  int calcDayNumberInYear(int d,int m,int y)
  {
    int daysInMonth[]={31,28,31,30,31,30,31,31,30,31,30,31};
    if(isLeapYear(y))
    {
      daysInMonth[1]=29;
    }
    int total =0;
    // Janauray is present at index 0
    for(int i=0;i<m-1;i++)
    {
      total+=daysInMonth[i];
    }
    total+=d;
    return total;
  }

  int totalDaysInYear(int year)
  {
    if(isLeapYear(year))
      return 366;
    else
      return 365;
  }
  
  // Calculates the total number of days from
  // 01/01/1753
  int calcTotalDayNumber(int d, int m, int y)
  {
    int total=0;
    for(int i=1753;i<=y-1;i++)
    {
      total+=totalDaysInYear(y);
    }
    total+=calcDayNumberInYear(d,m,y);
    return total;
  }

  void displayDayOfWeek(int d, int m, int y)
  {
    // MON - 0, TUE - 1, WED - 2, ...
    // 01/01/1753 falls on a MON (0)

    int dayNumber = ((calcTotalDayNumber(d,m,y)+0-1)%7);

    switch(dayNumber)
    {
      case 0:
      {
        System.out.println("MONDAY");
        break;
      }
      case 1:
      {
        System.out.println("TUESDAY");
        break;
      }
      case 2;
      {
        System.out.println("WEDNESDAY");
        break;
      }
      case 3:
      {
        System.out.println("MONDAY");
        break;
      }
      
    }
  }
  
  public static void main(String []args)
  {

  }
}