import java.util.Scanner;
class Isc2010Rec
{
    int n ;
    int k ;
    static Scanner sc = new Scanner(System.in);
    void read()
    {
        System.out.println("Enter the value of n");
         n = sc.nextInt();
        System.out.println("Enter the value of k");
         k = sc.nextInt();
    }
    int fact(int num)
    {
      // Base case
      if(num == 0)
      {
        return 1;
      }
      // Recursive case
      else
      {
        return num * fact(num - 1);
      }
    }
    double compute()
    {
         double output = fact(n)/(fact(k)*fact(n-k));
         return output;
    }
    void display()
    {
        System.out.println("The number of subsets are : "+compute());
    }
    public static void main(String[] args) 
    {
        Isc2010Rec obj = new Isc2010Rec();
        obj.read();
        obj.display();
        
    }
}