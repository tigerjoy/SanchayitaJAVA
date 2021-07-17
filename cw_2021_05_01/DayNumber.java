import java.util.Scanner;
class DayNumber
{
  static Scanner sc = new Scanner(System.in);
  int day;
  int month;
  int year;
  String date;
  int days[] ={31,28,31,30,31,30,31,31,30,31,30,31};

  void input()
  {
    System.out.println("Enter a date (DD/MM/YYYY) format");
    date = sc.nextLine();
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
    if(isLeapYear())
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

  boolean isLeapYear()
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
    int total =0;
    // Add the days for all the months - 1 month
    for(int i =0;i<=month-2;i++)
    {
      total= 
      total+ days[i];
    }
    // Add the days for the last month
    total += day;
    return total;
  }

  public static void main(String[]args)
  {
    DayNumber obj = new DayNumber();
    obj.input();
    obj.extractDate();
    if(obj.isValidDate())
    {
      System.out.println("DAY NUMBER = "+ obj.calculateDayNumber()+"days");
    }
    else
    {
      System.out.println("Invalid date");
    }
  }
}