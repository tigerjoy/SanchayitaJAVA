import java.util.Scanner;
class AntiSpiralMatrix
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
  void antiSpiralDisplay(int arr[][])
  {
    int size = arr.length;
    int totalElements = size*size;
    int count = 0;
    int row_start = 0;
    int row_end = size-1;
    int col_start = 0; 
    int col_end = size-1;
    String output="";
    while(count != totalElements)
    {
      //TRAVERSE RIGHT
      for(int col = col_start;col<=col_end;col++)
      {
        output = arr[row_start][col] + " " + output;
        count++;
      }
      //TRAVERSE DOWN
      for(int row = row_start+1;row<=row_end;row++)
      {
        output = arr[row][col_end]+" " + output;
        count++;
      }
      //TRAVERSE LEFT
      for(int col = col_end-1;col>=col_start;col--)
      {
        output = arr[row_end][col] + " "+ output;
        count++;
      }
      //TRAVERSE UP
      for(int row= row_end-1;row>=row_start+1;row--)
      {
        output = arr[row][col_start] + " "+ output;
        count++;
      }
      row_start++;
      row_end--;
      col_start++;
      col_end--;
    }
    System.out.println("OUTPUT : "+output);
  }
  public static void main(String[]args)
  {
    System.out.println("Enter the size of the matrix");
    int size = sc.nextInt();
    int arr[][] = new int[size][size];
    AntiSpiralMatrix obj = new AntiSpiralMatrix();
    obj.input(arr);
    System.out.println("The elements in Spiral order are :");
    obj.antiSpiralDisplay(arr);
  }
}