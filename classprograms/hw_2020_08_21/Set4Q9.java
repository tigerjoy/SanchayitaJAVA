import java.util.Scanner;
public class Set4Q9 
{
    int m;
    int arr[][];
    static Scanner sc = new Scanner(System.in);
    
    Set4Q9(int m)
    {
        this.m = m;
        arr = new int[m][m];
    }
    void readarray()
    {
        for(int i = 0 ;i<m;i++)
        {
            for(int j = 0 ; j<m;j++)
            {
                System.out.println("Enter element" +(i+1)+","+(j+1));
                arr[i][j]= sc.nextInt();
            }
        }
    }
    void display()
    {
        for(int i =0 ;i<m;i++)
        {
            for(int j = 0;j<m;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    void Large()
    {
        
        for(int i = 0 ;i<m;i++)
        {
            int large = arr[i][0];
            for(int j = 0 ; j<m;j++)
            {
                
                if(arr[i][j]>large)
                {
                    large= arr[i][j];
                }
            }
                System.out.println("LARGEST ELEMENT IN "+(i+1)+"ROW : "+ large);
            
        }
    }
        public static void main(String[] args) 
        {
        System.out.println(" n = ");
        int n = sc.nextInt();
        Set4Q9 obj = new Set4Q9(n);
        obj.readarray();
        System.out.println("ORIGINAL MATRIX:");
        obj.display();
        obj.Large();
        
    }
}
    
    