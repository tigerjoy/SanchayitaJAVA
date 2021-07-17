import java.util.Scanner;
class Average
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
  int sum(int arr[] , int size)
  {
    if(size==0)
    {
      return 0;
    }
    else
    {
       return arr[size-1]+sum(arr,size-1);
    }
  }
  public static void main(String []args)
  {
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int arr[] = new int[size];
    Average obj = new Average();
    obj.input(arr);
    double avg = (double)(obj.sum(arr,size))/size ;
    System.out.println("The average numbers are "+ avg);
  }
}