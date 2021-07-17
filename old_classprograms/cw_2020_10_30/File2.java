import java.util.Scanner;
import java.io.*;
class File2
{
  static Scanner sc = new Scanner(System.in);
  void addRecords(String filename)throws IOException
  {
    FileWriter fw = new FileWriter(filename,true);
    BufferedWriter bw = new BufferedWriter(fw);
    PrintWriter fout = new PrintWriter(bw,true);
    System.out.println("Enter the number of records");
    int n = sc.nextInt();
    for(int i = 1;i<=n;i++)
    {
      sc.nextLine();
      System.out.println("Enter name of student " + i);
      String name = sc.nextLine();
      System.out.println("Enter Physics marks of student " + i);
      int phy = sc.nextInt();
      System.out.println("Enter Chemistry marks of student " + i);
      int chem = sc.nextInt();
      System.out.println("Enter Biology marks of student " + i);
      int bio = sc.nextInt();
      fout.println(name);
      fout.println(phy);
      fout.println(chem);
      fout.println(bio);
    }
    fout.close();
    bw.close();
    fw.close();
  
  }
  void calcMarks(String filename)throws IOException
  {
    Scanner fin = new Scanner(new File(filename));
    System.out.printf("%-10s %-12s %s\n","NAME","TOTAL MARKS","AVERAGE MARKS");
    while(fin.hasNextLine())
    {
      String name = fin.nextLine();
      int phy = Integer.parseInt(fin.nextLine());
      int chem = Integer.parseInt(fin.nextLine());
      int bio = Integer.parseInt(fin.nextLine());
      int total = phy+chem+bio;
      double avg = total/3.0;
      System.out.printf("%-10s %-12d %.2f\n",name,total,avg);
    }
    fin.close();
  }
  public static void main(String[]args)throws IOException
  {
    File2 obj = new File2();
    System.out.print("Enter name of the file: ");
    String filename = sc.nextLine();
    int choice;
    do{
      System.out.println("MENU\n");
      System.out.println("Press 1 to add records to the file");
      System.out.println("Press 2 to calculate total and average marks");
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
          obj.calcMarks(filename);
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