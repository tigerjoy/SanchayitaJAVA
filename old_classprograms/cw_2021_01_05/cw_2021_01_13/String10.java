import java.util.Scanner;
class String10
{
  static Scanner sc = new Scanner(System.in);
  
  boolean isPalin(String str,int i,int lIndex)
  {
    if(i==lIndex)
    {
      return true;
    }
    else if(str.charAt(i)!=str.charAt(lIndex))
    {
      return false;
    }
    else
    {
      return isPalin(str,i+1,lIndex-1);
    }
  }
  public static void main(String[]args)
  {
    String10 obj = new String10();
    System.out.println("INPUT : ");
    String str = sc.nextLine();
    System.out.println("OUTPUT : ");
    if(obj.isPalin(str,0,str.length()-1))
    {
      System.out.println(str+ " is a Palindrome");
    }
    else
    {
      System.out.println(str+ " is not a Palindrome");
    }
  }
}