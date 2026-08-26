import java.util.*;

class Solution {

    void fun(int[] candidates, int index, int target,
             List<Integer> output, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(output));
            return;
        }

        for (int i = index; i < candidates.length; i++) {

            if (i > index && candidates[i] == candidates[i - 1])
                continue;

            if (candidates[i] > target)
                break;

            List<Integer> op = new ArrayList<>(output);
            op.add(candidates[i]);

            fun(candidates, i + 1, target - candidates[i], op, ans);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<Integer> output = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        fun(candidates, 0, target, output, ans);

        return ans;
    }
}
