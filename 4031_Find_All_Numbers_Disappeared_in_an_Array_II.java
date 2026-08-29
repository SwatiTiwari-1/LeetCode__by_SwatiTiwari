import java.util.*;

class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = lower; i <= upper; ) {

            if (set.contains(i)) {
                i++;
                continue;
            }

            int start = i;

            for (; i <= upper && !set.contains(i); i++) {
            }

            int end = i - 1;

            ans.add(Arrays.asList(start, end));
        }

        return ans;
    }
}
