import java.util.Scanner;
class DateValidate
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

  public static void main(String[]args)
  {
    DateValidate obj = new DateValidate();
    obj.input();
    if(obj.isValidFormat()==true)
    {
      obj.extractDate();
      if(obj.isValidDate())
      {
        System.out.println("Valid date");
      }
      else
      {
        System.out.println("Invalid date");
      }
    }
    else
    {
      System.out.println("Invalid date");
    }
  }
}