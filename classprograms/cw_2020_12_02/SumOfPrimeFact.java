import java.util.Scanner;
class SumOfPrimeFact
{
  int sumOfPrimeFact(int num, int f)
  {
    // If all factors have been found
    if(num==1)
    {
      return 0;
    }
    // If f is a factor of num
    else if(num%f==0)
    {
      return f+sumOfPrimeFact(num/f,f); 
    }
    // If f is not a factor of num
    else
    {
      return sumOfPrimeFact(num,f+1);
    }
  }
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    SumOfPrimeFact obj = new SumOfPrimeFact();
    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    System.out.println("The sum of prime factors of " + num + " are ");
    System.out.println(obj.sumOfPrimeFact(num,2));
  }
}