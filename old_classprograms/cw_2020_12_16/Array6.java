import java.util.Scanner;
class Array6
{
  static Scanner sc = new Scanner(System.in);
  static void print(String str){
    System.out.print(str);
  } 
  static void println(String str){
    System.out.println(str);
  } 
  void input(int arr[])
  {
    int size = arr.length;
    for(int i = 0;i<=size-1;i++)
    {
      System.out.println("Enter the "+(i+1)+ "th element");
      arr[i] = sc.nextInt();
    }
  }
  void display(int arr[],int i)
  {
    int size = arr.length;
    if(i==size)
    {
    }
    else if(arr[i]%2==1)
    {
      System.out.print(arr[i]+",");
      display(arr,i+1);
    }
    else
    {
      display(arr,i+1);
    }
  }
  public static void main(String []args)
  {
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int arr[] = new int[size];
    Array6 obj = new Array6();
    obj.input(arr);
    System.out.println("The elements of the array are");
    obj.display(arr,0);
  }
}