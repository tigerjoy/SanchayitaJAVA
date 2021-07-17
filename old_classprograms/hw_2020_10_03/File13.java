import java.io.*;
import java.util.Scanner;
class File13
{
  int countVowels(String name) throws IOException
  {
    FileInputStream fin = new FileInputStream(name);
    int readByte;
    int c=0;
    while((readByte=fin.read()) != -1)
    {
        char ch = Character.toUpperCase((char)(readByte));
      if(ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U')
      {
        c++;
      }
    }
    fin.close();
    return c;
  }
  int countConsonants(String name) throws IOException
  {
    FileInputStream fin = new FileInputStream(name);
    int readByte;
    int c=0;
    while((readByte=fin.read()) != -1)
    {
       char ch = Character.toUpperCase((char)(readByte));
      if((ch>='A'&&ch<='Z')&&!(ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U'))
      {
        c++;
      }
    }
    fin.close();
    return c;
  }
  int countDigits(String name) throws IOException
  {
    FileInputStream fin = new FileInputStream(name);
    int readByte;
    int c=0;
    while((readByte=fin.read()) != -1)
    {
      if(Character.isDigit((char)(readByte)))
      {
        c++;
      }
    }
    fin.close();
    return c;
  }
  int countSpecialCharacters(String name) throws IOException
  {
    FileInputStream fin = new FileInputStream(name);
    int readByte;
    String content = "";
    int c = 0;
    while((readByte=fin.read())!=-1)
    {
        char ch = Character.toUpperCase((char)(readByte));
        if((65>ch||90<ch)&&(Character.isDigit(ch)==false))
        {
            c++;
        }
    }
    fin.close();
    return c;
  }
  public static void main(String[]args)throws IOException
  {
    Scanner sc = new Scanner(System.in);
    File13 obj = new File13();
    System.out.println("Enter name of input file");
    String inFileName = sc.nextLine();
    System.out.println(inFileName + " contains "+obj.countDigits(inFileName)+" digits.");
    System.out.println(inFileName + " contains "+obj.countVowels(inFileName)+" vowels.");
    System.out.println(inFileName + " contains "+obj.countConsonants(inFileName)+" consonants.");
    System.out.println(inFileName + " contains "+obj.countSpecialCharacters(inFileName)+" special characters.");
  }
}
