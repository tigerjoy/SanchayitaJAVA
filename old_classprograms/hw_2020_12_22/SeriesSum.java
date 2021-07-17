import java.util.Scanner;
public class SeriesSum 
{
    static Scanner sc = new Scanner(System.in);
    int x;
    int n;
    double sum;
    SeriesSum(int xx,int nn)
    {
        x= xx;
        n = nn;
        sum = 0.0;
    }
    double findfact(int m)
    {
    // Base case
    if(m == 0){
      return 1.0;
    }
    // Recursive case
    else {
      return m * findfact(m - 1);
        }
    }
    double findpower(int x , int y)
  {
    if(y==0)
    {
      return 1;
    }
    else
    {
      return x * findpower(x,y-1);
    }
  }
    void calculate()
    {
        for(int i = 2;i<=n;i+=2)
        {
            sum+= findpower(x,i)/findfact(i-1);
        }
    }
    void display()
    {
        System.out.println("The sum is "+ sum);
    }
    public static void main(String[] args) 
    {
        System.out.println("Enter the value of x");
        int X = sc.nextInt();
        System.out.println("Enter the number of terms");
        int N = sc.nextInt();
        SeriesSum obj = new SeriesSum(X,N);
        obj.calculate();
        obj.display();
    }
}
