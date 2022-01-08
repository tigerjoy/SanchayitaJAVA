import java.util.Scanner;
class Bank 
{
  String name;
  String accno;
  double p;

  // OBSERVATION #1
  // Does the question ask you to implement the
  // default constructor? 
  // Bank()
  // {
  //   name="";
  //   accno="";
  //   p=0.0;
  // }
  Bank(String name,String accno, double p)
  {
    this.name = name;
    this.accno= accno;
    this.p = p;
   
  }
  void display()
  {
    System.out.println("Name: " + name);
    System.out.println("Account Number:"+accno);
    System.out.println("Principal Amount: "+p);
  }
}

class Account extends Bank
{
  double amt;
  
  Account(String name, String acno,double p)
  {
    super(name,acno,p);
    this.amt = 0.0;
    
  }
  void deposit()
  {
      p +=amt;
  }
  // OBSERVATION #2
  // Wrong logic. You account balance should never 
  // become negative.
  void withdrawal()
  {
    if(amt > p)
    {
      System.out.println("INSUFFICIENT BALANCE");
    }
    else
    {
      p -= amt;
    }
    // p-=amt;
    // if(p<0)
    // {
    //   System.out.println("INSUFFICIENT BALANCE");
    //   p += amt;
    // }
    // else if(p<500)
    if(p<500)
    {
        p=(p-(500-p))/10.0;       
    }
     
  }
  // OBSERVATION #3
  // Both the super class and sub class would show
  // the updated value of p and not the value
  // before or after any transaction.
   void display()
  {
      super.display();
      // System.out.println("Balance:"+p);
  }
}


// Scored - 6 points
class Isc2016
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name ");
    String name= sc.nextLine();
    System.out.println("Enter Account Number");
    String accno= sc.nextLine();
    System.out.println("Enter the principal Amount");
    double p= sc.nextInt();
     System.out.println("Enter 1 to deposit");
      System.out.println("Enter 2 to withdraw");
      System.out.println("Enter your choice");
      int ch = sc.nextInt();
      Account obj = new Account(name,accno,p);
    switch(ch)
     {
        case 1:
            obj.deposit();
            break;
        case 2:
            obj.withdrawal();
            break;
        default:
            System.out.println("Invalid choice");
                    
    }
    
    obj.display();
  }
}



