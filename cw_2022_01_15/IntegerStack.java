import java.util.Scanner;
class IntegerStack
{
  int STACK[];
  int top;
  int size;
  
  IntegerStack()
  {
    size=1000;
    STACK= new int[size];
    top=-1;
  }
  IntegerStack(int size)
  {
    this.size=size;
    STACK= new int[size];
    top=-1;
  }
  void push(int item)
  {
    if(top==size-1)
    {
      System.out.println("STACK OVERFLOW");
    }
    else
    {
      top=top+1;
      STACK[top]=item;
      System.out.println(item+" INSERTED");
    }
  }
  int pop()
  {
    // String ret = ""; // Empty String
    int ret=-1;
    if(top==-1)
    {
      System.out.println("STACK UNDERFLOW");
    }
    else
    {
      ret = STACK[top];
      top= top-1;
      System.out.println(ret+" DELETED.");
    }
    return ret;
  }

  int stackSize()
  {
    return top+1;
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
        System.out.println(STACK[i]);
      }
    }
  }

  boolean isEmpty()
  {
    return top==-1;
  }

  void displayMenu()
  {
    System.out.println("MENU :");
    System.out.println("Press 1 to push an item on the stack");
    System.out.println("Press 2 to pop an item from the stack");
    System.out.println("Press 3 to display the size of the stack");
    System.out.println("Press 4 to display the contents of the stack");
    System.out.println("Press 5 to exit");
    System.out.print("Enter your choice (1-5): ");
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    IntegerStack obj = new IntegerStack(5);
    int choice;
    do{
      obj.displayMenu();
      choice = sc.nextInt();
      switch(choice)
      {
        case 1:
        {
          System.out.println("Enter an item to be pushed");
          int item = sc.nextInt();
          obj.push(item);
          System.out.println("THE ELEMENTS OF THE STACK ARE:");
          obj.display();
          break;
        }
        case 2:
        {
          int popped = obj.pop();
          System.out.println("THE ELEMENTS OF THE STACK ARE:");
          obj.display();
          break;
        }
        case 3:
        {
          System.out.println("THE SIZE OF THE STACK IS:"+ obj.stackSize());
          break;
        }
        case 4:
        {
          System.out.println("THE ELEMENTS OF THE STACK ARE:");
          obj.display();
          break;
        }
        case 5:
        {
          System.out.println("Exiting...");
          break;
        }
        default:
        {
          System.out.println("INVALID CHOICE");
        }
      }
    }while(choice!=5);
  }
}