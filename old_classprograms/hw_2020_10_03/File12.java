import java.io.*;
import java.util.Scanner;
public class File12
{
    public static void main(String[] args)throws IOException
    {
        Scanner sc = new Scanner(System.in);
        // Taking name of input file as input
        System.out.print("Enter name of the input file: ");
        String inFileName = sc.nextLine();
        System.out.println("Enter the old pattern");
        String pat1 = sc.nextLine();
        System.out.println("Enter the new pattern");
        String pat2 = sc.nextLine();
        int index = inFileName.indexOf(".");
        String name = inFileName.substring(0,index);
        String extension = inFileName.substring(index+1);
        String outFileName = name+"_pattern."+extension;
        FileInputStream fin = new FileInputStream(inFileName);
        int readByte;
        String content = "";
        while((readByte=fin.read())!=-1)
        {
          content = content +((char)(readByte));
        }
        fin.close();
        
        String content1 = content.replace(pat1,pat2);
        FileOutputStream fout = new FileOutputStream(outFileName);
        for(int i = 0;i<=content1.length()-1;i++)
        {
          char ch = content1.charAt(i);
          fout.write((int)(ch));
        }
        fout.close();
        System.out.println(outFileName +" created successfully.");
    }
}

