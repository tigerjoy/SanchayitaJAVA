// Scored - 9 points
import java.util.Scanner;
public class PrimeFac 
{
    static Scanner sc = new Scanner(System.in);
    int num[];
    int freq[];
    PrimeFac()
    {
        num= new int[50];
        freq=new int[50];
    }
    void enter()
    {
        for(int i=0;i<50;i++)
        {
        System.out.println("Enter elements "+(i+1));
        num[i]=sc.nextInt();
        }
    }
    void frefac()
    {
        int fact ;
        int temp;
        int counter;
        for(int i=0;i<50;i++)
        {
            fact=0;
            temp=num[i];
        for (int j = 1;j<= temp;j++)
        {
            counter=0;
            if (num[i]%j == 0)
            {
               
                for(int p=1;p<=j;p++)
                {
                    if(j%p==0)
                    {
                        counter++;
                    }
                }
                if(counter==2)
                {
                fact++;
                // OBSERVATION #2
                // What is the purpose of doing this?
                temp/=j;
                }
                
            }
        }
        freq[i]=fact;
        }
    }
    void disp()
    {
        for(int i =0;i<5;i++)
        {
            System.out.println(num[i]+"->"+freq[i]);
        }
    }
    public static void main(String[] args) 
    {
        PrimeFac obj = new PrimeFac();
        obj.enter();
        obj.frefac();
        obj.disp();
        
    }
}
