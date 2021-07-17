import java.util.Scanner;
class DirtyString
{ 
    void bubbleSort(int arr[] , String str[])
    {
        for(int i=0;i<=arr.length-2;i++)
        {
            for(int j = 0;j<=arr.length-2-i;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    String tem = str[j];
                    str[j]=str[j+1];
                    str[j+1]=tem;
                }
            }
        }
    }
    String cleanSentence(String str)
    {
        String clean_str = "";
        for(int i = 0;i<=str.length()-1;i++)
        {
            char ch = str.charAt(i);
            if(Character.isLetter(ch)|| ch == ' ')
            {
                clean_str = clean_str + ch;
            }
            else if(!Character.isLetter(ch)|| ch != ' ')
            {
                clean_str = clean_str + " ";
            }
        }
        return clean_str;
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
     void frequnecy(String arr[])      
    {
        int freq[]=new int[arr.length];
        int same = -1;
        for(int i = 0;i<arr.length;i++)
        {
            int count = 1;
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[i].equals(arr[j]))
                {
                    count++;
                    freq[j]=same;
                }
            }
            if(freq[i]!=same)
            {
                freq[i]=count;
            }
        }
        System.out.printf("%-15S%-15S\n","WORD","FREQUENCY");
        bubbleSort(freq,arr);
        for(int i = 0;i<freq.length;i++)
        {
            if(freq[i]!=same)
            {
            System.out.printf("%-15S%-15S\n",arr[i],freq[i]);
            }
        }
        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        DirtyString obj = new DirtyString();
        System.out.println("INPUT :");
        System.out.println("Enter number of sentences :");
        int n = sc.nextInt();
        sc.nextLine();
        if ((n>4)||(n<1))
        {
            System.out.println("Invalid entry");
        }
        else
        {
        System.out.println("Enter the sentences.");
        String str = sc.nextLine();
        str = str.toUpperCase();
        str = obj.cleanSentence(str);
        System.out.println("Total number of words:" + obj.countWords(str)); 
        String arr[]=obj.extractWords(str);
         obj.frequnecy(arr);
        
               
        }
    }
}