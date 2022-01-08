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
}