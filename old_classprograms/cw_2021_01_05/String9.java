import java.util.Scanner;
class String9
{
  static Scanner sc = new Scanner(System.in);
  
  String reverse(String str)
  {
    int size = str.length();
    int lastIndex = size-1;
    if(size==0)
    {
      return "";
    }
    else 
    {
      return str.charAt(lastIndex)+ 
      reverse(str.substring(0,lastIndex));
    }
  }
  
  public static void main(String[]args)
  {
    String9 obj = new String9();
    System.out.println("Enter a String");
    String str = sc.nextLine();
    System.out.println("ORIGINAL STRING: " + str);
    System.out.println("REVERSED STRING: " + 
         obj.reverse(str));
  }
}