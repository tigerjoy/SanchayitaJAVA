import java.util.Scanner;
class DecToHex
{
  String dec2hex(int num)
  {
    int rem = num%16;
    if(num==0)
    {
      return "0";
    }
    else if(rem<=9)
    {
      return dec2hex(num/16)+(num%16)+"";
    }
    else 
    {
      return dec2hex(num/16)+(char)(num%16+55)+"";
    }
  }
  
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    DecToHex obj = new DecToHex();
    System.out.print("Enter the number : ");
    int num = sc.nextInt();
    // (1998)10 = (07CE)16
    System.out.printf("(%d)10 = (%S)16",num,obj.dec2hex(num));
  }
}