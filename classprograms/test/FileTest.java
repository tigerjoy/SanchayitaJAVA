import java.util.Scanner;
import java.io.*;

class FileTest{
  public static void main(String[]args)throws IOException{
    String inFileName = "input.txt";
    String outFileName = "output.txt";

    FileInputStream inFile = new FileInputStream(inFileName);
    int ch;

    while(true){
      ch = inFile.read();
      
      if(ch == -1){
        break;
      }

      System.out.print((char) ch);
    }

    inFile.close();
  }
}