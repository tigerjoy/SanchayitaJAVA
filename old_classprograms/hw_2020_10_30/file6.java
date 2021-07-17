import java.util.Scanner;
import java.io.*;
class file6
{
  static Scanner sc = new Scanner(System.in);

  void addRecords(String filename)throws IOException
  {
    FileWriter fw = new FileWriter(filename,true);
    BufferedWriter bw = new BufferedWriter(fw);
    PrintWriter fout = new PrintWriter(bw,true);
    
    System.out.print("Enter the number of records: ");
    int n = sc.nextInt();
    sc.nextLine();

    for(int i = 1;i<=n;i++)
    {
      sc.nextLine();
      System.out.println("Enter name of student " + i);
      String name = sc.nextLine();
      System.out.println("Enter roll number of student " + i);
      int roll = sc.nextInt();
      System.out.println("Enter total marks of student " + i);
      int total = sc.nextInt();
      
      fout.println(name);
      fout.println(roll);
      fout.println(total);
      
    }
    fout.close();
    bw.close();
    fw.close();
  
  }
  void displayRecords(String filename) throws IOException
  {
    Scanner fin = new Scanner(new File(filename));
    System.out.printf("%-10s %-12s %s\n","NAME","ROLL NUMBER","TOTAL MARKS");
    while(fin.hasNextLine())
    {
      String name = fin.nextLine();
      int roll = Integer.parseInt(fin.nextLine());
      int total = Integer.parseInt(fin.nextLine());
      
      System.out.printf("%-10s %-12d %.2f\n",name,roll,total);
    }
    fin.close();
  }
  public static void main(String[]args)throws IOException
  {
    file6 obj = new file6();
    String userDesktop = System.getProperty("user.home") + "\\Desktop\\";
    System.out.print("Enter name of the file: ");
    String filename = userDesktop+sc.nextLine();

    int choice;
    do{
      System.out.println("MENU\n");
      System.out.println("Press 1 to add records to the file");
      System.out.println("Press 2 to display records");
      System.out.println("Press 3 to exit");
      System.out.println("Enter your choice");
      choice = sc.nextInt();
      switch(choice)
      {

        case 1 :
        {
          obj.addRecords(filename);
          break;
        }
        case 2: 
        {
          obj.displayRecords(filename);
          break;
        }
        case 3:
        {
          break;
        }
        default:
        {
          System.out.println("Please enter a valid option");
        }
      }
    }while(choice!=3);
  }
}