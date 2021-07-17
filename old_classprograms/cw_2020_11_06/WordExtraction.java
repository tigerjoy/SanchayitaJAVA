import java.util.Scanner;
import java.util.StringTokenizer;

class WordExtraction 
{
  void displayWords(String str)
  {
    StringTokenizer strTok = new StringTokenizer(str);
    while(strTok.hasMoreTokens())
    {
      System.out.println(strTok.nextToken());
    }
  }
  String[] extractWords(String str)
  {
    StringTokenizer strTok = new StringTokenizer(str);
    int wordCount = strTok.countTokens();
    String words[] = new String[wordCount];
    int index = 0;
    while(strTok.hasMoreTokens())
    {
      words[index] = strTok.nextToken();
      index++;
    }
    return words;
  }
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    WordExtraction obj = new WordExtraction();
    System.out.println("Enter a sentence: ");
    String str = sc.nextLine();

    System.out.println("The words are");
    obj.displayWords(str);

    String words[] = obj.extractWords(str);
    System.out.println("The extracted words are");
    for(String word: words)
    {
      System.out.print(word + ",");
    }
    System.out.println();
  }
}