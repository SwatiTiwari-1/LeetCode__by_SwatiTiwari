class Solution {
    int[] dp = new int[101];
    int fun(int i, int[] arr)
    {
        if(i >= arr.length)
        {
            return 0;
        }
        if(dp[i] != -1) 
        {
            return dp[i];
        }
        int c1 = arr[i]+fun(i+2,arr);
        int c2 = fun(i+1,arr);
        int ans = Math.max(c1,c2);
        dp[i] = ans;

        return ans;
    }
    public int rob(int[] arr) {
        for(int i = 0;i < 101;i++)
        {
            dp[i] = -1;
        }
        return fun(0,arr);
    }
}
