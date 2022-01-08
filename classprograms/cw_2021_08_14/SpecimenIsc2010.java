import java.util.Scanner;
class Personal
{
  String Name;
  String Pan;
  double basic_pay;
  String acc_no;
  
  Personal(String Name,String Pan,double basic_pay,String acc_no)
  {
    this.Name= Name;
    this.Pan=Pan;
    this.basic_pay=basic_pay;
    this.acc_no=acc_no;
  }
  void display()
  {
    System.out.println("Name :"+Name);
    System.out.println("Pan :"+Pan);
    System.out.println("Basic Pay :"+basic_pay);
    System.out.println("Account Number :"+acc_no);
  }
}
class Retire extends Personal
{
  int Yrs;
  double Pf;
  double Grat;
  
  Retire(String Name,String Pan,double basic_pay,String acc_no,int Yrs)
  {
    super(Name,Pan,basic_pay,acc_no);
    this.Yrs = Yrs;
    this.Pf=0.0;
    this.Grat=0.0;
  }
  void provident()
  {
    Pf=0.02*basic_pay*Yrs;
  }
  void gratuity()
  {
    if(Yrs>=10)
    {
      Grat=basic_pay*12;
    }
    else
    {
      Grat=0.0;
    }
  }
  // Displays  the  employee  details  along  with  the  PF    (Provident  Fund)  and  gratuity amount. 
  void display()
  {
    super.display();
    System.out.println("Provident Fund:"+Pf);
    System.out.println("Gratuity:"+Grat);
  }
}
class SpecimenIsc2010
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Name :");
    String name = sc.nextLine();
    System.out.println("Enter Pan :");
    String pan = sc.nextLine();
    System.out.println("Enter Basic Pay :");
    double bp = sc.nextDouble();
    sc.nextLine();
    System.out.println("Enter Account Number :");
    String acc_no=sc.nextLine();
    System.out.println("Enter Year :");
    int Yrs = sc.nextInt();
    Retire obj = new Retire(name,pan,bp,acc_no,Yrs);
    obj.provident();
    obj.gratuity();
    obj.display();
    
  }
}