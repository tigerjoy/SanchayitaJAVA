import java.util.Scanner;
class Detail
{
  String name;
  String address;
  String telno;
  double rent;
  
  
  Detail(String name, String address ,String telno, double rent)
  {
    this.name = name;
    this.address = address;
    this.telno = telno;
    this.rent = rent;
  }
  void show()
  {
    System.out.println(" Name: " + name);
    System.out.println(" Address: " + address);     
    System.out.println(" Telno : " + telno);
    // OBSERVATION #1
    // Why did you skip displaying the rental charge?
    System.out.println(" Rental Charge: " + rent);
  }
}

class Bill extends Detail
{
  int n;
  double amt;
  Bill(String name, String address , String telno, double rent,int n)
  {
    super(name,address,telno,rent);
    this.n = n;
    // OBSERVATION #2
    // Where in the question is it mentioned that the 
    // monthly rental charge is 0?
    // this.rent = 0.0;
  }
  void cal()
  {
      // OBSERVATION #3
      // I understand that the number of calls range 
      // looks suspiciously similar to the Electricity
      // Bill program, therefore you have considered 
      // slabs while solving this program. Ask ma'am
      // to comment on this about how the range should
      // be taken.
      if(1<=n&&100>=n)
      {
          amt = rent;
      }
      else if(101<=n&&200>=n)
      {
          amt=((n-100)*0.60+rent);
      }
      else if(201<=n&&300>=n)
      {
          amt = 100*0.60+(n-200)*0.80+rent;
      }
      else
      {
          amt=100*0.60+100*0.8+(n-300)*1+rent;
      }
  }
  // OBSERVATION #4
  // What was the correct method name?
  // void display()
  void show()
  {
      super.show();
      System.out.println("No.of calls:"+(n));
      cal();
      System.out.println("Total Amount payable:"+amt);

  }
}

// Scored - 7 points
class Isc2012
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name ");
    String name= sc.nextLine();
    System.out.println("Enter address");
    String address= sc.nextLine();
    System.out.println("Enter telno");
    String telno = sc.nextLine();
     System.out.println("Enter rent");
    double rent= sc.nextDouble();
    System.out.println("Enter the no. of calls");
    int calls= sc.nextInt();
    Bill obj = new Bill(name,address,telno,rent);
    obj.display();
  }
}


