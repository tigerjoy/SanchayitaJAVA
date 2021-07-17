import java.util.Scanner;
public class IscMatrix2012 
{
    int M;
    int N ;
    int mat[][];
    int arr[];
    static Scanner sc = new Scanner(System.in);
    
    IscMatrix2012(int M,int N )
    {
        this.M = M;
        this.N = N ;
        mat = new int[M][N];
        arr = new int[M*N];
        
    }
    void input()
    {
        for(int i = 0 ;i<M;i++)
        {
            for(int j = 0; j<N;j++)
            {
                System.out.println("Enter element" +(i+1)+","+(j+1));
                mat[i][j]= sc.nextInt();
            }
        }
    }
    void display()
    {
        for(int i =0 ;i<M;i++)
        {
            for(int j = 0;j<N;j++)
            {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }
    void findLarge()
    {
        int large = mat[0][0];
        int row = 0;
        int col = 0;
        for(int i = 0 ;i<M;i++)
        {
            for(int j = 0 ; j<N;j++)
            {
                if(mat[i][j]>large)
                {
                    large= mat[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println("LARGEST NUMBER: "+large);
        System.out.println("ROW = "+row);
        System.out.println("COLUMN = "+col);
    }
    void findsmall()
    {
        int small= mat[0][0];
        
        int row = 0;
        int col = 0;
        for(int i = 0 ;i<M;i++)
        {
            for(int j = 0 ; j<N;j++)
            {
                if(mat[i][j]<small)
                {
                    small= mat[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println("SMALLEST NUMBER: "+small);
        System.out.println("ROW = "+row);
        System.out.println("COLUMN = "+col);
    }
    void matToSDA()
    {
          int index = 0;
          for(int i = 0; i <= M-1; i++)
          {
              for(int j =  0; j <= N-1; j++)
              {
                  arr[index] = mat[i][j];
                  index++;
              } 
          }
    }
    void SDAtomat()
    {
          int index = 0;
          int dda[][] = new int[M][N];
          for(int i = 0; i <= M-1; i++)
          {
              for(int j =  0; j <= N-1; j++)
              {
                  dda[i][j]= arr[index];
                  index++;
              } 
          }
          for(int i = 0; i <= M-1; i++)
          {
              for(int j =  0; j <= N-1; j++)
              {
                  System.out.print(dda[i][j] +"\t");
              } 
              System.out.println();
          }
          
    }
    void bubbleSort()
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
    
    public static void main(String[] args) 
    {
       
        System.out.print("M = ");
        int M = sc.nextInt();
        System.out.print("N = ");
        int N = sc.nextInt();
        if((M>2&&M<20)&&(N>2&&N<20))
        {
            IscMatrix2012 obj = new IscMatrix2012(M,N);  
            obj.input();
            System.out.println("ORIGINAL MATRIX");
            obj.display();
            obj.findLarge();
            obj.findsmall();
            System.out.println("REARRANGED MATRIX:");
             obj.matToSDA();
             obj.bubbleSort();
             obj.SDAtomat();
            
        }
        else
        {
            System.out.println("SIZE OUT OF RANGE.");
        }
    }
}