import java.io.*;
import java.util.Scanner;

class File1{
  public static void main(String[]args)throws IOException{
    Scanner sc = new Scanner(System.in);

    String userDesktop = System.getProperty("user.home") + "\\Desktop\\";

    // Taking name of input file as input
    System.out.print("Enter name of the input file: ");
    String inFileName = sc.nextLine();

    // Taking name of output file as input
    System.out.print("Enter name of the output file: ");
    String outFileName = sc.nextLine();

    // Creating objects of Input and Output Streams
    FileInputStream fin = new FileInputStream(userDesktop + inFileName);
    FileOutputStream fout = new FileOutputStream(userDesktop + outFileName);

    int readByte;
    // Reading from a file until EOF is reached
    while((readByte = fin.read()) != -1){
      // Writing to the file
      fout.write(readByte);
    }

    fin.close();
    fout.close();
  }
}