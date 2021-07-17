import java.util.Scanner;
public class Potential 
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
    int[] addPotential(String str[])
    {
        int words[] = new int[str.length];
        int index = 0;
        System.out.println("POTENTIAL         :");
        for(int i = 0;i<=str.length-1;i++)
        {
            int potent = 0;
            for(int j = 0;j<=str[i].length()-1;j++)
            {
                char ch = str[i].charAt(j);
                potent =potent+ ch-64;
                words[index]=potent;
            }
            index++;
            System.out.printf("%-15S%2S%15d\n",str[i],"=",potent);
        }
       return words;     
    }
    void ascending(int arr[],String words[])
    {
        System.out.print("OUTPUT           :");
         for(int i=0;i<=arr.length-2;i++)
        {
            for(int j = 0;j<=arr.length-2-i;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                     String tem = words[j];
                    words[j]=words[j+1];
                    words[j+1]=tem;
                    
                }
            }
        }
         for(int x = 0;x<=words.length-1;x++)
         {
             System.out.print(words[x] +" ");
         }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        // OLD
        // String str = sc.nextLine();
        // NEW
        String str = sc.nextLine().toUpperCase();
        Potential obj  = new Potential();
        System.out.println("INPUT             :"+str);
        if((str.charAt(str.length()-1))=='.'||(str.charAt(str.length()-1)==','||(str.charAt(str.length()-1))=='?'||(str.charAt(str.length()-1))=='!'))
        {
            String finalstr = "";
            for(int i = 0;i<=str.length()-2;i++)
            {
                finalstr = finalstr+str.charAt(i);
            }
            String Words[] = obj.extractWords(finalstr);
            int arrpotential[]=obj.addPotential(Words);
            obj.ascending(arrpotential, Words);
            System.out.println();
        }
        else
        {
            System.out.println("NOT APPLICABLE");
        }
    }
}

