import java.util.Scanner;
class PrimeFact
{
  void primeFact(int num, int f)
  {
    // If all factors have been found
    if(num==1)
    {
    }
    // If f is a factor of num
    else if(num%f==0)
    {
      System.out.print(f + ",");
      primeFact(num/f,f); 
    }
    // If f is not a factor of num
    else
    {
       primeFact(num,f+1);
    }
  }
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    PrimeFact obj = new PrimeFact();
    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    System.out.println("The prime factors of " + num + " are ");
    obj.primeFact(num,2);
  }
}