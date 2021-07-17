import java.io.*;
import java.util.Scanner;

class File2{
  public static void main(String[]args)throws IOException{
    Scanner sc = new Scanner(System.in);

    // Taking name of input file as input
    System.out.print("Enter name of the input file: ");
    String inFileName = sc.nextLine();

    // Creating objects of Input and Output Streams
    FileInputStream fin = new FileInputStream(inFileName);
  
    
    int readByte;
    // Reading from a file until EOF is reached
    while((readByte = fin.read()) != -1){
      System.out.print((char)readByte);
    }

    fin.close();
  
  }
}