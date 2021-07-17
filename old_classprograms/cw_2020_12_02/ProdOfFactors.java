import java.util.Scanner;
class ProdOfFactors
{
  int productOfFact(int num, int f)
  {
    // If all factors have been found
    if(f>num)
    {
      return 1;
    }
    // If f is a factor of num
    else if(num%f==0)
    {
      return f * productOfFact(num,f+1);
    }
    // If f is not a factor of num
    else
    {
      return productOfFact(num,f+1);
    }
  }
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    ProdOfFactors obj = new ProdOfFactors();
    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    System.out.print("The product of factors of " + num + " are ");
    System.out.println(obj.productOfFact(num,1));
  }
}