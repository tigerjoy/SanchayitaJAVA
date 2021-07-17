import java.util.Scanner;
public class Disarium 
{
    static Scanner sc = new Scanner(System.in);
    int num ;
    int size ;
    Disarium(int nn )
    {
        num = nn;
        size = 0;
    }
    //void countDig(int num)
    void countDig()
    {
      int temp = num;
     //int c=0;
     size = 0;
     while(temp!=0)
     {
         int dig = temp%10;
         //c++;
         size++;
         temp/=10;
     }
     //size = c;
    }
    int sumofDigits(int n , int p)
   {
    //if(n==0)
    if(n<10)
    {
      // return 0;
      return n;
    }
    else
    {
      return (int)(Math.pow((n%10), p)+sumofDigits((n/10), --p));
    }
  }
    void check()
    {
        if(num==sumofDigits(num,size))
        {
            System.out.println(num+" is a Disarium number");
        }
        else
        {
            System.out.println(" It is not a Disarium number");
        }
    }
    public static void main(String[] args) 
    {
        System.out.println("Enter the number");
        int num = sc.nextInt();
        Disarium obj = new Disarium(num);
        //obj.countDig(num);
        obj.countDig();
        obj.check();
    }
    
}
