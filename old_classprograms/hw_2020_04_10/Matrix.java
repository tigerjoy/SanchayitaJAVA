import java.util.Scanner;
public class Matrix 
{
    void output(char arr[][])
    {
      int rows = arr.length;
      int cols = arr[0].length;
      for(int i = 0;i<=rows-1;i++)
      {
          for(int j = 0;j<= cols - 1;j++)
          {
            if(arr[i][j] != '\u0000')
            {
              System.out.print(arr[i][j] + " ");
            }
            else
            {
              System.out.print("  ");
            }
          }
          System.out.println();
      }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Matrix obj = new Matrix();
        System.out.println("Enter the order");
        int n = sc.nextInt();
        if(n <= 10)
        {
          // OLD
          // int arr[][] = new int[r][r];
          char arr[][] = new char[n][n];
          System.out.println("Enter the first character");
          char first = sc.next().charAt(0);
          System.out.println("Enter the second character");
          char second = sc.next().charAt(0);
          System.out.println("Enter the third character");
          char third = sc.next().charAt(0);

          // Filling up the left diagonal
          for(int i = 0; i <= n - 1; i++)
          {
            arr[i][i] = third;
          }
          // System.out.println("Left Diagonal");
          // obj.output(arr);
          // System.out.println();

          // Filling up the right diagonal
          for(int i = 0; i <= n - 1; i++)
          {
            arr[i][n - i - 1] = third;
          }
          // System.out.println("Both Diagonals");
          // obj.output(arr);
          // System.out.println();

          int half = n / 2;
          // Filling up the upper half
          for(int row = 0; row <= half; row++)
          {
            int left_diag_col_index = row;
            int right_diag_col_index = n - row - 1;
            // Filling up the columns
            for(int col = left_diag_col_index + 1; col <= right_diag_col_index - 1; col++)
            {
              arr[row][col] = first;
            }
          }
          // System.out.println("Upper half complete");
          // obj.output(arr);
          // System.out.println();
          
          // Filling up the left half  
          for(int col = 0; col <= half; col++)
          {
            int left_diag_row_index = col;
            int right_diag_row_index = n - col - 1;
            for(int row = left_diag_row_index + 1; row <= right_diag_row_index - 1; row++)
            {
              arr[row][col] = second;
            }
          }
          // System.out.println("Left half complete");
          // obj.output(arr);
          // System.out.println();

          // Right Half
          for(int col = n-1;col>=half;col--)
          {
           int right_diag_row_index = n - col - 1;
           int left_diag_row_index = col;
           for(int row = right_diag_row_index+1;row<=left_diag_row_index-1;row++)
           {
             arr[row][col] = second;
           }
          }
          // System.out.println("Right half complete");
          // obj.output(arr);
          // System.out.println();

          // Lower Half:
          for(int row = n - 1;row >= half;row--)
          {
            int right_diag_col_index = n-row-1;
            int left_diag_col_index = row;
            for(int col = right_diag_col_index + 1;col<=left_diag_col_index-1;col++)
            {
              arr[row][col] = first;
            }
          }
          // System.out.println("Lower half complete");
          obj.output(arr);
          System.out.println();
        }
        else
        {
          System.out.println("ERROR: n does not lie between 1 to 10");
        }
    }
}
