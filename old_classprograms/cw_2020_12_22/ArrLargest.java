import java.util.Scanner;
class ArrLargest
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
  int largest(int arr[] , int i , int l)
  {
    if(i==arr.length)
    {
      return l;
    }
    else if(l<arr[i])
    {
      l = arr[i];
      return largest(arr,i+1,l);
    }
    else
    {
      return largest(arr,i+1,l);
    }
  }
  public static void main(String []args)
  {
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int arr[] = new int[size];
    ArrLargest obj = new ArrLargest();
    obj.input(arr);
    System.out.println("The largest element of the array is "+ obj.largest(arr,1,arr[0]));
  }
}