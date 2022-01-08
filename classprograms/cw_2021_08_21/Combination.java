import java.util.Scanner;
class Combination
{
  String dec2bin(int num, int digits)
  {
    String bin="";
    while(num!=0)
    {
      int rem = num%2;
      bin = rem+bin;
      num/=2;
    }
    return String.format("%" + digits + "s", bin).
           replace(" ", "0");
  }
  void map(String str, int num)
  {
    int n = str.length();
    String bin = dec2bin(num, n);
    for(int i=0;i<n;i++)
    {
      if(bin.charAt(i)=='1')
      {
        System.out.print(str.charAt(i));
      }
    }
    System.out.println();
  }
  void genCombinations(String str)
  {
    int n = str.length();
    int size = (int)(Math.pow(2,n));
    for(int i = 0;i<size;i++)
    {
      map(str,i);
    }
  }
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a word");
    String word = sc.next();
    Combination obj = new Combination();
    obj.genCombinations(word);
  }
}