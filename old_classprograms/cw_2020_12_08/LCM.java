import java.util.Scanner;
class LCM
{
  int lcm(int a , int b , int f)
  {
    if(a==1&&b==1)
    {
      return 1;
    }
    else if(a%f==0&&b%f==0)
    {
      return f*lcm(a/f,b/f,f);
    }
    else if(a%f==0)
    {
      return f*lcm(a/f,b,f);
    }
    else if(b%f==0)
    {
      return f*lcm(a,b/f,f);
    }
    else
    {
      return lcm(a,b,f+1);
    }
  }
  
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    LCM obj = new LCM();
    System.out.print("Enter the first number : ");
    int num1 = sc.nextInt();
    System.out.print("Enter the second number: ");
    int num2 = sc.nextInt();
    System.out.print("LCM(" + num1 + ", " + num2 + ") = " + obj.lcm(num1,num2,2));
  }
}