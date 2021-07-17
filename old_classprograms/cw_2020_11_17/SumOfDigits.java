import java.util.Scanner;
class SumOfDigits
{
  int sum(int num)
  {
    if(num==0)
    {
      return 0;
    }
    else
    {
      return ((num%10)+sum(num/10));
    }
  }
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    SumOfDigits obj = new  SumOfDigits();
    System.out.println("Enter the number");
    int num = sc.nextInt();
    // Sum of digits of 17 is 8
    System.out.println("Sum of digits of "+num+" is "+obj.sum(num));
  }
}