import java.util.Scanner;
public class Happy 
{
    static Scanner sc = new Scanner(System.in);
    int n;
    Happy()
    {
        n =0;
    }
    void getnum(int nn)
    {
       n = nn;
    }
    int sum_sq_digits(int x)
    {
        if(x==0)//base case
        {
            return  0;
        }
        else // recursive case
        {
            int dig = x%10;
            return dig*dig +sum_sq_digits(x/10); //sum of square of digits
        }
    }
    void ishappy()
    {
        int sq_sum = sum_sq_digits(n);
        while(sq_sum>9)
        {
            sq_sum = sum_sq_digits(sq_sum);
        }
        if(sq_sum==1)
        {
            System.out.println(n +" is a HAPPY number");
        }
        else
        {
            System.out.println(n +" is an UNHAPPY number");
        }
    }
    public static void main(String[] args) 
    {
        Happy obj = new Happy();
        System.out.println("Enter a number");
        int num = sc.nextInt();
        obj.getnum(num);
        obj.ishappy();
    }
}
