import java.util.Scanner;
public class ArrayRec7 
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
  void display(int arr[],int i)
  {
    int size = arr.length;
    if(i==size)
    {
    }
    else if(arr[i]>10)
    {
      System.out.print(arr[i]+",");
      display(arr,i+1);
    }
    else
    {
      display(arr,i+1);
    }
  }
  public static void main(String []args)
  {
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int arr[] = new int[size];
    ArrayRec7 obj = new ArrayRec7();
    obj.input(arr);
    System.out.println("The elements of the array are");
    obj.display(arr,0);
  }
}
