import java.util.Scanner;
class DecimalToBinary
{
  String decToBinUnsigned(int num)
  {
    String bin = "";
    while(num != 0)
    {
      int dig = num % 2;
      bin = dig + bin;
      num /= 2;
    }
    return bin;
  }

  String decToBinSigned(int num)
  {
    String bin = "";
    int mask = 0x80000000;
    for(int i = 1; i <= 32; i++)
    {
      if((num & mask) != 0)
      {
        bin += "1";
      }
      else
      {
        bin += "0";
      }
      mask = mask >>> 1;
    }
    return bin;
  }

  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    DecimalToBinary obj = new DecimalToBinary();

    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    System.out.println("(" + num + ")10 = (" + obj.decToBinUnsigned(num) + ")2");

    System.out.println("(" + num + ")10 = (" + obj.decToBinSigned(num) + ")2");
  }
}