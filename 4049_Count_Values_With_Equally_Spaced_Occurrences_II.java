import java.util.*;
class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer , ArrayList<Integer>> m = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            if(!m.containsKey(nums[i]))
            {
                m.put(nums[i], new ArrayList<>());
            }
            m.get(nums[i]).add(i);
        }
        int ans = 0;
        for(ArrayList<Integer> l:m.values())
            {
                if(l.size() < 3)
                continue;

                int dist = l.get(1) - l.get(0);
                boolean spec = true;

                for(int i = 2; i < l.size(); i++)
                {
                    if(l.get(i) - l.get(i - 1) != dist)
                    {
                        spec = false;
                        break;
                    }
                }
                if(spec)
                ans++;
            }
        return ans;
    }
}
