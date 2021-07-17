import java.util.Scanner;
class Sum
{
  int sumNatural(int num)
  {
    if(num==1)
    {
      return 1;
    }
    else
    {
      return num+sumNatural(num-1);
    }
  }
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    Sum obj = new Sum();
    System.out.println("Enter the number");
    int num = sc.nextInt();
    // Sum of 5 natural numbers is 15
    System.out.println("Sum of "+num+" natural numbers is "+obj.sumNatural(num));
  }
}