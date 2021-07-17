import java.util.Scanner;
class Isc2014
{
  String item;
  int qty;
  double rate;
  double amt;
  
  Stock()
  {
    item="";
    qty=0;
    amt =0.0;
    rate=0.0;
  }
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

