import java.util.Scanner;
public class ArrRec8
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
   int sumRec(int arr[],int i)
  {
    if(i==0)
    {
        return 0;
    }
    else
    {
      System.out.println("(sumRec(arr," + (i-1) + ")+arr[" + (i-1) + "])");
      return (sumRec(arr,i-1)+arr[i-1]);
    }
  }
  public static void main(String []args)
  {
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int arr[] = new int[size];
    ArrRec8 obj = new ArrRec8();
    obj.input(arr);
    int sum= obj.sumRec(arr, size);
    System.out.println("The sum is "+sum);
  }
}
