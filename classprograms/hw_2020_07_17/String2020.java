import java.util.Scanner;
public class String2020 
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
    
    void sSort(String arr[])
    {
        for(int i = 0;i<= arr.length-2;i++)
        {
           for(int j = 0;j<=arr.length-2-i;j++)
           {
               if(arr[j].length()>arr[j+1].length())
               {
                   String temp = arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
               else if(arr[j].length()==arr[j+1].length())
               {
                   char c1= arr[j].charAt(0);
                   char c2= arr[j+1].charAt(0);
                   if(c1>c2)
                   {
                   String temp = arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                   }
                   
                   else
                   {
                           
                   }
               }
               else
               {
                   
               }
           }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String2020 obj = new String2020();
        System.out.print("INPUT:");
        String str = sc.nextLine().trim();
        str= str.toUpperCase();
        char last = str.charAt(str.length()-1);
        if(last=='.'||last == '?'||last == '!')
        {
            String Str = "";
            for(int i = 0;i<str.length()-1;i++)
            {
                Str = Str + str.charAt(i);
            }
            String words[]= obj.extractWords(str);
          obj.sSort(words);
            System.out.print("OUTPUT:");
            System.out.println(str);
          for(int i = 0;i<words.length;i++)
          {
              System.out.print(words[i] +" ");
          }
        }
        else
        {
            System.out.println("INVALID INPUT.");
        }
        
    }
}

        
