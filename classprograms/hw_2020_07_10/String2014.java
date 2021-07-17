import java.util.Scanner;
public class String2014 
{
    String cleanWords(String str)
    {
      // Removing the leading and trailing spaces
      str = str.trim();
      // Adding a space to extract the last word
      str = str + " ";
      int start = 0;
      int length = str.length();
      String output = "";
      for(int i = 0; i < length; i++)
      {
        char ch = str.charAt(i);
        if(ch == ' ') // A space
        {
          int space_index = i;
          String word = str.substring(start, space_index);
          output = output + word + " ";
          for(int j = space_index + 1; j < length; j++){
            if(str.charAt(j) != ' '){
              start = j;
              i = j;
              break;
            }
          }
        }
      }
      return output.trim();
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

  // Create a word array from a 
  // string containing words seperated by multiple spaces
  String[] extractWords(String str)
  {
    str = cleanWords(str) + " ";
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

  void delete(int index, String str, String toBeDeleted)
  {
      int f_index= index-1;
      String sentence[] = extractWords(str);
      String f_sentence= "";
      // for(int i = 0;i<=sentence.length;i++ )
      for(int i = 0;i<sentence.length;i++ )
      {
          if(f_index != i)
          {
              f_sentence = f_sentence +  sentence[i]+" ";
          }
          else
          {
              // If the word to be deleted does not match
              // with the current word present at f_index
              // then do not delete the word
              if(!toBeDeleted.equals(sentence[i]))
              {
                f_sentence = f_sentence +  sentence[i]+" ";
              }
          }
      }
      System.out.print("OUTPUT : ");
      System.out.println(f_sentence);
  }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        String2014 obj = new String2014();
        System.out.print("INPUT:");
        String str = sc.nextLine().trim();
        
        char last = str.charAt(str.length()-1);
        if(last=='.'||last == '?'||last == '!')
        {
          System.out.println("");
          System.out.print("WORD TO BE DELETED:");
          String str_del = sc.next();
          System.out.print("WORD POSITION IN THE SENTENCE:");
          int pos = sc.nextInt();
          String f_String= obj.cleanWords(str);
          obj.delete(pos, str, str_del);
        }
        else
        {
            System.out.println("INVALID INPUT.");
        }
        
    }
}

