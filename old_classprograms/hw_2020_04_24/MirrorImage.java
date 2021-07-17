import java.util.Scanner;
class MirrorImage
{void input(int arr[][])
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
        
       
           
           for(int i =0 ;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
         
    }
     void displayMirrorMatrix(int arr[][])
     {
        int row = arr.length;
        int col = arr[0].length;
        
       
           System.out.println("   MIRROR IMAGE MATRIX :  ");
           for(int i =0 ;i<row;i++)
        {
            for(int j = col-1;j>=0;j--)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
         
     }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        MirrorImage obj = new MirrorImage();
        System.out.print("INPUT :      M =  ");
       
        int M = sc.nextInt();
        if(M<=2||M>=22)
        {
            System.out.println("OUTPUT   :  SIZE OUT OF RANGE.");
        }
        else
        {
            int arr[][]=new int[M][M];
            obj.input(arr);
            obj.display(arr);
            System.out.println("OUTPUT :  ");
            System.out.println("    ORIGINAL MATRIX :  ");
            obj.display(arr);
            obj.displayMirrorMatrix(arr);
            
        }
                
                
    }
}