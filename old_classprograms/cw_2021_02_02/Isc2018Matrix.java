import java.util.Scanner;
class Isc2018Matrix
{
  static Scanner sc = new Scanner(System.in);
  int arr[][];
  int M;
  int N;
  
  Isc2018Matrix(int M,int N)
  {
    this.M = M;
    this.N = N;
    arr = new int[M][N];
  }
  void input()
  {
    for(int i = 0;i<M;i++)
    {
      for(int j = 0;j<N;j++)
      {
        System.out.printf("arr[%d][%d] = ",i+1, j+1);
        arr[i][j] = sc.nextInt();
      }
    }
  }
  void display()
  {
    for(int i = 0;i<M;i++)
    {
      for(int j = 0;j<N;j++)
      {
        System.out.print(arr[i][j]+"\t");
      }
      System.out.println();
    }
    System.out.println();
  }
  void selectSort(int arr[])
  {
    int size = arr.length;
    for(int i =0;i < size-1;i++)
    {
      int small_i =i;
      for(int j = i+1;j<size;j++)
      {
        if(arr[small_i]>arr[j])
        {
          small_i=j;
        }
      }
      int temp = arr[i];
      arr[i]=arr[small_i];
      arr[small_i]= temp;
    }
  }
  void sortRow()
  {
    for(int i =0;i<=M-1;i++)
    {
      selectSort(arr[i]);
    }
  }
  public static void main(String[]args)
  {
    System.out.print("M = ");
    int rows = sc.nextInt();
    System.out.print("N = ");
    int cols = sc.nextInt();
    if((rows>2 && rows<10) &&
     (cols>2 && cols<10))
    { 
      Isc2018Matrix obj = new Isc2018Matrix(rows,cols);
      obj.input();
      System.out.println("ORIGINAL MATRIX");
      obj.display();
      obj.sortRow();
      System.out.println("MATRIX AFTER SORTING ROWS");
      obj.display();
    }
    else
    {
      System.out.println("MATRIX SIZE OUT OF RANGE.");
    }
  }
}