import java.util.Scanner;
class Record
{
  String name[];
  int rnk[];
  Record()
  {
    name = new String[50];
    rnk =new int[50];
  }
  void readvalues()
  {
    Scanner sc = new Scanner(System.in);
    for(int i = 0;i<name.length;i++)
    {
      System.out.println("Enter the name of Student "+(i+1));
      name[i]=sc.nextLine();
      System.out.println("Enter the rank of Student "+(i+1));
      rnk[i]=sc.nextInt();
      sc.nextLine();
    }
  }
  void display()
  {
    System.out.printf("%-15s %s\n", "NAME", "RANK");
    for(int i = 0;i<name.length;i++)
    {
      System.out.printf("%-15s %s\n", name[i], rnk[i]);
    }
  }
}
class Rank extends Record
{
  int index;
  Rank()
  {
    super();
    this.index=0;
  }
  void highest()
  {
    index= rnk[0];
    for(int i =0;i<=rnk.length-1;i++)
    {
      if(index>rnk[i])
      {
        index= rnk[i];
      }
    }
  }
  void display()
  {
    super.display();
    System.out.println("Name of the student with highest rank :"+name[index]);
  }
}

class Isc2011
{
  public static void main(String[]args)
  {
    Rank obj = new Rank();
    obj.readvalues();
    obj.highest();
    obj.display();
  }
}