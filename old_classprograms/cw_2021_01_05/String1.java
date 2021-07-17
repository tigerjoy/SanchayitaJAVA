import java.util.Scanner;
class String1
{
  static Scanner sc = new Scanner(System.in);
  void display(String str, int i)
  {
    if(i==str.length()) {}
    else
    {
      System.out.print(str.charAt(i)+" ,");
      display(str,i+1);
    }
  }

  void display(String str)
  {
    int size = str.length();
    int lastIndex = size - 1;
    if(size == 0) {}
    else{
      display(str.substring(0, lastIndex));
      System.out.print(str.charAt(lastIndex) + ", ");
    }
  }

  public static void main(String[]args)
  {
    String1 obj = new String1();
    System.out.println("Enter a String");
    String str = sc.nextLine();
    obj.display(str,0);
  }
}