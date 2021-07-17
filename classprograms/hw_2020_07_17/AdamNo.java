import java.util.Scanner;
public class AdamNo 
{
    boolean checkPrime(int num)
    {
        if(num==1)
        {
            return false;
        }
        else
        {
            int factor;
            for(factor = 2; factor<=num;factor++)
            {
                if(num%factor==0)
                {
                    break;
                }
            }
            if (factor==num)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
    int reverse(int num)
    {
        String Num = Integer.toString(num);
        String rev ="";
        for(int i = Num.length()-1;i>=0;i--)
        {
            rev = rev + Num.charAt(i);
        }
        int f_rev = Integer.parseInt(rev);
        return f_rev;
    }
    boolean checkAdam(int i)
    {
       int rev = reverse(i);
       if(rev*rev == reverse(i*i))
       {
           return true;
       }
       else
       {
          return false;
       }
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        AdamNo obj = new AdamNo();
        System.out.print("m = ");
        int m = sc.nextInt();
        System.out.print(" n = ");
        int n = sc.nextInt();
        if(m<n)
        {
            int count = 0;
            String nos ="";
            for(int i = m ;i<= n ;i++)
            {
                if(obj.checkPrime(i)&&obj.checkAdam(i))
                {
                     nos = nos + i +" ";
                     count++;
                }
            }
            if(count>0)
            {
                System.out.println("THE PRIME-ADAM INTEGERS ARE :");
                System.out.println(nos);
                System.out.println("FREQUENCY OF PRIME-ADAM INTEGERS IS :"+count);
            }
            if(count==0)
            {
                System.out.println("THE PRIME-ADAM INTEGERS ARE :");
                System.out.println("NIL");
                System.out.println("FREQUENCY OF PRIME-ADAM INTEGERS IS : 0 ");
            }
        }
        else
        {
            System.out.println("INVALID INPUT.");
        }
        
    }
}
