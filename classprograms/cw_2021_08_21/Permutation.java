import java.util.Scanner;
class Permutation
{
  void genPermutations(String str, String fix)
  {
    int n = str.length();
    // Base Case
    if(n==0)
    {
      System.out.println(fix);
    }
    // Recursive Case
    else
    {
      for(int i =0;i<n;i++)
      {
        String newStr= str.substring(0,i)+str.substring(i+1);
        genPermutations(newStr,fix+str.charAt(i));
      }
    }
  }
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a word");
    String word = sc.next();
    Permutation obj = new Permutation();
    obj.genPermutations(word, "");
  }
}