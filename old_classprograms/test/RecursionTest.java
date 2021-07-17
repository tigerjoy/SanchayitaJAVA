class RecursionTest{
  int sumOfDigits(int n){
    if(n == 0){
      return 0;
    } else {
      System.out.println(n%10);
      return (n % 10) + sumOfDigits(n / 10);
    }
  }
  void displayDigits(int n){
    if(n == 0){
      return;
    } else {
      displayDigits(n / 10);
      System.out.println(n % 10);
    }
  }
  int reverse(int n){
    if(n < 10){
      return n;
    } else {
      int index = (int) Math.floor(Math.log10(n));
      int power10 = (int) Math.pow(10, index);
      return (n % 10) * power10 + reverse(n / 10);
    }
  }
  int sumOfFactors(int num, int fact){
    if(fact > num){
      return 0;
    }
    else if(num % fact == 0){
      return fact + sumOfFactors(num, fact + 1);
    }
    else {
      return sumOfFactors(num, fact + 1);
    }
  }
  boolean isPrime(int num, int fact){
    if(num == fact){
      return true;
    } else if(num % fact == 0){
      return false;
    } else {
      return isPrime(num, fact + 1);
    }
  }
  int hcf(int dividend, int divisor){
    int remainder = dividend % divisor;
    if(remainder == 0){
      return divisor;
    } else {
      return hcf(divisor, remainder);
    }
  }
  int lcm(int a, int b, int fact){
    if(a == 1 && b == 1){
      return 1;
    } else if(a % fact == 0 && b % fact == 0){
      return fact * lcm(a / fact, b / fact, fact);
    } else if(a % fact == 0){
      return fact * lcm(a / fact, b, fact);
    } else if(b % fact == 0){
      return fact * lcm(a, b / fact, fact);
    } else {
      return lcm(a, b, fact + 1);
    }
  }
  void printFactorial(int num)
  {
    int fact = 1;
    for(int i = num; i >= 1; i--)
    {
      fact = fact * i;
    }
    System.out.println(num + "! = " + fact);
  }
  int factorialRec(int num)
  {
    // Base Case
    if(num == 1){
      return 1;
    } 
    // Recursive Case
    else{
      return num * factorialRec(num - 1);
    }
  }
  int factorial(int num, int fact, int i)
  {
    // Base case
    if(i < 1){
      return fact;
    }
    // Recursive Case
    else {
      fact = fact * i;
      i++;
      return factorial(num, fact, i);
    }
  }
  boolean isPrime(int num)
  {
    int factCount = 0;
    for(int i = 1; i <= num; i++)
    {
      if(num % i == 0){
        factCount++;
      }
    }
    if(factCount == 2){
      return true;
    } else {
      return false;
    }
  }
  int factorialV1(int num)
  {
    int fact = 1;
    for(int i = num; i >= 1; i--)
    {
      fact = fact * i;
    }
    return fact;
  }
  public static void main(String[]args){
    RecursionTest obj = new RecursionTest();
    System.out.println(obj.lcm(6, 12, 2));
  }
}