import java.util.Scanner;
class Prime
{
  boolean isPrime(int num , int f)
  {
    if(num==1)
    {
      return false;
    }
    // If f is a factor of num
    else if(num%f==0)
    {
      if(f==num)
      {
        return true;
      }
      else
      {
        return false;
      }
    }
    // If f is not a factor of num
    else
    {
      return isPrime(num,f+1);
    }
  }
  // Alternative of isPrime()
  boolean isPrime2(int num, int f)
  {
    if(num == f)
    {
      return true;
    }
    else if(num % f == 0 || num == 1)
    {
      return false;
    }
    else 
    {
      return isPrime2(num, f+1);
    }
  }
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    Prime obj = new Prime();
    System.out.print("Enter the number : ");
    int num = sc.nextInt();  
    // if(obj.isPrime(num, 2))
    if(obj.isPrime2(num, 2))
    {
      System.out.println(num + " is a prime number");
    }
    else 
    {
      System.out.println(num + " is not a prime number");
    }
  }
}