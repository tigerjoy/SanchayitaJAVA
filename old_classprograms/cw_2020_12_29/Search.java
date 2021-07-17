class Search
{
  int linearSearch(int arr[], int key)
  {
    int size = arr.length;
    int pos = -1;
    for(int i = size - 1; i >= 0; i--)
    {
      if(key == arr[i])
      {
        pos = i;
        break;
      }
    }
    return pos;
  }
  int binarySearch(int arr[], int key){
    int lb = 0, ub = arr.length - 1;
    int pos = -1;
    while(lb <= ub){
      int mid = (lb + ub) / 2;
      if(key == arr[mid]){
        pod = mid;
        break;
      }else if(key < arr[mid]){
        ub = mid - 1;
      }else{
        lb = mid + 1;
      }
    }
    return pos;
  }
}