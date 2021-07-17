import java.io.*;
import java.util.Scanner;
class File5
{
  public static void main(String[]args)throws IOException
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Input File name ");
    String inFileName = sc.nextLine();   
    int index = inFileName.indexOf(".");
    String name = inFileName.substring(0,index);
    String extension = inFileName.substring(index+1);
    // in_%d.txt
    String format = name+"_%d."+extension;

    FileInputStream fin = new FileInputStream(inFileName);
    int size = fin.available();
    int splitSize = size/2;
    int lastFileSize = size - splitSize;
    String outFile1 = String.format(format, 1);
    FileOutputStream fout = new FileOutputStream(outFile1);
    for(int i = 0;i<=splitSize-1;i++)
    {
      int readByte = fin.read();
      fout.write(readByte);
    }
    fout.close();
    String outFile2 = String.format(format, 2);
    fout = new FileOutputStream(outFile2);
    for(int i = 0;i<=lastFileSize-1;i++)
    {
      int readByte = fin.read();
      fout.write(readByte);
    }
    fout.close();
    fin.close();
    System.out.println(outFile1+" created successfully.");
    System.out.println(outFile2+" created successfully.");

  }
}