import java.util.Scanner;
class ISC2017MATRIX
{
  char mat[][];
  int N;
  int scores[];
  char key[];
  int highestScore;
  static Scanner sc = new Scanner(System.in);



  
  ISC2017MATRIX(int N)
  {
    this.N = N;
    // N x 5
    mat = new char[N][5];
    scores = new int[N];
    key = new char[5];
    highestScore = 0;



  }

  void input()
  {
    for(int i = 0; i < N; i++)
    {
      System.out.print("Participant " + (i + 1) + " ");
      String answer = sc.nextLine().trim();
      int index = 0;
      for(int j = 0; j < 5; j++)
      {
        mat[i][j] = answer.charAt(index);
        index += 2;
      }
    }
    System.out.print("Key: ");
    String correctAnswer = sc.nextLine().trim();
    int index = 0;
    for(int j = 0; j < 5; j++)
    {
      key[j] = correctAnswer.charAt(index);
      index += 2;
    }
  }

  int getScore(char answer[])
  {
    int score = 0;
    for(int i = 0; i < 5; i++)
    {
      if(key[i] == answer[i])
      {
        score++;
      }
    }
    return score;
  }

  void calcScore()
  {
    for(int i = 0; i < N; i++)
    {
      scores[i] = getScore(mat[i]);      
    }
  }

  void findHighestScore()
  {
    int largest = scores[0];
    for(int i = 1; i < N; i++)
    {
      if(scores[i] > largest)
      {
        largest = scores[i];
      }
    }
    highestScore = largest;
  }

  void displayAllScores()
  {
    System.out.println("Scores: ");
    for(int i = 0; i < N; i++)
    {
      System.out.println("Participant " + (i + 1) + " = " + scores[i]);
    }
  }

  void displayTopScorers()
  {
    boolean firstTime = true;
    System.out.print("Highest Score: ");
    for(int i = 0; i < N; i++)
    {
      if(scores[i] == highestScore)
      {
        if(firstTime)
        {
          System.out.println("Participant " + (i + 1) + " = " + scores[i]);
          firstTime = false;
        }
        else
        {
          System.out.println("\t\t\tParticipant " + (i + 1) + " = " + scores[i]);
        }
      }
    }
  }

  public static void main(String[]args)
  {
    System.out.print("N = ");
    int total = sc.nextInt();
    sc.nextLine();

    if(total > 3 && total < 11)
    {
      ISC2017MATRIX obj = new ISC2017MATRIX(total);
      obj.input();
      obj.calcScore();
      obj.findHighestScore();
      obj.displayAllScores();
      obj.displayTopScorers();
    }
    else
    {
      System.out.println("INPUT SIZE OUT OF RANGE.");
    }
  }
}