import java.util.Scanner;
class SumProductArray
{
  void input(int arr[])
  {
      Scanner sc = new Scanner(System.in);
      for(int i = 0; i <= arr.length - 1; i++)
      {
        System.out.print("Enter element " + (i + 1) + ": ");
        arr[i] = sc.nextInt();
      }
  }

  // TODO: Complete display() using for-each loop
  // which will display each element comma seperated
  void display(int arr[])
  {
    for(int item:arr)
    {
      System.out.print(item +" ,");
    }
    System.out.println();
  }

  // TODO: Complete sumProduct(int arr[]), 
  // using for-each loop
  void sumProduct(int arr[])
  {
    // Write your code below
    int sum = 0;
    int prod = 1;
    for(int item:arr)
    {
      if(item%2==0)
      {
        sum+=item;
      }
      else
      {
        prod*=item;
      }
    }
    // Display the result of sum and product
    System.out.println("SUM : "+sum);
    System.out.println("PRODUCT : "+prod);
  }

  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    SumProductArray obj = new SumProductArray();

    System.out.print("Enter the size: ");
    int size = sc.nextInt();

    int arr[] = new int[size];

    obj.input(arr);

    System.out.println("Array elements are");
    obj.display(arr);
    System.out.println();

    obj.sumProduct(arr);
  }
}