import java.util.Scanner;
class BinarySearch
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
  int binarySearch(int arr[], int key , int lb , int ub)
  {
    int mid=(lb+ub)/2;
    if(lb>ub)
    {
      return -1;
    }
    else if(key==arr[mid])
    {
      return mid;
    }
    else if(key<arr[mid])
    {
       return binarySearch(arr, key , lb , mid-1);
    }
    else
    {
      return binarySearch(arr , key , mid+1 , ub);
    }
  }
  public static void main(String []args)
  {
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    BinarySearch obj = new BinarySearch();
    int arr[] = new int[size];
    obj.input(arr);
    System.out.println("Enter the element to be searched");
    int key = sc.nextInt();
    int pos = obj.binarySearch(arr,key,0,size-1);
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