import java.util.Scanner;
class Library
{
  String name;
  String author;
  double p;
  
  Library()
  {
    name="";
    author="";
    p=0.0;
  }
  Library(String name, String author , double p)
  {
    this.name = name;
    this.author = author;
    this.p = p;
  }
  void show()
  {
    System.out.println("Book Name: " + name);
    System.out.println("Book author: " + author);     
    System.out.println("Book price: " + p);
  }
}

class Compute extends Library
{
  int d;
  double f;
  Compute(String name, String author , double p, int d)
  {
    super(name,author,p);
    this.d = d;
    this.f = 0.0;
  }
  void fine()
  {
    double totalfine;
    int excessDays = d - 7;
    // if(d>1&&d<=5)
    // {
    //     totalfine= ((p*0.02*d) +(d-7)*f);
        
    // }
    // else if(d>5&&d<=10)
    // {
    //     totalfine= ((p*0.02*d) +(d-7)*f);
    // }
    // else
    // {
    //     totalfine= ((p*0.02*d) +(d-7)*f);
    // }
    if(excessDays>1&&excessDays<=5)
    {
        f = excessDays*2;
        
    }
    else if(excessDays>5&&excessDays<=10)
    {
        f = excessDays*3;
    }
    else
    {
        f = excessDays*5;
    }
      // System.out.println("Total fine:"+totalfine);
  }
  void display()
  {
      show();
      System.out.println("No.days late:"+(d-7));
      fine();
      System.out.println("Fine:"+f);
      double totalAmount = 0;
      if(d >= 1 && d <= 7){
        totalAmount = d * 0.02;
      } else {
        totalAmount = 7 * 0.02 + f;
      }
      System.out.println("Total amount payable: " + totalAmount);
  }
}

// Scored - 10 points
class Isc2009
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name of book");
    String name= sc.nextLine();
    System.out.println("Enter name of author");
    String author= sc.nextLine();
    System.out.println("Enter price of the book");
    double price= sc.nextDouble();
    System.out.println("Enter the no. of days after which book was returned");
    int days= sc.nextInt();
    // System.out.println("Enter the fine");
    // double fines= sc.nextDouble();
    // Compute obj = new Compute(name,author,price,days,fines);
    Compute obj = new Compute(name,author,price,days);
    obj.display();
  }
}

