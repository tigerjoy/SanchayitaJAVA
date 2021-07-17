import java.io.*;
import java.util.Scanner;
class File13
{
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
  public static void main(String[]args)throws IOException
  {
    Scanner sc = new Scanner(System.in);
    File13 obj = new File13();
    System.out.println("Enter name of input file");
    String inFileName = sc.nextLine();
    
    System.out.println(inFileName + " contains "+obj.countDigits(inFileName)+" digits.");
  }
}
