import java.util.Scanner;
class ArrangeNum
{
  static Scanner sc = new Scanner(System.in);
  int n;
  int s[];
  ArrangeNum(int nn)
  {
    n=nn;
    s = new int[(Integer.toString(n)).length()];
  }
  void fillarray()
  {
    int index = 0;
    int k = n;
    while(k!=0)
    {
      int dig = k%10;
      s[index]=dig;
       k/=10;
       index++;
    }
  }
  void arrange()
  {
    fillarray();
    int k = s.length;
    for(int i = 0;i<=k-2;i++)
    {
      for(int j = 0;j<=k-2-i;j++)
      {
        if(s[j]>s[j+1])
        {
          int temp = s[j];
          s[j]=s[j+1];
          s[j+1]=temp;
        }
      }
    }
  }
  void show()
  {
    System.out.println("ORIGINAL NUMBER :"+n);
    System.out.print("SORTED NUMBER :");
    arrange();
    for(int i = 0;i<=s.length-1;i++)
    {
      System.out.print(s[i]);
    }
  }
  public static void main(String[]args)
  {
    System.out.println("Enter an integer");
    int Num = sc.nextInt();
    ArrangeNum obj = new ArrangeNum(Num);
    obj.show();
  }
}