import java.io.*;
import java.util.Scanner;
public class Filemerge
{
    public static void main(String[] args)throws IOException
    {
        Scanner sc = new Scanner(System.in);
        // Taking name of input file as input
        System.out.print("Enter name of the first input file: ");
        String inFileName = sc.nextLine();
        System.out.print("Enter name of the second input file: ");
        String inFileName1 = sc.nextLine();
        int index = inFileName.indexOf(".");
        int index1 = inFileName1.indexOf(".");
        String name = inFileName.substring(0,index);
        String name1 = inFileName1.substring(0,index1);
        String extension = inFileName.substring(index+1);
        String outFileName = name+name1+"_merge."+extension;
        FileInputStream fin = new FileInputStream(inFileName);
        int readByte;
        String content = "";
        while((readByte=fin.read())!=-1)
        {
          content = content +((char)(readByte));
        }
        fin.close();
        FileInputStream fin1 = new FileInputStream(inFileName1);
        int readByte1;
        String content1 = "";
        while((readByte1=fin1.read())!=-1)
        {
          content1 = content1 +((char)(readByte1));
        }
        fin1.close();
        String finalContent = content +content1;
        FileOutputStream fout = new FileOutputStream(outFileName);
        for(int i = 0;i<=finalContent.length()-1;i++)
        {
          char ch = finalContent.charAt(i);
          fout.write(ch);
        }
        fout.close();
        System.out.println(outFileName +" created successfully.");
    }
}
