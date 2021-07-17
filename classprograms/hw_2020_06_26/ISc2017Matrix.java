import java.util.Scanner;
public class ISc2017Matrix 
{
  int N;
  char arr[][];
  char key[];
  static Scanner sc = new Scanner(System.in);

  ISc2017Matrix(int N)
  {
    this.N = N;
    this.arr = new char[N][5];
    this.key = new char[5];
  }

  void input()
  {
    for(int i = 0;i<N;i++)
    {
      System.out.println("Participant "+(i+1) + ": ");
      // String input = sc.nextLine();
      // String answers[] = input.split(" ");
      String answers[] = sc.nextLine().split(" ");
      for(int j = 0;j<5;j++)
      {
          arr[i][j] = answers[j].charAt(0);
      }
      System.out.println(" ");
    }

    System.out.println("KEY : ");
    String answers[] = sc.nextLine().split(" ");
    for(int i = 0;i<key.length;i++)
    {
      key[i]= answers[i].charAt(0);
    }
  }

  void checkans()
  {
      System.out.println("SCORES :");
      int participant_no = -1;
      int participant_score = 0;
      for(int i = 0;i<N;i++)
      {
          int count = 0;
          for(int j = 0;j<5;j++)
          {
              if(arr[i][j]==key[j])
              {
                  count++;
              }
          }
          if(count > participant_score){
            participant_no = (i + 1);
            participant_score = count;
          }
          System.out.println("Participant "+(i+1) +"="+count);
      }
      System.out.println("Highest Score: Participant " + participant_no);
  }
  public static void main(String[] args) 
  {
      System.out.println("N = ");
      int N = sc.nextInt();
      sc.nextLine();
      if(N>3&&N<11)
      {
        ISc2017Matrix obj = new ISc2017Matrix(N);
        obj.input();
        obj.checkans();
      }
      else
      {
        System.out.println("INPUT SIZE OUT OF RANGE");
      }
  }
}

    
