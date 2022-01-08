import java.util.Scanner;
class InsertionSortDescending
{
  static Scanner sc = new Scanner(System.in);
  void input(int arr[])
  {
    for(int i=0;i<arr.length;i++)
    {
      System.out.println("Enter element "+(i+1));
      arr[i]=sc.nextInt();
    }
  }
  void display(int arr[])
  {
    for(int i=0;i<arr.length;i++)
    {
      System.out.print(arr[i]+",");
    }
    System.out.println();
  }
  // Tool - Descending Order
  void insertionSort(int arr[])
  {
    int n = arr.length;
    for(int i=1;i<n;i++)
    {
      int toInsert = arr[i];
      int j=i-1;
      while(j>=0 && toInsert>arr[j])
      {
        arr[j+1]=arr[j];
        j--;
      }
      arr[j+1]=toInsert;
    }
  }
  public static void main(String[]args)
  {
    InsertionSortDescending obj = new InsertionSortDescending();
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int arr[] = new int[size];
    obj.input(arr);
    System.out.println("Before Sorting:");
    obj.display(arr);
    obj.insertionSort(arr);
    System.out.println("After Sorting:");
    obj.display(arr);
  }
}