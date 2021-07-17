import java.util.Scanner;
class Array2
{
  static Scanner sc = new Scanner(System.in); 
  void input(int arr[])
  {
    int size = arr.length;
    for(int i = 0;i<=size-1;i++)
    {
      System.out.println("Enter the "+(i+1)+ "th element");
      arr[i] = sc.nextInt();
    }
  }
  void displayRev(int arr[],int i)
  {
    if(i<0)
    {
    }
    else
    {
      System.out.print(arr[i]+ ",");
      displayRev(arr,i-1);
    }
  }
  public static void main(String []args)
  {
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int arr[] = new int[size];
    Array2 obj = new Array2();
    obj.input(arr);
    System.out.println("The elements of the array are");
    obj.displayRev(arr,arr.length-1);
  }
}