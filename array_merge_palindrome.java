public class array_merge_palindrome{
    public static void main(String[] args) {
        int arr[] = {1,7,9,1};
        System.out.println("the counting is"+ merge(arr));

    }
    static int merge(int[]arr){
        int ans = 0;
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            if(arr[start] == arr[end]){
                start++;
                end--;
            }
            else if(arr[start] > arr[end]){
                   arr[end] += arr[end-1];
                   end --;
                   ans++; 
            }
            else{
                arr[start] += arr[start+1];
                start++;
                ans++;
            }
        }
        return ans;
    }
}