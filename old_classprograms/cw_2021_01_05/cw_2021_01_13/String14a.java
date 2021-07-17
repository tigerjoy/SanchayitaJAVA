import java.util.Scanner;
class String14a
{
  static Scanner sc = new Scanner(System.in);
  String initials(String str,int i,String init)
  {
    if(i==str.length())
    {
      return init;
    }
    else
    {
      if(i==0)
      {
        init+=str.charAt(0)+". ";
      }
      else if(str.charAt(i)==' ')
      {
         init+= str.charAt(i+1)+". ";
      }
      return initials(str,i+1,init);
    }
  }
  
  public static void main(String[]args)
  {
    String14a obj = new String14a();
    System.out.println("Enter your name: ");
    String str = sc.nextLine().trim().toUpperCase();
    System.out.println("OUTPUT : "+obj.initials(str,0,""));
  }
}