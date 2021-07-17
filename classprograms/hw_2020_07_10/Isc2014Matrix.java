import java.util.Scanner;
public class Isc2014Matrix 
{
    int M;
    int mat[][];
    int Arr[][];
    
    static Scanner sc = new Scanner(System.in);
    
    Isc2014Matrix(int M)
    {
        this.M = M;
        mat = new int[M][M];
        Arr = new int[M][M];
        
    }

    void input()
    {
        for(int i = 0;i<M;i++)
        {
            for(int j = 0;j<M;j++)
            {
                System.out.println("Enter element "+(i+1)+" , "+(j+1));
                mat[i][j]=sc.nextInt();
            }
        }
    }
    void display()
    {
        for(int i = 0;i<M;i++)
        {
            for(int j = 0;j<M;j++)
            {
                System.out.print(mat[i][j] +" ");
            }
            System.out.println("");
        }
    }
    void symmetric()
    {
       
      //   for(int i = 0;i<M;i++)
      // {
      //     for(int j = 0;j<M;j++)
      //     {
      //         mat[i][j]=Arr[j][i];
      //     }
      // }
      // int count = 0;
      boolean isSymmetric = true;
      outer:
      for(int i = 0;i<M;i++)
      {
          for(int j = 0;j<M;j++)
          {
              // if(mat[i][j]==Arr[j][i])
              // if(mat[i][j] == mat[j][i])
              if(mat[i][j] != mat[j][i])
              {
                //  count++;
                isSymmetric = false;
                break outer;
              }
          }
      }
      // if(count == M*M)
      if(isSymmetric == true)
      {
          System.out.println("THE GIVEN MATRIX IS SYMMETRIC");
      }
      else
      {
          System.out.println("THE GIVEN MATRIX IS NOT SYMMETRIC");
      }
      
    }
    void sumDiagonal()
    {
        int sum_l = 0;
        int sum_r = 0;
        for(int i = 0;i<M;i++)
        {
            for(int j = 0;j<M;j++)
            {
             if(i==j)
             {
                  sum_l += mat[i][j];
             }
            //  else if(i+j==M-1)
              if(i+j==M-1)
              {
                  sum_r += mat[i][j];
              }
            }
        }
        System.out.println("The sum of the left diagonal = "+sum_l);
        // System.out.println("The sum of the left diagonal = "+sum_r);
        System.out.println("The sum of the right diagonal = "+sum_r);
    }
    public static void main(String[] args) 
    {
        System.out.println("M = ");
        int M = sc.nextInt();
        if(M>2&&M<10)
        {
            Isc2014Matrix obj = new Isc2014Matrix(M);  
            obj.input();
            System.out.println("ORIGINAL MATRIX");
            obj.display();
            obj.symmetric();
            obj.sumDiagonal();
        }
        else
        {
            System.out.println("THE MATRIX SIZE IS OUT OF RANGE.");
        }
    }
}

