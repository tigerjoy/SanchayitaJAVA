import java.util.Scanner;
 class Number
{
  int n;
  
 Number(int nn)
  {
   n=nn;
  }
  int factorial(int a)
  {
    if(a == 1){
      return 1;
    }
    // Recursive case
    else {
      return a * factorial(a - 1);
    }
      
   }
 void display()
 {
    System.out.println("N ="+n);
 }
}

class Series extends Number
{
  int sum;
  Series(int nn)
  {
    super(nn);
    this.sum=0;
    
  }
  void calsum()
  {
      for(int i=1;i<=n;i++)
      {
      sum+=factorial(i);
     }
  }
   void display()
  {
      super.display();
      calsum();
      System.out.println("Sum :"+sum);
     
  }
}
class Isc2018
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number ");
    int num = sc.nextInt();
    Series obj = new Series(num);
    obj.display();
  }
}



