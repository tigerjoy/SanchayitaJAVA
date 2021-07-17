import java.util.Scanner;
class LinearSearchv2
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
  void linearSearch(int arr[], int key , int size)
  {
    if(size==0)
    {
      return;
    }
    else if(key == arr[size-1])
    {
      System.out.println(key +" was found at position "+(size-1));
      linearSearch(arr, key,size-1);
    }
    else
    {
      linearSearch(arr,key,size-1);
    }
  }
  public static void main(String []args)
  {
    System.out.println("Enter the size of the array");
    int size = sc.nextInt(); 
    LinearSearchv2 obj = new LinearSearchv2();
    int arr[] = new int[size];
    obj.input(arr);
    System.out.println("Enter the element to be searched");
    int key = sc.nextInt();
    obj.linearSearch(arr,key,size);
  }
}