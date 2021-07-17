import java.util.Scanner;
 class Product 
{
  String name;
  int code;
  double amount;
  
 Product(String n,int c,double p)
  {
   this.name=n;
   this.code=c;
   this.amount=p;
  }
 void show()
 {
    System.out.println("Name: " + name);
    System.out.println("Code:"+code);
    System.out.println("Amount: "+amount);
 }
}

class Sales extends Product
{
  int day;
  double tax;
  double totamt;
  
  Sales(String name,int code,double amount,int day)
  {
    super(name,code,amount);
    this.day=day;
    this.tax=0.0;
    this.totamt = 0.0;
    
  }
  void compute()
  {
      tax= (12.4/100.0*amount);
      if(day>30)
      {
          tax+=(2.5/100.0*amount);
      }
      totamt= amount+tax;
  }
   void show()
  {
      super.show();
      compute();
      System.out.println("Total amount:"+totamt);
     
  }
}

// Scored - 10 points
class Isc2017
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name ");
    String name= sc.nextLine();
    System.out.println("Enter Code");
    int code = sc.nextInt();
    System.out.println("Enter the Amount");
    double amt= sc.nextDouble();
    System.out.println("Enter the days");
    int day = sc.nextInt();
    Sales obj = new Sales(name,code,amt,day);
    obj.show();
  }
}



