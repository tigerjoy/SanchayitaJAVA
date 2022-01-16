import java.util.Scanner;
class IntegerQueue
{
  int QUEUE[];
  int front;
  int rear;
  int size;
  
  IntegerQueue()
  {
    size=1000;
    rear=-1;
    front=-1;
    QUEUE = new int[size];
  }
  IntegerQueue(int size)
  {
    this.size=size;
    rear=-1;
    front=-1;
    QUEUE = new int[size];
  }
  void enqueue(int item)
  {
    if(rear==size-1)
    {
      System.out.println("QUEUE OVERFLOW");
    }
    else 
    {
      if(front==-1)
      {
        front=0;
      }
      rear++;
      QUEUE[rear]=item;
      System.out.println(item+" INSERTED");
    }
  }
  int dequeue()
  {
    int item=-1;
    if(front==-1)
    {
      System.out.println("QUEUE UNDERFLOW");
    }
    else
    {
      item=QUEUE[front];
      System.out.println(item+" DELETED");
      if(front==rear)
      {
        front=rear=-1;
      }
      else
      {
        front=front+1;
      }
    }
    return item;
  }
  boolean isEmpty()
  {
    return front==-1;
  }
  int queueSize()
  {
    return isEmpty()?0:rear-front+1;
  }
  void display()
  {
    if(isEmpty())
    {
      System.out.println("QUEUE IS EMPTY");
    }
    else
    {
      for(int i= front;i<=rear;i++)
        System.out.print(QUEUE[i]+" , ");
    }
    System.out.println();
  }
  void displayMenu()
  {
    System.out.println("MENU :");
    System.out.println("Press 1 to insert an item on the queue");
    System.out.println("Press 2 to delete an item from the queue");
    System.out.println("Press 3 to display the size of the queue");
    System.out.println("Press 4 to display the contents of the queue");
    System.out.println("Press 5 to exit");
    System.out.print("Enter your choice (1-5): ");
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    IntegerQueue obj = new IntegerQueue(5);
    int choice;
    do{
      obj.displayMenu();
      choice = sc.nextInt();
      switch(choice)
      {
        case 1:
        {
          System.out.println("Enter an item to be inserted");
          int item = sc.nextInt();
          obj.enqueue(item);
          System.out.println("THE ELEMENTS OF THE QUEUE ARE:");
          obj.display();
          break;
        }
        case 2:
        {
          int popped = obj.dequeue();
          System.out.println("THE ELEMENTS OF THE QUEUE ARE:");
          obj.display();
          break;
        }
        case 3:
        {
          System.out.println("THE SIZE OF THE QUEUE IS:"+ obj.queueSize());
          break;
        }
        case 4:
        {
          System.out.println("THE ELEMENTS OF THE queue ARE:");
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