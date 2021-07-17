import java.util.Scanner;
class String3
{
  static Scanner sc = new Scanner(System.in);
  int countUpperCase(String str)
  { 
    int size = str.length();
    int lastIndex = size-1;
    if(size==0)
    {
      return 0;
    }
    else if(Character.isUpperCase(str.charAt(lastIndex)))
    {
      return 1+ countUpperCase(str.substring(0,lastIndex));
    }
    else
    {
      return 0+ countUpperCase(str.substring(0,lastIndex));
    }
  }
  
  int countLowerCase(String str)
  { 
    int size = str.length();
    int lastIndex = size-1;
    if(size==0)
    {
      return 0;
    }
    else if(Character.isLowerCase(str.charAt(lastIndex)))
    {
      return 1+ countLowerCase(str.substring(0,lastIndex));
    }
    else
    {
      return 0+ countLowerCase(str.substring(0,lastIndex));
    }
  }
  
  int countDigit(String str)
  { 
    int size = str.length();
    int lastIndex = size-1;
    if(size==0)
    {
      return 0;
    }
    else if(Character.isDigit(str.charAt(lastIndex)))
    {
      return 1+ countDigit(str.substring(0,lastIndex));
    }
    else
    {
      return 0+ countDigit(str.substring(0,lastIndex));
    }
  }

  int countSpecialChar(String str)
  {
    return str.length()-
      ( countUpperCase(str)+
        countLowerCase(str)+
        countDigit(str));
  }
  
  int countVowel(String str)
  {
    int size = str.length();
    int lastIndex= size-1;
    if(size==0)
    {
      return 0;
    }
    // Checking if the last character is a vowel
    else if("aeiouAEIOU".indexOf(str.charAt(lastIndex)) != -1 )
    {
      return 1+countVowel(str.substring(0,lastIndex));
    }
    else
    {
      return 0+countVowel(str.substring(0,lastIndex));
    }
  }
  
  int countConsonant(String str)
  {
    int size = str.length();
    int lastIndex= size-1;
    if(size==0)
    {
      return 0;
    }
    // Last character must be a letter and not a vowel
    else if(("aeiouAEIOU".indexOf(str.charAt(lastIndex)) == -1 )
            &&(Character.isLetter(str.charAt(lastIndex))))
    {
      return 1+countConsonant(str.substring(0,lastIndex));
    }
    else
    {
      return 0+countConsonant(str.substring(0,lastIndex));
    }
  }
  
  public static void main(String[]args)
  {
    String3 obj = new String3();
    System.out.println("Enter a String");
    String str = sc.nextLine();
    int countLower = obj.countLowerCase(str);
    int countUpper = obj.countUpperCase(str);
    int countDig = obj.countDigit(str);
    int countSpecial = obj.countSpecialChar(str);
    int countVowel = obj.countVowel(str);
    int countConsonant = obj.countConsonant(str);
    // NUMBER OF UPPERCASE LETTERS: 
    System.out.println("NUMBER OF LOWERCASE LETTERS: " + countLower);
    System.out.println("NUMBER OF UPPERCASE LETTERS: " + countUpper);
    System.out.println("NUMBER OF DIGITS: " + countDig);
    System.out.println("NUMBER OF SPECIAL CHARACTERS: " + countSpecial);
    System.out.println("NUMBER OF VOWELS: " + countVowel);
    System.out.println("NUMBER OF CONSONANTS: " + countConsonant);
  }
}