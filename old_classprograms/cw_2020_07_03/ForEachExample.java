class ForEachExample{
  public static void main(String[]args){

    // int arr[] = {1 ,2 ,3 ,4, 5};
    // for(int item: arr){
    //   System.out.print(item + ",");
    // }
    // System.out.println();

    // int mat[][] = {
    //   {1, 2, 3},
    //   {4, 5, 6},
    //   {7, 8, 9},
    // };
    // for(int row[]: mat)
    // {
    //   for(int item: row)
    //   {
    //     System.out.print(item + "\t");
    //   }
    //   System.out.println();
    // }

    // Limitations 
    // #1
    int arr[] = {1, 2, 3, 4, 5};
    System.out.println("Before");
    for(int item: arr){
      System.out.print(item + ",");
    }
    System.out.println();
    for(int item: arr){
      // Does not change the actual array
      item = item * 2;
    }
    System.out.println("After");
    for(int item: arr){
      System.out.print(item + ",");
    }
    System.out.println();
  }
}