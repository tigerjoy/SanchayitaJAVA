import java.io.*;
import java.util.Scanner;
public class File3 
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
        
        //Taking number of copies to be made as num
        System.out.print("Enter the number of copies to be made: ");
        int num = sc.nextInt();

         int readByte;
        // Reading from a file until EOF is reached
        while(num!=0)
        {
          // Opening the input file
          FileInputStream fin = new FileInputStream(inFileName);

          // Open the ith output file
          FileOutputStream fout = new FileOutputStream(name + num + "." + extension);
          // Copy the contents from input to output file
          while((readByte = fin.read()) != -1)
          {
            // Writing to the file
            fout.write(readByte);
          }
          // Close the output file
          fout.close();
          // Close the output file
          fin.close();
          // Create the next copy
          num--;
        }
    }
}
