import java.util.Scanner;
class DayName
{
  static Scanner sc = new Scanner(System.in);
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

  int calcTotalDays(int date,int month, int year)
  {
    //           0  1   2  3  4  5  6  7  8 9  10 11
    int days[] ={31,28,31,30,31,30,31,31,30,31,30,31};
    if(isLeapYear(year))
    {
      days[1]=29;
    }
    int totalNoDays=0;
    for(int i = 0;i<month-1;i++)
    {
      totalNoDays+=days[i];
    }
    totalNoDays+=date;
    return totalNoDays;
  }
  int dayNameToNumber(String day)
  {
    day = day.trim().toUpperCase();
    switch(day)
    {
      case "MONDAY": return 0;
      case "TUESDAY": return 1;
      case "WEDNESDAY": return 2; 
      case "THURSDAY": return 3;
      case "FRIDAY": return 4;
      case "SATURDAY": return 5;
      case "SUNDAY": return 6;
      default:       return -1;
    }
  }
  public static void main(String[]args)
  {
    DayName obj = new DayName();
    System.out.println("Enter the date");
    int date = sc.nextInt();
    System.out.println("Enter the month");
    int month = sc.nextInt();
    System.out.println("Enter the year");
    int year = sc.nextInt();
    System.out.println("Enter the day on 1 st January");
    sc.nextLine();
    String dayName = sc.nextLine();

    int totalDays = obj.calcTotalDays(date,month,year);
    int dayOfWeek = obj.dayNameToNumber(dayName);
    int newDayOfWeek = ((totalDays+(dayOfWeek-1))%7);
    String dayOfWeekName[] = {"MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY" };
    // Day on 05/07/2001:THURSDAY
    System.out.printf("Day on %02d/%02d/%d:%s\n",date,month,year,dayOfWeekName[newDayOfWeek]);
  }
}