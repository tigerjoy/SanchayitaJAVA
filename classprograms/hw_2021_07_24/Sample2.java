import java.util.Scanner;
// Scored - 7 points
public class Salesman 
{
  String name;
  String address;
  
 Salesman()
  {
   name="";
   address="";
  }
 void readDetails(String n, String ad)
 {
     n = name;
     ad = address;
 }
 void show()
 {
    System.out.println("Name: " + name);
    System.out.println("Address: "+address);
 }
}

class Sales extends Salesman
{
  int billno;
  int qty;
  double price;
  double psales;
  String pname;
  
  void readDetails(int b, int q, double p,double s, String pr)
  {
      this.billno = b;
      this.qty = q;
      this.price =p;
      this.psales = s;
      this.pname = pr;
  }
  double calculate()
  {
      // OBSERVATION #1
      // Did you try to compile this program?
      // return p*qty+psales;
      return price*qty+psales;
  }
   void show()
  {
      super.show();
      // OBSERVATION #2
      // Did you try to compile this program?
      // compute();
      System.out.println("Total amount:"+calculate()); 
  }
}

class Sample2
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name ");
    String name= sc.nextLine();
    System.out.println("Enter Address");
    String address= sc.nextLine();
    System.out.println("Enter   Bill Number");
    int billno= sc.nextInt();
    System.out.println("Enter Quantity");
    double qty= sc.nextDouble();
    System.out.println("Enter Price");
    double pr = sc.nextDouble();
    System.out.println("Enter Sales");
    double  sales= sc.nextDouble();

    Sales obj = new Sales(billno,qty,pr,sales,name);
    obj.show();
  }
}



