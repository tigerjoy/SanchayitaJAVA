import java.util.Scanner;
class Factorial
{
  void recFact(int num, int fact, int i)
  {
    if(i < 1)
    {
      System.out.println(num + "! = " + fact);
    }
    else
    {
      fact = fact * i;
      i--;
      recFact(num, fact, i);
    }
  }
  
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    Factorial obj = new Factorial();
    System.out.print("Enter the number : ");
    int num = sc.nextInt();
    obj.recFact(num, 1, num);
  }
}