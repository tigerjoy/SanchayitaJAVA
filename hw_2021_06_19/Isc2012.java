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
    System.out.println("Telno : " + telno);
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
    this.rent = 0.0;
    
  }
  void cal()
  {
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
  void display()
  {
      show();
      System.out.println("No.of calls:"+(n));
      cal();
      System.out.println("Total Amount payable:"+amt);
      
  }
}

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


