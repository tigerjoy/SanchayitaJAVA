import java.util.Scanner;
import java.util.Arrays;
class MergeArray
{
  public static void main(String[]args)
  {
    int arr1[] = {2, 9, 12, 19, 27};
    int size1 = arr1.length;
    int arr2[] = {4, 8, 12, 24, 27, 36, 41};
    int size2 = arr2.length;

    int size3 = size1+size2;
    int mix[]= new int[size3];
    int i, j, k;
    k = 0;
    // Copying common elements
    for(i=0, j=0;i<size1 && j<size2;)
    {
      if(arr1[i]<arr2[j])
      {
        mix[k]=arr1[i];
        i++;
      }
      else
      {
        mix[k]=arr2[j];
        j++;
      }
      k++;
    }
    // Remaining Elements from arr1
    while(i<size1)
    {
      mix[k]=arr1[i];
      i++;
      k++;
    }
    // Remaining Elements from arr2
    while(j<size2)
    {
      mix[k]=arr2[j];
      j++;
      k++;
    }

    System.out.println("Array 1: " + Arrays.toString(arr1));
    System.out.println("Array 2: " + Arrays.toString(arr2));
    System.out.println("Mix: " + Arrays.toString(mix));

  }
}