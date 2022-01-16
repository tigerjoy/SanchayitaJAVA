import java.util.Scanner;
class Book
{
  static Scanner sc = new Scanner(System.in);
  String name[];
  int point;
  int max;
  int ctr;
  Book()
  {
    System.out.println("Enter max");
    max = sc.nextInt();
    name= new String[max];
    point=-1;
  }
  Book(int cap)
  {
    this.max=cap;
    name= new String[max];
    point=-1;
  }
  
  void add(String v)
  {
    if(point==max-1)
    {
      System.out.println("SHELF FULL");
    }
    else
    {
      point=point+1;
      name[point]=v;
      System.out.println(v+" INSERTED");
      ctr++;
    }
  }
  void tell()
  {
    // String ret = ""; // Empty String
    String ret="";
    if(point==-1)
    {
          System.out.println("SHELF EMPTY");
    }
    else
    {
      ret = name[point];
      point= point-1;
      System.out.println(ret);
     
    }
    
  }

  
  void display()
  {
    // if(point==-1)
    if(isEmpty())
    {
      System.out.println("Book is empty.");
    }
    else
    {
      for(int i=point;i>=0;i--)
      {
        System.out.println(name[i]);
      }
    }
  }

  boolean isEmpty()
  {
    return point==-1;
  }
  public static void main(String[]args)
  {
      Book obj =  new Book(5);
      System.out.println("Press 1 to push");
      System.out.println("Press 2 to pop");
      System.out.println("Enter your choice");
      int n = sc.nextInt(); 
      sc.nextLine();
      switch(n)
      {
          case 1:
          System.out.println("Enter the element to be pushed:");
          String element = sc.nextLine();
          obj.add(element);
          obj.display();
          break;
          case 2:
          obj.tell();
          obj.display();
          break;
          default:
          System.exit(0);
          obj.display();
          
      }
      
  }
}