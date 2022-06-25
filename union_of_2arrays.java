// https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1#
class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        HashSet<Integer> map = new HashSet<Integer>();
        for(int i = 0; i<a.length;i++){
            map.add(a[i]);
        }
        for(int j = 0; j<b.length;j++){
            map.add(b[j]);
        }
        return map.size();
    }
}
