import java.util.Scanner;
public class Emirp 
{
    static Scanner sc = new Scanner(System.in);
    int n;
    int rev;
    int f ;
    Emirp(int nn)
    {
        n=nn;
        rev=0;
        f=2;
    }
    int isPrime(int x)
    {
        if(n==1)
        {
          return 0;
        }
        // If f is a factor of num
        else if(n%x==0)
        {
          if(n==x)
          {
            return 1;
          }
          else
          {
            return 0;
          }
        }
        // If f is not a factor of num
        else
        {
          return isPrime(x+1);
        }
  }
    void isEmirp()
    {
        int temp = n;
        int copy = n;
        while(temp>0) //Reversing the number
        {
            int dig = temp%10;
            rev = rev*10+dig;
            temp = temp/10;
        }
        int a = isPrime(f);//checking if original is prime
        n=rev;
        f=2;
        int b = isPrime(f);//checking if reverse is prime
        if((a==1)&&(b==1)) //checking if both are primes
        {
            System.out.println(copy+" and "+rev+" are EMIRP numbers.");
        }
        else
        {
            System.out.println(copy+" and "+rev+" are not EMIRP numbers.");
        }
    }
    public static void main(String[] args) 
    {
        System.out.println("Enter any number");
        int num = sc.nextInt();
        Emirp obj = new Emirp(num);
        obj.isEmirp();
    }
    }
