import java.util.Scanner;
public class CountAlpha
{
    int vowelCount(String str)
    {
        
        int count = 0;
        for(int i = 0;i<=str.length()-1;i++)
        {
            char ch = str.charAt(i);
            if(ch == 'A'||ch=='E'||ch == 'U'||ch=='I'||ch=='O'||ch == 'a'||ch=='e'||ch == 'i'||ch=='o'||ch=='u')
            {
              count++;
            }
            
        }
        return count;
    }
    int countConsonants(String str)
    {
        int count = str.length()-vowelCount(str);
        return count;
    }
                
    
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
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a sentence");
        String str = sc.nextLine();
        str = " " + str;
        String str1 = "";
        // Capitalizing the first letter of each word
        for(int i = 1;i<=str.length()-1;i++)
        {
            char ch = str.charAt(i);
            if(str.charAt(i-1)==' ')
            {
                str1 = str1 + Character.toUpperCase(ch);
            }
            else
            {
                str1 =  str1 + Character.toLowerCase(ch);
            }
        }
        CountAlpha obj  = new CountAlpha();
        int length = str1.length();
        char last_ch = str1.charAt(length - 1);
        // if((str1.charAt(str1.length()-1))=='.'||(str1.charAt(str1.length()-1)=='?'))
        if(last_ch == '.' || last_ch == '?')
        {
            // String finalstr = "";
            // for(int i = 0;i<=str1.length()-2;i++)
            // {
            //     finalstr = finalstr+str1.charAt(i);
            // }
            String finalstr = str1.substring(0, str1.length()-1);
        
            
            String Words[] = obj.extractWords(finalstr);
            
            System.out.printf("%-20S %-20S %-20S\n","Words","Vowels","Consonants");
            for(int i = 0;i<=Words.length-1;i++)
            {
                System.out.printf("%-20S %-22S %-22S\n",Words[i],obj.vowelCount(Words[i]),obj.countConsonants(Words[i]));
            }
                    
        }
        else
        {
            System.out.println("INVALID INPUT");
        }
    }
}
