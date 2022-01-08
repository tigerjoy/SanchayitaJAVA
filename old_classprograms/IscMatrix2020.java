import java.util.Scanner;
public class IscMatrix2020
{
    int M;
    int N ;
    int mat[][];
    boolean isValidInput;
    static Scanner sc = new Scanner(System.in);
    
    IscMatrix2020(int M,int N )
    {
        this.M = M;
        this.N = N ;
        mat = new int[M][N];
        isValidInput = true;
    }
    void input()
    {
        outer:
        for(int i = 0 ;i<M;i++)
        { 
            System.out.print("ENTER ELEMENTS FOR ROW " +(i+1)  + ":");
        
            for(int j = 0 ; j<N;j++)
            {
                int temp = sc.nextInt();

                // if(temp>7)
                if(temp < 0 || temp > 7)
                {
                
                    System.out.println("INVALID INPUT");
                    isValidInput = false;
                    break outer;
                }
                else
                {
                    mat[i][j]=temp;
                }
               
            }
        }
        
    }
    double decEq(int arr[])
    {
        int num = N -1;
        double sum = 0.0;
        for(int i = 0;i<N ;i++)
        {
            sum= sum + (Math.pow(8.0,num)*arr[i]);
            num--;
        }
        return sum ;
    }
    void display()
    {
        System.out.println("FILLED MATRIX               "+"DECIMAL EQUIVALENT");
        for(int i = 0;i<M;i++)
        {
            for(int j = 0;j<N;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.print("                      "+(int)(decEq(mat[i])));
            System.out.println("");
        }
    }
    
    public static void main(String[] args) 
    {
        System.out.print("M = ");
        int M1 = sc.nextInt();
        System.out.print("N = ");
        int N1 = sc.nextInt();
        if((M1>0&&M1<10)&&(N1>2&&N1<6))
        {
            IscMatrix2020 obj = new IscMatrix2020(M1,N1);  
            obj.input();
            if(obj.isValidInput)
            {
              obj.display();
            }
        }
        else
        {
            System.out.println("OUT OF RANGE");
        }
    }
}