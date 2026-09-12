class Solution {
    int dp[][] = new int[501][501];

    int fun(int prev,int i,int nums[],int m,int k)
    {
        if(i >= nums.length)   
        return 0;

        if(dp[i][prev] != -1)
        return dp[i][prev];

        int ans = 0;

        m = Math.max(m,nums[i]);
        int len = i-prev+1;

        if(len == k)
        {
            int take = (m * len) + fun(i+1, i+1, nums, 0, k);
            ans = Math.max(ans,take);
        } 
        else
        {
            int take = (m * len) + fun(i+1, i+1, nums, 0, k);
            int not_take = fun(prev, i+1, nums, m, k);
            ans = Math.max(ans,take);
            ans = Math.max(ans,not_take);
        }
        return dp[i][prev] = ans;
    }
    public int maxSumAfterPartitioning(int[] arr, int k) {
        for(int i = 0;i < 501; i++)                 //initializing every row
        {
            java.util.Arrays.fill(dp[i], -1);        //it is used for every row
        }
        return fun(0, 0, arr, 0, k);
    }
}
