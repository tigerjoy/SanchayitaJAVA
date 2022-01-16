import java.util.Scanner;
class Stack
{
  static Scanner sc = new Scanner(System.in);
  String st[];
  int top;
  int size;
  int ctr;
  Stack()
  {
    System.out.println("Enter size");
    size = sc.nextInt();
    st= new String[size];
    top=-1;
  }
  Stack(int cap)
  {
    this.size=cap;
    st= new String[size];
    top=-1;
  }
  
  void pushname(String n)
  {
    if(top==size-1)
    {
      System.out.println("OVERFLOW");
    }
    else
    {
      top=top+1;
      st[top]=n;
      System.out.println(n+" INSERTED");
      ctr++;
    }
  }
  String popname()
  {
    // String ret = ""; // Empty String
    String ret="";
    if(top==-1)
    {
      System.out.println("UNDERFLOW");
    }
    else
    {
      ret = st[top];
      top= top-1;
      System.out.println(ret+" DELETED.");
      ctr--;
    }
    return ret;
  }

  
  void display()
  {
    // if(top==-1)
    if(isEmpty())
    {
      System.out.println("STACK is empty.");
    }
    else
    {
      for(int i=top;i>=0;i--)
      {
        System.out.println(st[i]);
      }
    }
  }

  boolean isEmpty()
  {
    return top==-1;
  }
  public static void main(String[]args)
  {
      Stack obj =  new Stack(5);
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
          obj.pushname(element);
          obj.display();
          break;
          case 2:
          obj.popname();
          obj.display();
          break;
          default:
          System.exit(0);
          obj.display();
          
      }
      
  }
}