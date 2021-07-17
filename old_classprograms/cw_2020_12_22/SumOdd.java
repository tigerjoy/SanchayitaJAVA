import java.util.Scanner;
class SumOdd
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
  int sumOdd(int arr[] , int size)
  {
    if(size==0)
    {
      return 0;
    }
    else if(arr[size-1]%2==1)
    {
       return arr[size-1]+sumOdd(arr,size-1);
    }
    else
    {
       return 0+sumOdd(arr,size-1);
    }
  }
  public static void main(String []args)
  {
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int arr[] = new int[size];
    SumOdd obj = new SumOdd();
    obj.input(arr);
    System.out.println("The sum of odd numbers are "+ obj.sumOdd(arr,size));
  }
}