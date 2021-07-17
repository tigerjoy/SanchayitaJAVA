import java.util.Scanner;
class ArrSmallest
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
  int smallest(int arr[] , int i , int s)
  {
    if(i==arr.length)
    {
      return s;
    }
    else if(s>arr[i])
    {
      s = arr[i];
      return smallest(arr,i+1,s);
    }
    else
    {
      return smallest(arr,i+1,s);
    }
  }
  public static void main(String []args)
  {
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int arr[] = new int[size];
    ArrSmallest obj = new ArrSmallest();
    obj.input(arr);
    System.out.println("The smallest element of the array is "+ obj.smallest(arr,1,arr[0]));
  }
}