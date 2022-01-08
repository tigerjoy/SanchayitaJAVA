import java.util.Scanner;
class Record
{
  String n[];
  int m[];
  int size;
  Record(int cap)
  {
    size = cap;
    n = new String[size];
    m =new int[size];
  }
  void readarray()
  {
    Scanner sc = new Scanner(System.in);
    for(int i = 0;i<size;i++)
    {
      System.out.println("Enter the name of Student "+(i+1));
      n[i]=sc.nextLine();
      System.out.println("Enter the marks of Student "+(i+1));
      m[i]=sc.nextInt();
      sc.nextLine();
    }
  }
  // OBSERVATION #1
  // Although this works as int is automatically converted
  // to a String in Java, this does not work in other
  // programming languages. Always use %d with an int.
  void display()
  {
    // System.out.printf("%-15s %s\n", "NAME", "MARKS");
    System.out.printf("%-15s %d\n", "NAME", "MARKS");
    for(int i = 0;i<size;i++)
    {
      // System.out.printf("%-15s %s\n", n[i], m[i]);
      System.out.printf("%-15s %d\n", n[i], m[i]);
    }
  }
}
class Highest extends Record
{
  int ind;
  Highest( int size)
  {
    super(size);
    this.ind=0;
  }
  void find()
  {
   ind= m[0];
    for(int i =0;i<=m.length-1;i++)
    {
      if(ind>m[i])
      {
        ind= i;
      }
    }
  }
  void display()
  {
    find();
    super.display();
    System.out.println("Name of the student with highest marks :"+n[ind]+m[ind]);
  }
}

// Scored - 10 points
class Isc2019
{
  public static void main(String[]args)
  {
      Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size");
     int sz= sc.nextInt();
    Highest obj = new Highest(sz);
    obj.readarray();
    obj.display();
  }
}