import java.util.Scanner;
class SpiralFill
{
  static Scanner sc = new Scanner(System.in);
 
  void spiralFill(int arr[][])
  {
    int rows = arr.length;
    int cols = arr[0].length;
    int totalElements = rows*cols;
    int count = 0;
    int row_start = 0;
    int row_end = rows-1;
    int col_start = 0; 
    int col_end = cols-1;
    int k = 1;
    while(count != totalElements)
    {
      //TRAVERSE RIGHT
      for(int col = col_start;col<=col_end;col++)
      {
        arr[row_start][col]=k;
        count++;
        k++;
        System.out.println("TRAVERSE RIGHT");
      }
      //TRAVERSE DOWN
      for(int row = row_start+1;row<=row_end;row++)
      {
        arr[row][col_end]=k;
        count++;
        k++;
        System.out.println("TRAVERSE DOWN");
      }
      if(rows != 1)
      {
        //TRAVERSE LEFT
        for(int col = col_end-1;col>=col_start;col--)
        {
          arr[row_end][col]=k;
          count++;
          k++;
          System.out.println("TRAVERSE LEFT");

        }
      }
      if(cols != 1)
      {
        //TRAVERSE UP
        for(int row= row_end-1;row>=row_start+1;row--)
        {
          arr[row][col_start]=k;
          count++;
          k++;
          System.out.println("TRAVERSE UP");
        }
      }
      
      System.out.println("Count = " + count);
      row_start++;
      row_end--;
      col_start++;
      col_end--;
    }
    //System.out.println("row_start = " + row_start);
    //System.out.println("row_end = " + row_end);
    //System.out.println("col_start = " + col_start);
    //System.out.println("col_end = " + col_end);
    //System.out.println();
  }
  void display(int arr[][])
  {
    int row = arr.length;
    int col = arr[0].length;
    for(int i = 0;i<row;i++)
    {
      for(int j = 0;j<col;j++)
      {
        System.out.print(arr[i][j]+"\t");
      }
      System.out.println();
    }
  }
  public static void main(String[]args)
  {
    System.out.println("Enter the number of rows: ");
    int rows = sc.nextInt();
    System.out.println("Enter the number of cols: ");
    int cols = sc.nextInt();
    int arr[][] = new int[rows][cols];
    SpiralFill obj = new SpiralFill();
    obj.spiralFill(arr);
    System.out.println("The elements are");
    obj.display(arr);
  }
}