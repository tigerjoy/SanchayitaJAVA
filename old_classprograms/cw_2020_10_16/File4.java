import java.io.*;
import java.util.Scanner;
class File4
{
  String readContent(String name)throws IOException
  {
    FileInputStream fin = new FileInputStream(name);
    String content = "";
    int readByte;
    while((readByte = fin.read())!=-1)
    {
      char ch = ((char)(readByte));
      content = content +ch;
    }
    fin.close();
    return content;
  }
  public static void main(String[]args)throws IOException
  {
    Scanner sc = new Scanner(System.in);
    File4 obj = new File4();
    System.out.println("Enter the number of files to be merged");
    int n = sc.nextInt();
    sc.nextLine();
    String inFileNames[] = new String[n];
    for(int i = 0;i <= n - 1;i++)
    {
      System.out.println("Enter File name "+(i+1));
      inFileNames[i]= sc.nextLine();
    }
    System.out.println("Enter the output file name");
    String outFileName = sc.nextLine();
    String content = "";
    for(int i = 0;i<=n-1;i++)
    {
      content = content + obj.readContent(inFileNames[i]);
    }
    // Write the value of content in output file
    FileOutputStream fout = new FileOutputStream(outFileName);

    for(int i = 0; i < content.length(); i++){
      fout.write((int) content.charAt(i));
    }

    fout.close();

    System.out.println(outFileName+" created successfully.");
  }
}