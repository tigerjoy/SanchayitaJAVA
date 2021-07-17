import java.util.Scanner;
class Fibonacci
{
  long genFibo(int t)
  {
    if(t==0)
    {
      return 0;
    }
    else if(t==1)
    {
      return 1;
    }
    else
    {
      return genFibo(t-1)+genFibo(t-2);
    }
  }
  
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    Fibonacci obj = new Fibonacci();
    System.out.print("Enter the term: ");
    int t = sc.nextInt();
    System.out.print("The " + t + "th term of Fibonacci is ");
    System.out.println(obj.genFibo(t));
  }
}