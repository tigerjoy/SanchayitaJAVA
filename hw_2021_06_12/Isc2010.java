import java.util.Scanner;
class Worker 
{
  String name;
  double basic;
  
  // Worker()
  // {
  //   name="";
  //   basic=0.0;
  // }
  Worker(String name, double basic)
  {
    this.name = name;
    this.basic = basic;
   
  }
  void display()
  {
    System.out.println("Name: " + name);
    System.out.println("Basic Salary: "+basic);
  }
}

class Wages extends Worker
{
  double hrs;
  double rate;
  double wage;
  Wages(String name, double basic , double hrs, double rate)
  {
    super(name,basic);
    this.hrs = hrs;
    this.rate = rate;
    this.wage= 0.0;
  }
  double overtime()
  {
      double pay = hrs*rate;
      return pay;
  }
  void display()
  {
      super.display();
      wage = overtime()+basic;
      System.out.println("Wage:"+wage);
  }
}

class Isc2010
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name ");
    String name= sc.nextLine();
    System.out.println("Enter basic wage");
    double basic= sc.nextDouble();
    System.out.println("Extra hours");
    double hrs= sc.nextDouble();
    System.out.println("Enter the rate");
    double rate= sc.nextInt();
    // System.out.println("Enter the wage");
    // double wage= sc.nextDouble();
    Wages obj = new Wages(name,basic,hrs,rate);
    obj.display();
  }
}


