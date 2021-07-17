import java.util.Scanner;
public class ISBNCODE
{
   boolean checkLength(String ISBN)
   {
       int n = ISBN.length();
       if(n!=10)
       {
           return false;
       }
       else
       {
           return true;
       }
       
   }
   int findSum(String ISBN)
   {
       int sum = 0;
       for(int i = 0;i<9;i++)
       {
           int dig = ISBN.charAt(i)-'0';
           if(0>dig||9<dig)
           {
               
           }
           sum = sum +(dig*(10-i));
       }
       char last = ISBN.charAt(9);
       if(last!='X'&&('0'>last||'9'<last))
           {
               
           }
       else
       {
            if(last == 'X')
            {
                sum = sum +10;
            }
            else
            {
                sum = sum + last -'0';
            }
       }
       return sum;
   }
   boolean checkValidity(String ISBN)
   {
       if(findSum(ISBN)%11==0)
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
        ISBNCODE obj = new ISBNCODE();
        System.out.print("INPUT CODE  : ");
        String code = sc.nextLine();
        System.out.print("OUTPUT      : ");
       if (obj.checkLength(code))
       {
           int sum = obj.findSum(code);
           System.out.println("SUM  = "+sum);
           if(obj.checkValidity(code))
           {
               System.out.println("              LEAVES NO REMAINDER - VALID ISBN CODE");
           }
           else
           {
               System.out.println("              LEAVES REMAINDER - INVALID ISBN CODE");
           }
       }
       else
       {
           System.out.println("INVALID INPUT");
       }
        
    }
    
}
