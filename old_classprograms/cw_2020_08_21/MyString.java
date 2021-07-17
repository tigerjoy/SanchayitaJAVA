import java.util.Scanner;
class MyString
{
  String str;
  MyString()
  {
    str="";
  }
  void accept()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a sentence in UPPER CASE");
    str = sc.nextLine();
  }
  boolean check(String s)
  {
    char ch1 = s.charAt(0);
    char chl = s.charAt(s.length()-1);
    return ch1==chl;
  }
  void show()
  {
    // Extract each word from the String
    // Check if the word has same letters 
    // at start and end
    System.out.println("INITAL SENTENCE :"+str);
    str= str.trim()+" ";
    int start = 0;
    int length = str.length();
    System.out.println("WORDS BEGINING AND ENDING WITH THE SAME LETTER");
    for(int i =0;i<=length-1;i++)
    {
      char ch = str.charAt(i);
      if(ch==' ')
      {
        String temp = str.substring(start,i);
        if(check(temp))
        {
          System.out.print(temp +" ");
        }
        start=i+1;
      }
    }
  }
  public static void main(String[]args)
  {
    MyString obj = new MyString();
    obj.accept();
    obj.show();
  }
}