import java.util.Scanner;
class DeciOct
{
  int n; 
  int oct;
  DeciOct()
  {
    n = 0;
    oct = 0;
  }
  void getnum(int nn)
  {
    n = nn;
  }
  void deci_oct()
  {
    if(n==0)
    {}
    else
    {
      int dig = n%8;
      n = n/8;
      if(oct == 0){
        oct = dig;
      }else{
        oct = Integer.parseInt(dig+ ""+ oct);
      }
      deci_oct();
    }
  }
  void show()
  {
    System.out.println("DECIMAL NUMBER : "+n );
    deci_oct();
    System.out.println("OCTAL NUMBER : "+oct);
  }
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num  = sc.nextInt();
    DeciOct obj = new DeciOct();
    obj.getnum(num);
    obj.show();
  }
}