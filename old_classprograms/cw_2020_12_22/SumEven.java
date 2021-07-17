import java.util.Scanner;
class SumEven
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
  int sumEven(int arr[] , int size)
  {
    if(size==0)
    {
      return 0;
    }
    else if(arr[size-1]%2==0)
    {
       return arr[size-1]+sumEven(arr,size-1);
    }
    else
    {
       return 0+sumEven(arr,size-1);
    }
  }
  public static void main(String []args)
  {
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int arr[] = new int[size];
    SumEven obj = new SumEven();
    obj.input(arr);
    System.out.println("The sum of even numbers are "+ obj.sumEven(arr,size));
  }
}