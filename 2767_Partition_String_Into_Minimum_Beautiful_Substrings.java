class Solution {

    int[] dp;

    public int minimumBeautifulSubstrings(String s) {

        int n = s.length();

        dp = new int[n];

        java.util.Arrays.fill(dp, -1);

        int ans = fun(0, s);

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    int fun(int i, String s) {

        if (i == s.length())
            return 0;

        if (s.charAt(i) == '0')
            return Integer.MAX_VALUE;

        if (dp[i] != -1)
            return dp[i];

        int ans = Integer.MAX_VALUE;
        int num = 0;

        for (int j = i; j < s.length(); j++) {

            num = num * 2 + (s.charAt(j) - '0');

            if (isPowerOf5(num)) {

                int next = fun(j + 1, s);

                if (next != Integer.MAX_VALUE) {
                    ans = Math.min(ans, 1 + next);
                }
            }
        }

        return dp[i] = ans;
    }

    boolean isPowerOf5(int num) {

        while (num % 5 == 0) {
            num = num / 5;
        }

        return num == 1;
    }
}
