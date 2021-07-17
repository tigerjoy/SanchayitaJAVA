import java.util.Scanner;
class LinearSearchv1
{
  static Scanner sc = new Scanner(System.in);
  void input(int arr[])
  {
    for(int i = 0;i<=arr.length-1;i++)
    {
       System.out.println("Enter element "+ (i+1));
       arr[i]= sc.nextInt();
    }
  }
  int linearSearch(int arr[], int key , int size)
  {
    if(size==0)
    {
      return -1;
    }
    else if(key == arr[size-1])
    {
      return size-1;
    }
    else
    {
      return linearSearch(arr,key,size-1);
    }
  }
  public static void main(String []args)
  {
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    LinearSearchv1 obj = new LinearSearchv1();
    int arr[] = new int[size];
    obj.input(arr);
    System.out.println("Enter the element to be searched");
    int key = sc.nextInt();
    int pos = obj.linearSearch(arr,key,size);
    if(pos==-1)
    {
      System.out.println(key +" was not found");
    }
    else
    {
      System.out.println(key +" was found at position "+pos);
    }
  }
}