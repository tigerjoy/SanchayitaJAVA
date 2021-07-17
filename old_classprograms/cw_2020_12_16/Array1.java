import java.util.Scanner;
class Array1
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
  void displayRec(int arr[],int i)
  {
    if(i==arr.length)
    {
    }
    else
    {
      System.out.print(arr[i]+ ",");
      displayRec(arr,i+1);
    }
  }
  public static void main(String []args)
  {
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int arr[] = new int[size];
    Array1 obj = new Array1();
    obj.input(arr);
    System.out.println("The elements of the array are");
    obj.displayRec(arr,0);
  }
}