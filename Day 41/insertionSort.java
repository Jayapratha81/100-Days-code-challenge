// Insertion Sort

class Solution
{
  static void insert(int arr[],int i)
  {
       // Your code here
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
      for(int i=1;i<n;i++)
      {
          if(arr[i-1]>arr[i])
          {
              for(int j=i;j>0;j--)
              {
                  if(arr[j-1]>arr[j])
                  {
                      int temp=arr[j-1];
                      arr[j-1]=arr[j];
                      arr[j]=temp;
                  }
              }
          }
      }
  }
}
