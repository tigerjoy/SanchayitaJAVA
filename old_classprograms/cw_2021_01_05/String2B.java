import java.util.Scanner;
class String2B
{
  static Scanner sc = new Scanner(System.in);
  void display(String str, int i)
  {
    if(i==str.length()) {}
    else if (i%2==1)
    {
      System.out.print(str.charAt(i)+" ,");
      display(str,i+1);
    }
    else 
    {
      display(str,i+1);
    }
  }
  public static void main(String[]args)
  {
    String2B obj = new String2B();
    System.out.println("Enter a String");
    String str = sc.nextLine();
    obj.display(str,0);
  }
}