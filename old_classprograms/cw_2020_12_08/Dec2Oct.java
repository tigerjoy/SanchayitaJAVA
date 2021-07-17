import java.util.Scanner;
class DecToOct
{
  String dec2oct(int num)
  {
    if(num==0)
    {
      return "0";
    }
    else
    {
      return dec2oct(num/8)+(num%8)+"";
    }
  }
  
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    DecToOct obj = new DecToBin();
    System.out.print("Enter the number : ");
    int num = sc.nextInt();
    // (5)10 = (0101)2
    System.out.printf("(%d)10 = (%S)2",num,obj.dec2bin(num));
  }
}