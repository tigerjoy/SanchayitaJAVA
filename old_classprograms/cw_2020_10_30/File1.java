import java.util.Scanner;
import java.io.*;

class File1
{ 
  static Scanner sc = new Scanner(System.in);
  // Writing to the file
  void addRecords(String filename) throws IOException
  {
    FileWriter fw = new FileWriter(filename, true);
    BufferedWriter bw = new BufferedWriter(fw);
    PrintWriter fout = new PrintWriter(bw, true);
    System.out.print("Enter the number of records: ");
    int n = sc.nextInt();
    for(int i = 1; i <= n; i++){
      // Taking input from user
      System.out.print("Enter roll number for student " + i + ": ");
      int roll = sc.nextInt();
      sc.nextLine();
      System.out.print("Enter name for student " + i + ": ");
      String name = sc.nextLine();
      System.out.print("Enter class for student " + i + ": ");
      int std = sc.nextInt();
      System.out.print("Enter total marks for student " + i + ": ");
      int totalMarks = sc.nextInt();
      // Writing data to the file
      fout.println(roll);
      fout.println(name);
      fout.println(std);
      fout.println(totalMarks);
    }

    fout.close();
    bw.close();
    fw.close();
  }
  // Reading from the file
  void displayRecords(String filename) throws IOException
  {
    File inFile = new File(filename);
    Scanner fin = new Scanner(inFile);
    System.out.printf("%-8s %-10s %-5s %s\n", "ROLL NO.", "NAME", "CLASS", "TOTAL MARKS");
    while(fin.hasNextLine())
    {
      String roll = fin.nextLine();
      String name = fin.nextLine();
      String std = fin.nextLine();
      String totalMarks = fin.nextLine();

      System.out.printf("%-8s %-10s %-5s %s\n", roll, name, std, totalMarks);
    }

    fin.close();
  }
  public static void main(String[]args) throws IOException
  {
    File1 obj = new File1();
    System.out.print("Enter the name of the file: ");
    String filename = sc.nextLine();
    int choice;

    do{
      System.out.println("MENU\n");
      System.out.println("Press 1 to add records to the file");
      System.out.println("Press 2 to display the file");
      System.out.println("Press 3 to exit");
      System.out.println("Enter your choice(1-3): ");
      choice = sc.nextInt();

      switch(choice)
      {
        case 1: {
          obj.addRecords(filename);
          break;
        }
        case 2: {
          obj.displayRecords(filename);
          break;
        }
        case 3: {
          break;
        }
        default:
          System.out.println("Please enter an option between 1-3");
      }
    }while(choice != 3);
  }
}