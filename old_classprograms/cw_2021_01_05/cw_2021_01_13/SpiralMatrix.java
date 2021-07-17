import java.util.Scanner;
class SpiralMatrix
{
  static Scanner sc = new Scanner(System.in);
  void input(int arr[][])
  {
    int row = arr.length;
    int col = arr[0].length;
    for(int i = 0;i<row;i++)
    {
      for(int j = 0;j<col;j++)
      {
        System.out.printf("arr[%d][%d] = ",i+1, j+1);
        arr[i][j] = sc.nextInt();
      }
    }
  }
  void spiralDisplay(int arr[][])
  {
    int size = arr.length;
    int totalElements = size*size;
    int count = 0;
    int row_start = 0;
    int row_end = size-1;
    int col_start = 0; 
    int col_end = size-1;
    while(count != totalElements)
    {
      //TRAVERSE RIGHT
      for(int col = col_start;col<=col_end;col++)
      {
        System.out.print(arr[row_start][col] + " ");
        count++;
      }
      //TRAVERSE DOWN
      for(int row = row_start+1;row<=row_end;row++)
      {
        System.out.print(arr[row][col_end]+" ");
        count++;
      }
      //TRAVERSE LEFT
      for(int col = col_end-1;col>=col_start;col--)
      {
        System.out.print(arr[row_end][col] + " ");
        count++;
      }
      //TRAVERSE UP
      for(int row= row_end-1;row>=row_start+1;row--)
      {
        System.out.print(arr[row][col_start] + " ");
        count++;
      }
      row_start++;
      row_end--;
      col_start++;
      col_end--;
    }
    System.out.println();
  }
  public static void main(String[]args)
  {
    System.out.println("Enter the size of the matrix");
    int size = sc.nextInt();
    int arr[][] = new int[size][size];
    SpiralMatrix obj = new SpiralMatrix();
    obj.input(arr);
    System.out.println("The elements in Spiral order are :");
    obj.spiralDisplay(arr);
  }
}