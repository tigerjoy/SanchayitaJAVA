import java.util.Scanner;
public class Palin 
{
    static Scanner sc = new Scanner(System.in);
    int num;
    int revnum;
    Palin()
    {
        num= 0;
        revnum = 0;
    }
    void accept()
    {
        System.out.println(" Enter the number");
        num= sc.nextInt();
    }
    /*
    int reverse(int y)
    {
      if(y<10)
      {
        return y;
      }
      else
      {
        int x = (int)(Math.log10(y));
        return ((y%10)*(int)(Math.pow(10,x))+reverse(y/10));
      }
    }
    */
    int reverse(int y)
    {
      if(y == 0)
      {
        return revnum;
      }
      else
      {
        int dig = y % 10;
        revnum = (revnum * 10) + dig;
        y = y / 10;
        return reverse(y);
      }
    }
    void check()
    {
        if(num==reverse(num))
        {
            System.out.println(num+" is a Palindrome number");
        }
        else
        {
            System.out.println(num+" is not a Palindrome number");
        }
    }
    public static void main(String[] args) 
    {
        Palin obj = new Palin();
        obj.accept();
        obj.check();
    }
}
