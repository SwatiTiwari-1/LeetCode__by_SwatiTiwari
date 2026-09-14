import java.util.*;
class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer , ArrayList<Integer>> m = new HashMap<>();

        for(int i = 0;i < nums.length;i++)
        {
            if(!m.containsKey(nums[i]))
            {
                m.put(nums[i],new ArrayList<>());
            }
            m.get(nums[i]).add(i);
        }
        int count = 0;
        for(ArrayList<Integer> l:m.values())
            {
                if(l.size() == 3)
                {
                    int one = l.get(0);
                    int two = l.get(1);
                    int three = l.get(2);

                    if(two - one == three - two)
                    {
                        count++;
                    }
                }
            }
        return count;
    }
}
