https://practice.geeksforgeeks.org/problems/find-pair-given-difference1559/1
//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int l = sc.nextInt();
            int n = sc.nextInt();
            
            int arr[] =  new int[l];
            
            for(int i = 0;i<l;i++)
                arr[i] = sc.nextInt();
            
            Solution ob = new Solution();
                
            if(ob.findPair(arr, l, n)==true)
                System.out.println(1);
                
            else
                System.out.println(-1);    
                
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public boolean findPair(int arr[], int size, int n)
    {
        //code here.
        Arrays.sort(arr);
        int i = 0;
        int  j =1;
        while(i<size && j<size){
            if( i != j && (arr[j] - arr[i] == n)){
                return true;
            }
            else if(arr[j] - arr[i] < n){
                j++;
            }
            else{
                i++;
            }
        }
        return false;
    }
}
