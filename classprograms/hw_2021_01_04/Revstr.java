import java.util.Scanner;
public class Revstr 
{
    static Scanner sc = new Scanner(System.in);
    String Str;
    String Revst;
    Revstr()
    {
        Str="";
        Revst="";
    }
    void getStr()
    {
        System.out.println("Enter the String");
        Str = sc.nextLine();
    }
    void recReverse(int size)
   {
    int lastIndex = size-1;
    if(size==0)
    {
        System.out.println(Str);
    }
    else 
    {
        Revst = Revst+(Str.charAt(lastIndex));
        recReverse(size-1);
    }
  }
    void check()
    {
        System.out.println("ORIGINAL STRING :"+ Str);
        System.out.print("REVERSED STRING :");
        recReverse(Str.length());
        if(Str.equals(Revst))
        {
            System.out.println(Str+" is a Palindrome String");
        }
        else
        {
            System.out.println(Str+" is not a Palindrome String");
        }
    }
    public static void main(String[] args) 
    {
        Revstr  obj = new Revstr();
        obj.getStr();
        obj.check();
    }
}
