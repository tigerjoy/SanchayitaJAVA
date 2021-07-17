import java.util.Scanner;
class PrimePal
{
    boolean checkPrime( int num)
    {
        int fact = 0;
        for (int i = 1; i<= num;i++)
        {
            if (num % i == 0)
            {
                fact++;
            }
        }
        if ( fact == 2)
        {
            return true;
        }
        else 
            return false;
    }  
    int reverse( int num)
    {
        int rev= 0;
        while (num>0)
        {
            int dig = num% 10;
            rev= ( rev*10)+ dig ;
            num= num/10;
        }
        return rev;
    }
    boolean checkPalindrome( int num)
    {
        int rev = reverse( num);
        boolean r = rev == num;
        return r ;
    }
    public static void main(String[]args)
    {
       PrimePal obj = new PrimePal ();
       Scanner sc = new Scanner ( System.in);
       System.out.print(" m =");
       int m = sc.nextInt();
       System.out.print(" n =");
       int n = sc.nextInt();
       //if(m<3000 && m<3000)
       if(m < 3000 && n < 3000)
       {
           int count = 0;
           System.out.println("THE PRIME PALINDROME INTEGERS ARE :");
       for(int i = m; i<= n; i++)
       {
           
           if ((obj.checkPalindrome(i) == true)&&(obj.checkPrime(i)==true))
            {
               count++;
               System.out.print(i +",");
            }
        }
       System.out.println("");
       System.out.println("FREQUENCY OF PRIME PALINDROME INTEGERS : "+count);
       }
       
       else
        {
         System.out.println("OUT OF RANGE");
        }
       
    }
}