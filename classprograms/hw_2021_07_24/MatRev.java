import java.util.Scanner;
// Scored - 9.5 points
public class MatRev 
{
    static Scanner sc = new Scanner(System.in);
    int arr[][];
    int m;
    int n;
    MatRev(int mm,int nn)
    {
        m=mm;
        n=nn;
        arr= new int[m][n];
    }
    void fillArray()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Enter element"+(i+1)+(j+1));
                arr[i][j]= sc.nextInt();
            }
        }
    }
    int reverse(int x)
    {
        String x1 = Integer.toString(x);
        String rev="";
        // OBSERVATION #1
        // Why do you need the local block?
        // {
            for(int i=x1.length()-1;i>=0;i--)
            {
                rev= rev+x1.charAt(i);
            }
        // }
        int x2 = Integer.parseInt(rev);
        return x2;
    }
    // OBSERVATION #2
    // Although, the program runs, don't give the
    // examiner any scope to deduct marks. Read
    // the question carefully and tell, what the
    // parameter of revMat() should've been.
    // void revMat(MatRev p)
    void revMat(MatRev P)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                this.arr[i][j]=reverse(p.arr[i][j]);
            }
        }
    }
    void show()
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
    public static void main(String[] args) 
    {
        System.out.println("Enter the no. of rows");
        int row= sc.nextInt();
        System.out.println("Enter the number of columns");
        int col = sc.nextInt();
        MatRev obj1 = new MatRev(row,col);
        MatRev obj2 = new MatRev(row,col);
        obj1.fillArray();
        obj2.revMat(obj1);
        System.out.println("ORIGINAL MATRIX");
        obj1.show();
        System.out.println("Matrix with reversed elements");
        obj2.show();
    }
}
