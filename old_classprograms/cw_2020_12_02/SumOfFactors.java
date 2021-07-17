import java.util.Scanner;
class SumOfFactors
{
  int sumOfFact(int num, int f)
  {
    // If all factors have been found
    if(f>num)
    {
      return 0;
    }
    // If f is a factor of num
    else if(num%f==0)
    {
      return f + sumOfFact(num,f+1);
    }
    // If f is not a factor of num
    else
    {
      return sumOfFact(num,f+1);
    }
  }
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    SumOfFactors obj = new SumOfFactors();
    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    System.out.print("The sum of factors of " + num + " are ");
    System.out.println(obj.sumOfFact(num,1));
  }
}