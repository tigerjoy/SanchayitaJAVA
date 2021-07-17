import java.util.Scanner;
class Power
{
  int pow(int a , int b)
  {
    if(b==0)
    {
      return 1;
    }
    else
    {
      return a * pow(a,b-1);
    }
  }
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    Power obj = new Power();
    System.out.println("Enter the base");
    int a = sc.nextInt();
    System.out.println("Enter the index");
    int b = sc.nextInt();
    // 2 ^ 3 = 8
    System.out.println(a+"^"+b+"="+obj.pow(a,b));
  }
}