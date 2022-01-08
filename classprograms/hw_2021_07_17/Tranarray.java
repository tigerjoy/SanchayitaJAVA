import java.util.Scanner;
// Scored - 10 points
public class Transarray 
{
    static Scanner sc = new Scanner(System.in);
    int arr[][];
    int m;
    int n;
    Transarray()
    {
        this(20,20);
    }
    Transarray(int mm,int nn)
    {
        this.m = mm;
        this.n = nn;
        this.arr = new int[this.m][this.n];
    }
    void fillarray()
    {
        for(int i=0;i<=m-1;i++)
        {
            for(int j=0;j<=n-1;j++)
            {
            System.out.println("Enter element"+(i+1)+(j+1));
            arr[i][j]=sc.nextInt();
            }
        }
    }
    void transpose(Transarray A)
    {
        //arr->this.arr
        //t_arr->A.arr
        
        for(int i=0;i<=m-1;i++)
        {
            for(int j=0;j<=n-1;j++)
            {
                A.arr[j][i]=this.arr[i][j];
            }
        }
    }
    void disaparray()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    public static void main(String[]args)
    {
 
        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns");
        int col = sc.nextInt();
        if(row<=20&&col<=20)
        {
            Transarray obj1 = new Transarray(row,col);
            obj1.fillarray();
            System.out.println("ORIGINAL MATRIX:");
            obj1.disaparray();
            Transarray obj2 = new Transarray(row,col);
            obj1.transpose(obj2);
            System.out.println("THE TRANSPOSE:");
            obj2.disaparray();
        }
        
    }
}
