import java.util.Scanner;
class String2
{
  static Scanner sc = new Scanner(System.in);
  void display(String str, int size)
  {
    if(size==0) {}
    else
    {
      System.out.print(str.charAt(size-1)+" ,");
      display(str,size-1);
    }
  }

  void display(String str)
  {
    int size = str.length();
    int lastIndex = size - 1;
    if(size == 0) {}
    else{
      System.out.print(str.charAt(lastIndex) + ", ");
      display(str.substring(0, lastIndex));
    }
  }
  
  public static void main(String[]args)
  {
    String2 obj = new String2();
    System.out.println("Enter a String");
    String str = sc.nextLine();
    //obj.display(str,str.length());
    obj.display(str);
  }
}