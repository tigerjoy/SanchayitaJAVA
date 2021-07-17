import java.util.Scanner;
class WordExtraction
{
  void displayWords(String str)
  {
    // Removing the leading and trailing spaces
    str = str.trim();
    // Adding a space to extract the last word
    str = str + " ";
    int start = 0;
    int length = str.length();
    for(int i = 0; i < length; i++)
    {
      char ch = str.charAt(i);
      if(ch == ' ') // A space
      {
        int space_index = i;
        String word = str.substring(start, space_index);
        System.out.println(word);
        for(int j = space_index + 1; j < length; j++){
          if(str.charAt(j) != ' '){
            start = j;
            i = j;
            break;
          }
        }
      }
    }
  }

  // Cleaning a string having multiple space seperated
  // words into single space seperated words
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

  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    WordExtraction obj = new WordExtraction();
    // System.out.print("Enter a sentence: ");
    // String input = sc.nextLine();
    // obj.displayWords(str);
    // System.out.println(obj.cleanWords(str) + "#");

    String str = "   My    name    is    Sanchayita   Ghosh    ";
    String words[] = obj.extractWords(str);
    
    for(String word:words)
    {
      System.out.println(word);
    }
  }
}