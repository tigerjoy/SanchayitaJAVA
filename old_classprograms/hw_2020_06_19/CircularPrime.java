import java.util.Scanner;
class CircularPrime
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
    int getNum(String str,int size)
    {
        
        String final_str= str.substring(1,size)+str.charAt(0);
        int final_num = Integer.parseInt(final_str);
        return final_num;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        CircularPrime obj = new CircularPrime();
        System.out.print(" N = ");
        int num = sc.nextInt();
        if(!obj.checkPrime(num))
        {
            System.out.println(num + " IS NOT A CIRCULAR PRIME ");
        }
        else
        {
            System.out.println(num);
             String str = Integer.toString(num);
            int count = 0;
            for(int i = 0;i<str.length()-1;i++)
            {
                
                int size = str.length();
                int new_num=obj.getNum(str, size);
                System.out.print(new_num);
                if(obj.checkPrime(new_num))
                {
                    System.out.println();
                    count++;
                    str = Integer.toString(new_num);
                }
                else
                {
                    System.out.println();
                    System.out.println(num + " IS NOT CIRCULAR PRIME");
                    break;
                }
            }
            if(count==str.length()-1)
            {
                System.out.println(num + " IS CIRCULAR PRIME");
            }
        }
    }
}