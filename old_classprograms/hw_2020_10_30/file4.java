import java.util.Scanner;

import java.io.*;

class file4
{ 
  static Scanner sc = new Scanner(System.in);
  // Writing to the file
  void addRecords(String filename) throws IOException
  {
    System.out.print("Enter the number of records: ");
    int n = sc.nextInt();

    FileWriter fw = new FileWriter(filename, true);
    BufferedWriter bw = new BufferedWriter(fw);
    PrintWriter fout = new PrintWriter(bw, true);
    
    sc.nextLine();
    for(int i = 1; i <= n; i++){
      // Taking input from user
      System.out.print("Enter name of President " + i + ": ");
       String name = sc.nextLine();
      System.out.print("Enter name of country " + i + ": ");
      String country = sc.nextLine();
      System.out.print("Enter name of capital " + i + ": ");
      String capital = sc.nextLine();
      
      
      // Writing data to the file
      fout.println(name);
      fout.println(country);
      fout.println(capital);
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
    System.out.println("Enter the name of the President");
    String president = sc.nextLine();
    boolean isFound = false;
    while(fin.hasNextLine())
    {
        String name = fin.nextLine();
        String country = fin.nextLine();
        String capital = fin.nextLine();

        if(president.equals(name))
        {
            System.out.println("REQUIRED:"+name+" "+country+" "+capital);
            isFound = true;
            break;
        }
    }

    if(!isFound)
    {
        System.out.println("President name not found in the list.");
    }

    fin.close();
  }
  public static void main(String[]args) throws IOException
  {
    file4 obj = new file4();
    System.out.print("Enter the name of the file: ");
    String filename = sc.nextLine();
    String userDesktop = System.getProperty("user.home") + "\\Desktop\\";
    // Taking name of input file as input
    int choice;

    do{
      System.out.println("MENU\n");
      System.out.println("Press 1 to add records to the file");
      System.out.println("Press 2 to search record");
      System.out.println("Press 3 to exit");
      System.out.println("Enter your choice(1-3): ");
      choice = sc.nextInt();
      sc.nextLine();
      switch(choice)
      {
        case 1: {
          obj.addRecords(userDesktop + filename);
          break;
        }
        case 2: {
          obj.displayRecords(userDesktop + filename);
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
