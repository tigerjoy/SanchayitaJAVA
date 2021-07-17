import java.util.Scanner;
class String2012
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
               if(arr[j].compareTo(arr[j+1])>0)
               {
                   String temp = arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
           }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String2012 obj = new String2012();
        System.out.println("INPUT:");
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
            String words[]= obj.extractWords(Str);
             obj.sSort(words);
            System.out.println("OUTPUT:");
            System.out.println("LENGTH : "+words.length);
            System.out.println("REARRANGED SENTENCE ");
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