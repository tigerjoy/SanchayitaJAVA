import java.util.Scanner;
class CompositeMagicNo
{
   
    
    boolean checkComposite(int num)
    {
        int count = 0 ;
        for(int i = 1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        if(count>2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    boolean checkMagic(int num)
    {
         int sum = 0;
         while(num>9)
         {
             sum = num;
             int s = 0;
             while(sum!=0)
             {
               s+=sum%10;
               sum/=10;
             }
             num = s;
         }
         return (num==1);
    }
   
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         CompositeMagicNo obj = new  CompositeMagicNo();
         System.out.print(" m   = ");
        int m = sc.nextInt();
        System.out.print(" n  = ");
        int n = sc.nextInt();
        
        if(m<n)
        {
            int cnt = 0;
            System.out.print("THE COMPOSITE MAGIC INTEGERS ARE :");
            
            for(int i = m;i<=n;i++)
            {
                if(obj.checkComposite(i)&&obj.checkMagic(i))
                {
                   
                    System.out.print( i +" , ");
                    cnt+=1;
                }
            }
            System.out.println("");
            System.out.print("FREQUENCY OF COMPOSITE MAGIC INTEGERS IS : " + cnt);
            
        }
        else
        {
            System.out.println("INVALID INPUT.");
        }
        
        
        
    }
}