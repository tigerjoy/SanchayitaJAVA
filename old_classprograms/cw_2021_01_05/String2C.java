import java.util.Scanner;
class String2C
{
  static Scanner sc = new Scanner(System.in);
  int countChar(String str, char ch)
  {
    int size = str.length();
    int lastIndex = size - 1;
    if(size==0)
    {
      return 0;
    }
    else if(str.charAt(lastIndex)==ch)
    {
      return 1+ countChar(str.substring(0,lastIndex),ch);
    }
    else
    {
      return countChar(str.substring(0,lastIndex),ch);
    }
  }
  
  public static void main(String[]args)
  {
    String2C obj = new String2C();
    System.out.println("Enter a String");
    String str = sc.nextLine();
    System.out.println("Enter a character");
    char ch = sc.nextLine().charAt(0);
    int freq = obj.countChar(str,ch);
    // B has occurrs 5 time(s)
    System.out.println(ch+" occurs "+ freq+" times.");
  }
}