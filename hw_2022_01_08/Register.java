import java.util.Scanner;
class Register
{
  static Scanner sc = new Scanner(System.in);
  String stud[];
  int top;
  
  Register()
  {
    stud= new String[100];
    top=-1;
  }
  Register(int cap)
  {
    cap=100;
    stud= new String[100];
    top=-1;
  }
  
  void push(String n)
  {
    if(top==99)
    {
      System.out.println("OVERFLOW");
    }
    else
    {
      top=top+1;
      stud[top]=n;
      System.out.println(n+" INSERTED");
     
    }
  }
  String pop()
  {
    // String ret = ""; // Empty String
    String ret="";
    if(top==-1)
    {
      System.out.println("$$");
    }
    else
    {
      ret = stud[top];
      top= top-1;
      System.out.println(ret+" DELETED.");
     
    }
    return ret;
  }

  
  void display()
  {
    // if(top==-1)
    if(isEmpty())
    {
      System.out.println("Register is empty.");
    }
    else
    {
      for(int i=top;i>=0;i--)
      {
        System.out.println(stud[i]);
      }
    }
  }

  boolean isEmpty()
  {
    return top==-1;
  }
  public static void main(String[]args)
  {
      Register obj =  new Register(5);
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
          obj.push(element);
          obj.display();
          break;
          case 2:
          obj.pop();
          obj.display();
          break;
          default:
          System.exit(0);
          obj.display();
          
      }
      
  }
}