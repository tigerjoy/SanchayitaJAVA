import java.io.*;
import java.util.Scanner;
public class File10
{
    public static void main(String[] args)throws IOException
    {
        Scanner sc = new Scanner(System.in);
        // Taking name of input file as input
        System.out.print("Enter name of the input file: ");
        String inFileName = sc.nextLine();
        int index = inFileName.indexOf(".");
        String name = inFileName.substring(0,index);
        String extension = inFileName.substring(index+1);
        String outFileName = name+"_cap."+extension;
        FileInputStream fin = new FileInputStream(inFileName);
        int readByte;
        String content = "";
        while((readByte=fin.read())!=-1)
        {
          content = content +(Character.toUpperCase((char)(readByte)));
        }
        fin.close();
        FileOutputStream fout = new FileOutputStream(outFileName);
        for(int i = 0;i<=content.length()-1;i++)
        {
          char ch = content.charAt(i);
          fout.write((int)(ch));
        }
        fout.close();
        System.out.println(outFileName +" created successfully.");
    }
}