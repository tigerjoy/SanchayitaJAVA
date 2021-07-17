import java.util.Scanner;
class SmallestSum
{
    int sumOfDigit(int num)
    {
       int sum= 0;
       while (num!=0)
       {
           int dig = ( num% 10);
           sum= sum+dig;
           num=num/10;
        }
        return sum;
    }
    int countDigit(int num)
    {
        int count = 0;
        while(num!=0)
        {
            num=num/10;
            count++;
            
        }
        return count;
    }
    void checkNum(int M,int N)
    {
        for(int i = M+1;i<=10000;i++)
        {
            if(N==sumOfDigit(i))
            {
                System.out.println("The required number = "+i);
                System.out.println("Total number of digits = "+countDigit(i));
                break;
                
            }
           
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        SmallestSum obj = new SmallestSum();
        // System.out.println("Enter the value of M");
        System.out.print("M = ");
        int M = sc.nextInt();
        // System.out.println("Enter the value of N");
        System.out.print("N = ");
        int N = sc.nextInt();
        if((M<=99)||(M>=10001)||(N>=100))
        {
            System.out.println("INVALID INPUT");
        }
        else
        {
          obj.checkNum(M,N);
       }
    }
}