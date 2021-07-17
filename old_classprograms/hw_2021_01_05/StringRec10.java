import java.util.Scanner;
public class StringRec10 
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
   
  
    public static void main(String[] args) 
    {
        StringRec10 obj = new StringRec10();
        System.out.println("Enter a word");
        String str = sc.nextLine();
        String str_rev = obj.reverse(str);
        if(str.equals(str_rev))
        {
            System.out.println(str+ " is a Palindrome word.");
        }
        else
        {
            System.out.println(str+" is not a Palindrome word");
        }
    }
}
