import java.util.Scanner;
class Employee
{
  int empNo;
  String empName;
  String empDesig;
  
  Employee()
  {
    empNo=0;
    empName="";
    empDesig="";
  }
  Employee(int empNo, String empName , String empDesig)
  {
    this.empNo = empNo;
    this.empName = empName;
    this.empDesig = empDesig;
  }
  void display()
  {
    System.out.println("Employee Number: " + empNo);
    System.out.println("Employee Name: " + empName);     
    System.out.println("Employee Designation: " + empDesig);
  }
}

class Salary extends Employee
{
  float basic;
  Salary(int empNo, String empName , String empDesig, float basic)
  {
    super(empNo,empName,empDesig);
    this.basic = basic;
  }
  void calculate()
  {
    double da = (0.1*basic);
    double hra = (0.15*basic);
    double totalSalary = (da+hra+basic);
    double pf = (0.08*totalSalary);
    double netSalary= totalSalary-pf;
    display();
    System.out.println("NET SALARY :"+ netSalary);
  }
}

class Isc2008
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Employee Name");
    String name= sc.nextLine();
    System.out.println("Enter Employee Designation");
    String designation= sc.nextLine();
    System.out.println("Enter Employee Number");
    int number= sc.nextInt();
    System.out.println("Enter the basic salary");
    float salary= sc.nextFloat();
    Salary obj = new Salary(number, name,designation , salary);
    obj.calculate();
  }
}

