import java.util.Scaner;
import java.io.*;

class File9
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
      System.out.print("Enter marks: ");
      int marks =sc.nextInt();
      sc.nextLine();
      fout.println(name);
      fout.println(bSalary);
    }
    fout.close();
    bw.close();
    fw.close();
  }
  
  int linearSearch(String arr[], String key)
  {
    int pos = -1; 
    for(int i = 0;i<= arr.length-1;i++)
    {
      if(key.equals(arr[i]))
      {
        pos = i;
        break;
      }
    }
    return pos;
  }
  
  int getRecordCount(String filename) throws IOException
  {
    File inFile = new File(filename);
    Scanner fin = new Scanner(inFile);
    int count = 0;
    while(fin.hasNextLine())
    {
      fin.nextLine();
      fin.nextLine();
      count++;
    }
    fin.close();
    return count;
  }
  
  void fileToArray(String filename, String name[], int marks[])
  {
    File inFile = new File(filename);
    Scanner fin = new Scanner(inFile);
    int i = 0;
    while(fin.hasNextLine())
    {
      name[i] = fin.nextLine();
      marks[i]= Integer.parseInt(fin.nextLine());
      i++;
    }
    fin.close();
  }

  void mergeRecords(String filename, 
                    String name1[], 
                    int marks1[],
                    String name2[], int marks2[])
  {
    FileWriter fw = new FileWriter(filename);
    BufferedWriter bw =  new BufferedWriter(fw);
    PrintWriter fout = new PrintWriter(bw,true);

    int n = name1.length;
    for(int i = 0;i<n;i++)
    {
      fout.println(name1[i]);
      fout.println(marks1[i]);
      int pos = linearSearch(name2,name1[i]);
      fout.println(marks2[pos]);
      fout.println((marks1[i] + marks2[pos]) / 2.0);
    }
    
    fout.close();
    bw.close();
    fw.close();
  }

  public static void main(String[]args){
    
  }
}
