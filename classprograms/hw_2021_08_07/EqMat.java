import java.util.Scanner;
// Scored - 7 points
public class EqMat 
{
    static Scanner sc = new Scanner(System.in);
    int a[][];
    int m;
    int n;
    EqMat(int mm, int nn)
    {
        m=mm;
        n=nn;
        a= new int[m][n];
    }
    void readArray()
    {
         for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Enter element"+(i+1)+(j+1));
                a[i][j]= sc.nextInt();
            }
        }
    }
    int check(EqMat P, EqMat Q)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(P.a[i][j]==Q.a[i][j])
                {
                    return 1;
                }
                
            }
       }
        return 0;
    }
    // OBSERVATION #1
    // Did you run this program?
    void print()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
             System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the no. of row");
        int row = sc.nextInt();
        System.out.println("Enter the no. of columns");
        int col = sc.nextInt();
        EqMat obj1 = new EqMat(row,col);
        System.out.println("For matrix 1");
        obj1.readArray();
        obj1.print();
        EqMat obj2 = new EqMat(row,col);
        System.out.println("For matrix 2");
        obj2.readArray();
        obj2.print();
        EqMat result = new EqMat(row,col);
        if(result.check(obj1, obj2)==1)
        {
            System.out.println("Matrices are equal");
        }
        else
        {
            System.out.println("Matrices are not equal");
        }
    }
    
    
    
}
