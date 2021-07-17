import java.util.Scanner;
public class String4a 
{ 
    static Scanner sc= new Scanner(System.in);
    void displayVowel(String str)
   {
    int size = str.length();
    int lastIndex= size-1;
    if(size==0)
    {
     
    }
    // Checking if the last character is a vowel
    else if("aeiouAEIOU".indexOf(str.charAt(lastIndex)) != -1 )
    {
       System.out.print(str.charAt(lastIndex));
       displayVowel(str.substring(0,lastIndex));
    }
    else
    {
      displayVowel(str.substring(0,lastIndex));
    }
  }
    void displayConsonant(String str)
  {
    int size = str.length();
    int lastIndex= size-1;
    if(size==0)
    {
      
    }
    // Last character must be a letter and not a vowel
    else if(("aeiouAEIOU".indexOf(str.charAt(lastIndex)) == -1 )
            &&(Character.isLetter(str.charAt(lastIndex))))
    {
        System.out.print(str.charAt(lastIndex));
       displayConsonant(str.substring(0,lastIndex));
    }
    else
    {
      displayConsonant(str.substring(0,lastIndex));
    }
  }
    public static void main(String[] args)
    {
        String4a obj = new String4a();
        System.out.println("Enter a word");
        String str = sc.nextLine();
        String str_rev="";
        for(int i = str.length()-1;i>=0;i--)
        {
            str_rev = str_rev + str.charAt(i);
        }
        System.out.print("VOWEL WORD:");
        obj.displayVowel(str_rev);
        System.out.print("    CONSONANAT WORD:");
        obj.displayConsonant(str_rev);
    }
    
    
}
