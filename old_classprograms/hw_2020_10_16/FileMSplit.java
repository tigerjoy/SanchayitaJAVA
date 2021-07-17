import java.io.*;
import java.util.Scanner;
class FileMSplit
{
  public static void main(String[]args)throws IOException
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Input File name ");
    String inFileName = sc.nextLine();   
    System.out.println("Enter the number of files to split into");
    int N = sc.nextInt();
    int index = inFileName.indexOf(".");
    String name = inFileName.substring(0,index);
    String extension = inFileName.substring(index+1);
    FileInputStream fin = new FileInputStream(inFileName);
    int size = fin.available();
    int splitSize = size /N;
    int Splitsize = size - ((N-1)*splitSize);
    for(int i= 0; i <= N-2;i++)
    {
        String outFile = name+"_"+(i+1)+ "." + extension;
        FileOutputStream fout = new FileOutputStream(outFile);
        for(int j = 0;j<=splitSize-1;j++)
        {
            int readByte = fin.read();
            fout.write(readByte);
        }
        fout.close();
    }
    String outFile2 = name+"_"+ N + "." + extension;
    FileOutputStream fout = new FileOutputStream(outFile2);
    for(int i = 0;i<=Splitsize-1;i++)
    {
      int readByte = fin.read();
      fout.write(readByte);
    }
    fout.close();
    fin.close();
  }
}