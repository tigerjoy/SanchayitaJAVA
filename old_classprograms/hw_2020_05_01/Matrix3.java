import java.util.Scanner;
public class Matrix3
{
    
    void input(char arr[][],int num)
    {
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0;i<=num-1;i++)
        {
            for(int j = 0;j<=num-1;j++)
            {
                System.out.println("Enter element "+(i+1)+","+(j+1));
                arr[i][j]= sc.next().charAt(0);
            }
        }
    }
    void display(char arr[][])
    {
        int row = arr.length;
        int col = arr[0].length;
        for(int i = 0;i<=row-1;i++)
        {
            for(int j = 0;j<=col-1;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
   char[][] displayNewMatrix(char a,char b,char c,char arr[][],int N)
    {
       
        for(int i = 0;i<=N-1;i++)
        {
            for(int j = 0;j<=N-1;j++)
            {
               if((i==0&&j==0)||(i==N-1&&j==0)||(i==0&&j==N-1)||(i==N-1&&j==N-1))
               {
                   arr[i][j]= a;
               }
               else if((i>0&&i<N-1)&&(j>0&&j<N-1))
               {
                   arr[i][j]=c;
               }
               else
               {
                   arr[i][j]=b;
               }
                   
               
            }
        }
         return arr;
}
 
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Matrix3 obj = new Matrix3();
        System.out.println("INPUT :");
        System.out.print("N =");
        int n = sc.nextInt();
        if(n>3&&n<10)
        {
            System.out.print("FIRST CHARACTER  :");
            char c1 = sc.next().charAt(0);
            System.out.print("SECOND CHARACTER :");
            char c2 = sc.next().charAt(0);
            System.out.print("THIRD CHARACTER  :");
            char c3 = sc.next().charAt(0);
            char arr [][]= new char[n][n];
            System.out.println("OUTPUT : ");
            obj.display(obj.displayNewMatrix(c1,c2,c3,arr,n));
            
        }
        else
        {
            System.out.println("SIZE OUT OF RANGE!");
        }
    }
}
