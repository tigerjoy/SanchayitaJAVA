import java.util.Scanner;
class ProductOfDigits
{
  int product(int num)
  {
    if(num<10)
    {
      return num;
    }
    else
    {
      return ((num%10)*product(num/10));
    }
  }
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    ProductOfDigits obj = new ProductOfDigits();
    System.out.println("Enter the number");
    int num = sc.nextInt();
    // Product of digits of 17 is 7
    System.out.println("Product of digits of "+num+" is "+obj.product(num));
  }
}