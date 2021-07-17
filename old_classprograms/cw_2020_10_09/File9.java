import java.io.*;
import java.util.Scanner;
class File9
{
  public static void main(String[]args)throws IOException
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name of input file");
    String inFileName = sc.nextLine();
    int index = inFileName.indexOf(".");
    String name = inFileName.substring(0,index);
    String extension = inFileName.substring(index+1);
    // INPUT FILE NAME: input.txt
    // OUTPUT FILE NAME: input_lowercase.txt
    String outFileName = name+"_lowercase."+extension;
    FileInputStream fin = new FileInputStream(inFileName);
    
    FileOutputStream fout = new FileOutputStream(outFileName);
    
    int size = fin.available();

    for(int i = 0; i < size; i++)
    {
      int readByte = fin.read();
      // Writing an lowercase letter for an 
      // uppercase letter
      if(readByte>=65 && readByte<=90)
      {
        fout.write(readByte+32);
      }
      else
      {
        fout.write(readByte);
      }
    }
    fout.close();
    fin.close();

    System.out.println(outFileName + " created successfully!");
  }
}
