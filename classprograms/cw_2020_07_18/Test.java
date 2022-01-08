class Test
{
  public static void main(String[]args)
  {
    int num1 = 9;
    int num2 = 10;
    int andResult = num1 & num2;
    int orResult = num1 | num2;
    int subtraction = num1 + (~num2 + 1);
    System.out.println("andResult: " + andResult);
    System.out.println("orResult: " + orResult);
    System.out.println("subtraction: " + subtraction);
  }
}