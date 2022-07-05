https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem3825/
class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        long mindiff = Integer.MAX_VALUE;
        for(int i = 0 ; i+m-1<n ;i++){
            long diff = a.get(i + m -1) - a.get(i);
            if(diff < mindiff){
                mindiff = diff;
            }
        }
        return mindiff;
    }
}
