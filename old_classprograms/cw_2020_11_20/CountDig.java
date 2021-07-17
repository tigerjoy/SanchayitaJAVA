import java.util.Scanner;
class CountDig
{
  int countDig(int num)
  {
    if(num<10)
    {
      return 1;
    }
    else
    {
      return 1 +countDig(num/10);
    }
  }
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    CountDig obj = new CountDig();
    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    System.out.print("The number of digits of " + num + " are ");
    System.out.println(obj.countDig(num));
  }
}