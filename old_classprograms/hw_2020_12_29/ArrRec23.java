import java.util.Scanner;
public class ArrRec23 
{
    static Scanner sc = new Scanner(System.in);
    String arr[] = {"Zero","One", "Two" , "Three" , "Four" , "Five" , "Six","Seven","Eight","Nine"};
   void displayDigits(int num)
   {
     if(num == 0)
     {
        return;
     } 
     else 
     {
      displayDigits(num / 10);
      System.out.print(arr[num % 10]+" ");
     }
   }
    
    public static void main(String[] args) 
    {
        System.out.println("Enter the number");;
        int num= sc.nextInt();
        ArrRec23 obj = new ArrRec23();
        obj.displayDigits(num);
    }
}
