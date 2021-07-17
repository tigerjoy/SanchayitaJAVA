import java.util.Scanner;
class Rotation
{
    void input(int arr[][])
    {
        Scanner sc = new Scanner(System.in);
        int row = arr.length;
        int col = arr[0].length;
        for(int i = 0 ;i<row;i++)
        {
            for(int j = 0 ; j<col;j++)
            {
                System.out.println("Enter element" +(i+1)+","+(j+1));
                arr[i][j]= sc.nextInt();
            }
        }
    }
    void display(int arr[][])
    {
      int row = arr.length;
      int col = arr[0].length;
      
      // int sum = arr[0][0]+arr[0][col-1]+arr[row-1][0]+arr[row-1][col-1];
      // System.out.println("ORIGINAL MATRIX:");
      for(int i =0 ;i<row;i++)
      {
        for(int j = 0;j<col;j++)
        {
            System.out.print(arr[i][j]+"\t");
        }
        System.out.println();
      }
      // System.out.println("Sum of corner elements :"+sum);
  }
  void fillRotatedMatrix(int org[][], int rot[][])
  {
    int n = org.length;
    // Copying row wise
    for(int j = 0; j <= n - 1; j++)
    {
      for(int i = 0; i <= n - 1; i++)
      {
        int i_prime = n - j - 1;
        int j_prime = i;
        rot[i][j] = org[i_prime][j_prime];
      }
    }
  }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        Rotation obj = new Rotation();
        int sum = 0;
 
        System.out.println("Enter value of M");
        int m = sc.nextInt();

        if(m > 2 && m < 10)
        {
          int arr [][]= new int[m][m];
          obj.input(arr);
          // obj.display(arr);

          int rot_mat[][] = new int[m][m];
          obj.fillRotatedMatrix(arr, rot_mat);

          System.out.println("ORIGINAL MATRIX");
          obj.display(arr);

          System.out.println("MATRIX AFTER ROTATION");
          obj.display(rot_mat);

          sum = arr[0][0]+ arr[0][m-1]+ arr[m-1][0]+ arr[m-1][m-1];
          System.out.println("Sum of corner elements :"+sum);
        }
        else
        {
          System.out.println("SIZE OUT OF RANGE");
        }
    }
}