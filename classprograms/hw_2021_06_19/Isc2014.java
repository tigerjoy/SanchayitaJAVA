import java.util.Scanner;
// OBSERVATION #0
// What was the name of the super class given in the 
// question?
// class Isc2014
class Stock
{
  String item;
  int qty;
  double rate;
  double amt;
  
  // OBSERVATION #1
  // Did the question ask to implement the default 
  // constructor?
  // Stock()
  // {
  //   item="";
  //   qty=0;
  //   amt =0.0;
  //   rate=0.0;
  // }

  Stock(String item,int qty, double amt , double rate)
  {
    this.item = item;
    this.qty = qty;
    this.amt = amt;
    this.rate= rate;
  }

  void display()
  {
    System.out.println("Item: " + item);
    System.out.println("Quantity: " + qty);     
    System.out.println("Rate: " + rate);
    // OBSERVATION #2
    // You forgot to display the amount.
    System.out.println("Amount: " + amt);
  }
}

class Purchase extends Stock
{
  int pqty;
  double prate;
  Purchase(String item, int qty ,double amt, double rate, int pqty, double prate)
  {
    super(item,qty,amt,rate);
    this.pqty = pqty;
    this.prate = prate;
  }
  void update()
  {
      qty= qty+pqty;
      // OBSERVATION #3
      // I know, there's no need for an if here, 
      // because if rate == prate, assignment makes
      // no difference, but if rate != prate then
      // the job of assignment is done. Ask your maam
      // to comment on this, to see if an explicit
      // if is required here or not.
      rate=prate;
      amt = qty*rate;
  }
  void display()
  {
      System.out.println("STOCK DETAILS BEFORE :");
      super.display();
      System.out.println("UPDATED STOCK DEATILS :");
      System.out.println("Item: " + item);
      System.out.println("Quantity: " + qty);     
      System.out.println("Rate: " + rate);
      System.out.println("Amount : "+amt);
  }
}

// Scored - 9 points
class Isc2014
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Item");
    String name= sc.nextLine();
    System.out.println("Enter Qunatity");
    int qty= sc.nextInt();
    System.out.println("Enter Rate");
    double rate= sc.nextDouble();
    System.out.println("Enter the purchased quantity");
    int pqty= sc.nextInt();
    System.out.println("Enter new rate");
    double prate = sc.nextDouble();
    System.out.println("Enter net value");
    double amt =sc.nextDouble();
    Purchase obj = new Purchase(name,qty,amt,rate,pqty,prate);
    obj.display();
  }
}

