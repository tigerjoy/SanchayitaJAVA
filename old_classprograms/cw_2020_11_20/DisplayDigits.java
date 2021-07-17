import java.util.Scanner;
class DisplayDigits
{
  void displayDigits(int num)
  {
    if(num == 0){
      return;
    } else {
      displayDigits(num / 10);
      System.out.println(num % 10);
    }
  }
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    DisplayDigits obj = new DisplayDigits();
    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    System.out.println("The digits of " + num + " are");
    obj.displayDigits(num);
  }
}