class Solution {
    public int fun(String s){
        int i = 0;                  //i is starting pointer
        int j = s.length()-1;      //j is the last pointer (length is n-1 if taken from 0)
        int cost = 0;
        while(i < j){
                // increment (to choose and replace index)
                int a1 = Math.abs((s.charAt(i)-'a')-(s.charAt(j)-'a'));      //rotate 
                int a2 = 26-a1;                             //increment
                cost+=Math.min(a1,a2);                  //comparing the cost 
                i++;
                j--;
        }
        return cost;
    }
    public int minOperations(String s) {
        int n=s.length();
        int m = Integer.MAX_VALUE;               
        for(int i = 0;i<n;i++){
            int cos = fun(s)+i;                   //calculating the cost of new string
            m = Math.min(m,cos);
            s+= s.charAt(0);
            s = s.substring(1);
            }
        return m;
    }
}
