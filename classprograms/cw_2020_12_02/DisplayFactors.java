import java.util.Scanner;
class DisplayFactors
{
  void displayFact(int num, int f)
  {
    // If all factors have been found
    if(f>num)
    {
    }
    // If f is a factor of num
    else if(num%f==0)
    {
      System.out.print(f + ",");
      displayFact(num,f+1); 
    }
    // If f is not a factor of num
    else
    {
       displayFact(num,f+1);
    }
  }
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    DisplayFactors obj = new DisplayFactors();
    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    System.out.println("The factors of " + num + " are ");
    obj.displayFact(num,1);
  }
}