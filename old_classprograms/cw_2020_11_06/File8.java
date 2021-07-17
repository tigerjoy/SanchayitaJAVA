import java.util.Scanner;
import java.io.*;
class File8
{
  static Scanner sc = new Scanner(System.in);
  void addRecords(String filename) throws IOException
  {
    FileWriter fw = new FileWriter(filename,true);
    BufferedWriter bw = new BufferedWriter(fw);
    PrintWriter fout = new PrintWriter(bw,true);
    System.out.print("Enter the number of records: ");
    int n = sc.nextInt();
    sc.nextLine();
    for(int i = 1;i<=n;i++)
    {
      System.out.print("Enter name: ");
      String name =sc.nextLine();
      System.out.print("Enter basic salary: ");
      int bSalary =sc.nextInt();
      sc.nextLine();
      fout.println(name);
      fout.println(bSalary);
    }
    fout.close();
    bw.close();
    fw.close();
  }
  void displayRecords(String filename) throws IOException
  {
    File inFile = new File(filename);
    Scanner fin = new Scanner(inFile);
    System.out.printf("%-10s %-12s %-8s %-8s %s\n",
      "NAME","BASIC SALARY","DA","HRA","GROSS SALARY");
    while(fin.hasNextLine())
    {
      String name = fin.nextLine();
      int bSalary = Integer.parseInt(fin.nextLine());
      double da = ((20.0/100.0)*bSalary);
      double hra =((10.0/100.0)*bSalary);
      double gs = da + hra+ bSalary;
      System.out.printf("%-10s Rs. %-12d Rs. %-8.2f Rs. %-8.2f Rs. %.2f\n",
      name,bSalary,da,hra,gs);
    }
    fin.close();
  }

  public static void main(String[]args)throws IOException
  {
    File8 obj = new File8();
    System.out.print("Enter the name of the file: ");
    String filename = sc.nextLine();
    //String userDesktop = System.getProperty("user.home") + "\\Desktop\\";
    // Taking name of input file as input
    int choice;

    do{
      System.out.println("MENU\n");
      System.out.println("Press 1 to add records to the file");
      System.out.println("Press 2 to display records");
      System.out.println("Press 3 to exit");
      System.out.println("Enter your choice(1-3): ");
      choice = sc.nextInt();
      sc.nextLine();
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