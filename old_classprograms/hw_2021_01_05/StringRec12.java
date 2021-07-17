import java.util.Scanner;
public class StringRec12 
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
    else if(Character.isUpperCase(str.charAt(lastIndex)))
    {
        return (Character.toLowerCase(str.charAt(lastIndex)))+
                convert(str.substring(0,lastIndex));
    }
    else if(Character.isLowerCase(str.charAt(lastIndex)))
    {
        return (Character.toUpperCase(str.charAt(lastIndex)))+
                convert(str.substring(0,lastIndex));
    }
    else
    {
        return str.charAt(lastIndex)+convert(str.substring(0,lastIndex));
    
    }
   
    }
    public static void main(String[] args) 
    {
        StringRec12 obj = new StringRec12();
        System.out.println("Enter a word");
        String str = sc.nextLine();
        System.out.println("ORIGINAL NAME : "+str);
        String str_rev="";
        for(int i =str.length()-1 ;i>=0;i--)
        {
            str_rev = str_rev + str.charAt(i);
        }
        String fin_str = obj.convert(str_rev);
        System.out.println("NEW NAME : "+ fin_str);
    }
}
