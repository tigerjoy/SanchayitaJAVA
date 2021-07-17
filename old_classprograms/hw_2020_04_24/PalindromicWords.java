import java.util.Scanner;
public class PalindromicWords 
{
        int countWords(String str)
    {
        str = str.trim();
        int ctr = 0;
        for(int i = 0;i<=str.length()-1;i++)
        {
            if(str.charAt(i)==' ')
            {
                ctr++;
            }
        }
        return ctr+1;
    }
    String[] extractWords(String str)
    {
       str = str.trim()+" ";
       int space_index = -1;
       int start_index = 0;
       int length = str.length();
       int index = 0;
       int num_words = countWords(str);
       String Words[] = new String[num_words];
       for(int i = 0;i<=str.length()-1;i++)
       {
          char ch = str.charAt(i);
          if(ch==' ')
             {
                space_index = i;
                String word = str.substring(start_index,space_index);
                start_index = space_index +1;
                Words[index] = word;
                index++;
             }
         }
         return Words;
       }
    boolean checkPalindrome(String str)
    {
        if(str.charAt(0)==str.charAt(str.length()-1))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) 
    {
        PalindromicWords obj = new PalindromicWords();
        Scanner sc = new Scanner(System.in);
        String result = "";
        System.out.print("INPUT :  ");
        String str = sc.nextLine();
        // Extract the last character
        char last_char = str.charAt(str.length()-1);
        // Check if the last character is . or ? or !
        // if(last_char=='?'||last_char=='.'||last_char=='!')
        if(".?!".indexOf(last_char) != -1)
        {
          str = str.toUpperCase();
          // Extract the string without the last character
          str = str.substring(0,str.length()-1);
          String words[] = obj.extractWords(str);
          int count = 0;
          System.out.print("OUTPUT : ");
          for(int i = 0;i<=words.length-1;i++)
          {
              if(obj.checkPalindrome(words[i]))
              {
                  count++;
                  System.out.print(words[i] +" ");
              }
          }
          System.out.println("");
          if(count!=0)
          {
          System.out.print("NUMBER OF PALINDROMIC WORDS : "+count);
          }
          else
          {
              System.out.print("NO PALINDROMIC WORDS.");
          }
        }
        else
        {
           System.out.println("INVALID INPUT");
        }
    }
}
