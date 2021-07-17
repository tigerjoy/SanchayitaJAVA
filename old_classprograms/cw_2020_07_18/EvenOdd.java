import java.util.Scanner;
class EvenOdd
{
  public static void main(String[]args)
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("N = ");
      int N = sc.nextInt();
      int mask = 1;
      if((N & mask)==0)
      {
        System.out.println("EVEN ");
      }
      else
      {
        System.out.println("ODD");
      }
  }
}