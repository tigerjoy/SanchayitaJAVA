import java.util.Scanner;
public class IscMatrix2016V2
{
    int M;
    int mat[][];
    int nonBound[];
    static Scanner sc = new Scanner(System.in);
    
    IscMatrix2016V2(int M)
    {
        this.M = M;
        mat = new int[M][M];
        nonBound = new int[(M-2) * (M-2)];
    }
    void input()
    {
        for(int i = 0 ;i<M;i++)
        {
            for(int j = 0 ; j<M;j++)
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
            for(int j = 0;j<M;j++)
            {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }
    void nonBoundaryToSDA()
    {
          int index = 0;
          for(int i = 1; i <= M - 2; i++)
          {
              for(int j = 1; j <= M - 2; j++)
              {
                  nonBound[index] = mat[i][j];
                  index++;
              } 
          }
    }
    void replaceNonBoundary(){
          int index = 0;
          int M = mat.length;
          for(int i = 1; i <= M - 2; i++)
          {
              for(int j = 1; j <= M - 2; j++)
              {
                  mat[i][j] = nonBound[index];
                  index++;
              } 
          }
    }
    // WORKS!
    void bubbleSort()
    {
        for(int i=0;i<=nonBound.length-2;i++)
        {
            for(int j = 0;j<=nonBound.length-2-i;j++)
            {
                if(nonBound[j] > nonBound[j+1])
                {
                    int temp = nonBound[j];
                    nonBound[j]=nonBound[j+1];
                    nonBound[j+1]=temp;
                }
            }
        }
    }
    // WORKS!
    void printDiagonal()
    {
        int sum = 0;
        for(int i =0 ;i<M;i++)
        {
            for(int j = 0;j<M;j++)
            {
                if(i==j||(i+j)==M-1)
                {
                    System.out.print(mat[i][j] +"\t");
                    sum+=mat[i][j];
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
        System.out.println("M = ");
        int M = sc.nextInt();
        if(M>3&&M<10)
        {
            IscMatrix2016V2 obj = new IscMatrix2016V2(M);  
            obj.input();
            System.out.println("ORIGINAL MATRIX");
            obj.display();
            obj.nonBoundaryToSDA();
            obj.bubbleSort();
            obj.replaceNonBoundary();
            System.out.println("REARRANGED MATRIX");
            obj.display();
            System.out.println("DIAGONAL ELEMENTS");
            obj.printDiagonal();
        }
        else
        {
            System.out.println("THE MATRIX SIZE IS OUT OF RANGE");
        }
    }
}
