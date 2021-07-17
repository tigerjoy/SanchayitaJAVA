import java.util.Scanner;
class Product
{
  int productNatural(int num)
  {
    if(num==1)
    {
      return 1;
    }
    else
    {
      return num*productNatural(num-1);
    }
  }
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    Product obj = new Product();
    System.out.println("Enter the number");
    int num = sc.nextInt();
    // Product of 5 natural numbers is 120
    System.out.println("Product of "+num+" natural numbers is "+obj.productNatural(num));
  }
}