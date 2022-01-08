// Scored - 10 points
import java.util.Scanner;
public class Account
{
  static Scanner sc = new Scanner(System.in);
  String Name;
  String Pan;
  double Principal;
  String acc_no;
  
 Account(String Name, String Pan,double Principal, String acc_no)
  {
  this.Name= Name;
  this.Pan= Pan;
  this.Principal= Principal;
  this.acc_no=acc_no;
   
  }
 void display()
 {
     System.out.println("Name :"+Name);
     System.out.println("Pan :"+Pan);
     System.out.println("Principal :"+Principal);
     System.out.println("Account Number :"+acc_no);
     
     
      
 }
}

class Simple extends Account
{
  double time;
  double rate;
  double interest;
  Simple(String Name, String Pan,double Principal,String acc_no,double time, double rate)
  {
      super(Name, Pan, Principal, acc_no);
      this.time= time;
      this.rate= rate;
      this.interest=0.0;
  }
  void calculate()
  {
      interest = (time*rate*Principal/100.0);
  }
   void show()
  {
      super.display();
      System.out.println("Time: "+time);
      System.out.println("Rate: "+rate);
      System.out.println("Interst: "+interest);
      
      
      
     
  }
}

class SpIsc2016
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Name");
    String name = sc.nextLine();
    System.out.println("Enter Pan");
     String Pan = sc.nextLine();
    sc.nextLine();
    System.out.println("Enter Principal");
     double Principal = sc.nextDouble();
    System.out.println("Enter Account Number");
     String acc_no = sc.nextLine();
     sc.nextLine();
    System.out.println("Enter time");
    double time = sc.nextDouble();
    System.out.println("Enter Rate");
    double rate = sc.nextDouble();
    Simple obj = new Simple(name,Pan,Principal,acc_no,time,rate);
    obj.show();
  }
}




