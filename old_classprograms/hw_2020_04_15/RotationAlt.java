import java.util.Scanner;
class RotationAlt{
  // Creating the Scanner static to access it from methods
  // including main()
  static Scanner sc = new Scanner(System.in);
  
  void input(int arr[][]){
    int rows = arr.length;
    int cols = arr[0].length;

    for(int i = 0; i < rows; i++){
      for(int j = 0; j < cols; j++){
        System.out.print("Enter element " + (i + 1) + ", " + (j + 1) + ": ");
        arr[i][j] = sc.nextInt();
      }
    }
  }

  void display(int arr[][]){
    int rows = arr.length;
    int cols = arr[0].length;

    for(int i = 0; i < rows; i++){
      for(int j = 0; j < cols; j++){
        System.out.print(arr[i][j] + "\t");
      }
      System.out.println();
    }
    System.out.println();
  }

  // Performs 90 deg rotation for square matrices
  int[][] rotateMatrix(int arr[][]){
    int rows = arr.length;
    int cols = arr[0].length;

    int rot[][] = new int[rows][cols];

    // We start copying from the last row
    // thus, the source row is rows - 1
    int src_row = rows - 1;
    // Copying column wise
    for(int j = 0; j < cols; j++){
      for(int i = 0; i < rows; i++){
        rot[i][j] = arr[src_row][i];
      }
      src_row--;
    }

    return rot;
  }

  public static void main(String[]args){
    RotationAlt obj = new RotationAlt();

    System.out.print("M = ");
    int m = sc.nextInt();

    // Array Initialization
    int arr[][] = new int[m][m];
    
    // Taking input in Array
    obj.input(arr);

    // Performing rotation
    int rot[][] = obj.rotateMatrix(arr);

    // Calculating sum of corner elements
    int corner_sum = arr[0][0] + arr[0][m - 1] + arr[m - 1][0] + arr[m - 1][m - 1];

    System.out.println("ORIGINAL MATRIX");
    obj.display(arr);
    
    System.out.println("MATRIX AFTER ROTATION");
    obj.display(rot);

    System.out.println("Sum of the corner elements = " + corner_sum);
  }
}

