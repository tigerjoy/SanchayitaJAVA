import java.util.Scanner;
class DecToBin
{
  String dec2bin(int num)
  {
    if(num==0)
    {
      return "0";
    }
    else
    {
      return dec2bin(num/2)+(num%2)+"";
    }
  }
  
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    DecToBin obj = new DecToBin();
    System.out.print("Enter the number : ");
    int num = sc.nextInt();
    // (5)10 = (0101)2
    System.out.printf("(%d)10 = (%S)2",num,obj.dec2bin(num));
  }
}