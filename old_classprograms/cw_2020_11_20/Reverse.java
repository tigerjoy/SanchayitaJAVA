import java.util.Scanner;
class Reverse
{
  int reverseDig(int num)
  {
    if(num<10)
    {
      return num;
    }
    else
    {
      int x = (int)(Math.log10(num));
      return ((num%10)*(int)(Math.pow(10,x))+reverseDig(num/10));
    }
  }
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    Reverse obj = new Reverse();
    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    System.out.print("The reverse of " + num + " is ");
    System.out.println(obj.reverseDig(num));
  }
}