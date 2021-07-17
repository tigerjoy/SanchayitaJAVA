import java.util.Scanner;
class SumProduct
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
  void sumProduct(int arr[],int i , int sum , int product)
  {
    if(i==arr.length)
    {
      System.out.println("Sum of odd elements is "+ sum);
      System.out.println("Product of even elements is "+ product);
    }
    else if(arr[i]%2==0)
    {
      product*=arr[i];
      sumProduct(arr,i+1,sum,product);
    }
    else 
    {
      sum+=arr[i];
      sumProduct(arr,i+1,sum,product);
    }
  }
  public static void main(String []args)
  {
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int arr[] = new int[size];
    SumProduct obj = new SumProduct();
    obj.input(arr);
    obj.sumProduct(arr,0,0,1);
}
}