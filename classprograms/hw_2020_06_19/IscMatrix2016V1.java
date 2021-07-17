import java.util.Scanner;
public class IscMatrix2016V1 
{
        void input(int M,int arr[][])
        {
            Scanner sc = new Scanner(System.in);
            for(int i = 0 ;i<M;i++)
            {
                for(int j = 0 ; j<M;j++)
                {
                    System.out.println("Enter element" +(i+1)+","+(j+1));
                    arr[i][j]= sc.nextInt();
                }
            }
        }
        void display(int M,int arr[][])
        {
            for(int i =0 ;i<M;i++)
            {
                for(int j = 0;j<M;j++)
                {
                    System.out.print(arr[i][j]+"\t");
                }
                System.out.println();
            }
        }
        ///*
        // Converts a 2D Array to 1D Array
        int[] toSDA(int M ,int mat[][])
        {
              int size = M * M;
              int arr[] = new int[size];
              int index = 0;
              for(int i = 0; i <= M - 1; i++)
              {
                  for(int j = 0; j <= M - 1; j++)
                  {
                      arr[index] = mat[i][j];
                      index++;
                  } 
              }
              return arr;
        }
        int[] nonBoundaryToSDA(int M ,int mat[][])
        {
              int size = (M-2) * (M-2);
              int arr[] = new int[size];
              int index = 0;
              for(int i = 1; i <= M - 2; i++)
              {
                  for(int j = 1; j <= M - 2; j++)
                  {
                      arr[index] = mat[i][j];
                      index++;
                  } 
              }
              return arr;
        }
        void replaceNonBoundary(int mat[][], int arr[]){
              int index = 0;
              int M = mat.length;
              for(int i = 1; i <= M - 2; i++)
              {
                  for(int j = 1; j <= M - 2; j++)
                  {
                      mat[i][j] = arr[index];
                      index++;
                  } 
              }
        }
        void display(int arr[]){
            for(int item: arr){
                System.out.print(item + ",");
            }
            System.out.println();
        }
        //*/
        // WORKS!
        void bubbleSort(int arr[])
        {
            for(int i=0;i<=arr.length-2;i++)
            {
                for(int j = 0;j<=arr.length-2-i;j++)
                {
                    if(arr[j] > arr[j+1])
                    {
                        int temp = arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
        }
        // WORKS!
        void printDiagonal(int arr[][],int M)
        {
            int sum = 0;
            for(int i =0 ;i<M;i++)
            {
                for(int j = 0;j<M;j++)
                {
                    if(i==j||(i+j)==M-1)
                    {
                        System.out.print(arr[i][j] +"\t");
                        sum+=arr[i][j];
                    }
                    else
                    {
                        System.out.print("\t");
                    }  
                }
                System.out.println("");
            }
            System.out.println("SUM OF THE DIAGONAL ELEMENTS = " + sum);
        }
        public static void main(String[] args) 
        {
                Scanner sc = new Scanner(System.in);
                IscMatrix2016V1 obj = new IscMatrix2016V1();  
                ///*
                System.out.println("M = ");
                int M = sc.nextInt();
                int mat[][]= new int[M][M];
                if(M>3&&M<10)
                {
                    obj.input(M,mat);
                    System.out.println("ORIGINAL MATRIX");
                    obj.display(M,mat);
                    int nonBound[] = obj.nonBoundaryToSDA(M, mat);
                    obj.bubbleSort(nonBound);
                    obj.replaceNonBoundary(mat, nonBound);
                    System.out.println("REARRANGED MATRIX");
                    obj.display(M, mat);
                    System.out.println("DIAGONAL ELEMENTS");
                    obj.printDiagonal(mat, M);
                }
                else
                {
                    System.out.println("THE MATRIX SIZE IS OUT OF RANGE");
                }
        }
}
