import java.util.Scanner;
class WordPile
{
  static Scanner sc = new Scanner(System.in);
  char ch[];
  int capacity;
  int top;
  WordPile(int cap)
  {
    this.capacity=cap;
    ch= new char[capacity];
    top=-1;
  }
  void pushChar(char v)
  {
    if(top==capacity-1)
    {
      System.out.println("OVERFLOW");
    }
    else
    {
      top=top+1;
      ch[top]=v;
      System.out.println(v+" INSERTED");
    }
  }
  char popChar()
  {
    char ch='';
    if(top==-1)
    {
      System.out.println("UNDERFLOW");
    }
    else
    {
      chr = ch[top];
      top= top-1;
      System.out.println(chr+" DELETED.");
      
    }
    return chr;
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
        System.out.println(ch[i]);
      }
    }
  }

  boolean isEmpty()
  {
    return top==-1;
  }
  
}