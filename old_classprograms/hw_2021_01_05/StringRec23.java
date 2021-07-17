import java.util.Scanner;
public class StringRec23
{
    static Scanner sc = new Scanner(System.in);
    String convert(String str)
    {
    int size = str.length();
    int lastIndex = size-1;
    if(size==0)
    {
      return "";
    }
    else if(Character.isLetter(str.charAt(lastIndex)))
    {
       return (int)(str.charAt(lastIndex))+convert(str.substring(0,lastIndex));
    }
    else
    {
        return str.charAt(lastIndex)+convert(str.substring(0,lastIndex));
    }
    }
    public static void main(String[] args)
    {
        System.out.println("Enter a String");
        String str = sc.nextLine();
        StringRec23 obj = new StringRec23();
        String str_final="";
        for(int i = str.length()-1;i>=0;i--)
        {
            str_final = str_final+str.charAt(i);
        }
        String fin = obj.convert(str_final); 
        System.out.println("OUTPUT : "+fin);
       
    }
}
