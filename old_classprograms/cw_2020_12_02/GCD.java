import java.util.Scanner;
class GCD
{
  int gcd(int dividend , int divisor)
  {
    int remainder = dividend % divisor;
    if(remainder==0)
    {
      return divisor;
    }
    else
    {
      return gcd(divisor,remainder);
    }
  }
  
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    GCD obj = new GCD();
    System.out.print("Enter the first number : ");
    int num1 = sc.nextInt();
    System.out.print("Enter the second number: ");
    int num2 = sc.nextInt();
    System.out.print("HCF(" + num1 + ", " + num2 + ") = " + obj.gcd(num1,num2));
  }
}