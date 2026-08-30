class Solution {
    static final long mod = 1000000007L;
    public int sumDecoded(long[] nums) {
        long ans = 0;

        for(long n : nums)
            {
                int wid =(int)(n%10);
                long f = n/10;

                String s = String.valueOf(f);
                long x = Long.parseLong(s.substring(0,wid));
                long y = Long.parseLong(s.substring(wid));

                long d = power(x,y);
                ans = (ans+d)%(mod);
            }
        return (int)ans;
    }
    private long power(long b,long exp)
    {
        long r = 1;

        while(exp > 0)
            {
                if(exp%2==1)
                {
                    r = (r*b)%mod;
                }
                b = (b*b)%mod;
                exp /= 2;
            }
        return r;
    }
}
