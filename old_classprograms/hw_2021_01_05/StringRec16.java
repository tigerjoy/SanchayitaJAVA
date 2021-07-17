import java.util.Scanner;
public class StringRec16 
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
    else if("aeiouAEIOU".indexOf(str.charAt(lastIndex)) != -1 )
    {
       return "*"+convert(str.substring(0,lastIndex));
    }
    //else if((int)(str.charAt(lastIndex))==32)
    else if(str.charAt(lastIndex)==' ')
    {
        return "-"+convert(str.substring(0,lastIndex));
    }
    else
    {
        return str.charAt(lastIndex)+convert(str.substring(0,lastIndex));
    
    }
   
    }
    public static void main(String[] args) 
    {
        StringRec16 obj = new StringRec16();
        System.out.println("Enter a word");
        String str = sc.nextLine();
        System.out.println("INPUT : "+str);
        String str_rev="";
        for(int i =str.length()-1 ;i>=0;i--)
        {
            str_rev = str_rev + str.charAt(i);
        }
        String fin_str = obj.convert(str_rev);
        System.out.println("OUTPUT : "+ fin_str);
    }
    }

