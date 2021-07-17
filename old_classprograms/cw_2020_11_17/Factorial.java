import java.util.Scanner;
class Factorial
{
  int fact(int num)
  {
    // Base case
    if(num == 1){
      return 1;
    }
    // Recursive case
    else {
      return num * fact(num - 1);
    }
  }
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    Factorial obj = new Factorial();
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    System.out.println(num + "! = " + obj.fact(num));
  }
}