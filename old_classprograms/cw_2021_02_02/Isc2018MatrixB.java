import java.util.Scanner;
class Isc2018MatrixB
{
  static Scanner sc = new Scanner(System.in);
  int arr[][];
  int M;
  int N;
  
  Isc2018MatrixB(int M,int N)
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
  void sortCol()
  {
    // 1. for each column
      // a. Store that column in an array
      // b. Sort that array
      // c. Save the contents of the array back to 
      //    the matrix
    
    // 1. for each column
    for(int col= 0;col<N;col++)
    {
      // a. Store that column in an array
      int colArr[] = new int[M];
      for(int row = 0;row<M;row++)
      {
        colArr[row] = arr[row][col];
      }
      // b. Sort that array
      selectSort(colArr);
      // c. Save the contents of the array back to 
      //    the matrix
      for(int row=0;row<M;row++)
      {
        arr[row][col]=colArr[row];
      }
    }
  
  }
  public static void main(String[]args)
  {
    System.out.print("M = ");
    int rows = sc.nextInt();
    System.out.print("N = ");
    int cols = sc.nextInt();
    if((rows>2 && rows<10) && (cols>2 && cols<10))
    { 
      Isc2018MatrixB obj = new Isc2018MatrixB(rows,cols);
      obj.input();
      System.out.println("ORIGINAL MATRIX");
      obj.display();
      obj.sortCol();
      System.out.println("MATRIX AFTER SORTING COLUMNS");
      obj.display();
    }
    else
    {
      System.out.println("MATRIX SIZE OUT OF RANGE.");
    }
  }
}