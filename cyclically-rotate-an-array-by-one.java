https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one/
class Compute {
    
    public void rotate(int arr[], int n)
    {
         int i = 0, j = arr.length - 1;
       while(i != j)
       {
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
         i++;
       }
    }
}
