class Solution {

    void fun(int[] candidates, int index, int target,
             List<Integer> output, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(output));
            return;
        }

        if (index == candidates.length || target < 0)
            return;

       
        List<Integer> op1 = new ArrayList<>(output);
        op1.add(candidates[index]);

        fun(candidates, index, target - candidates[index], op1, ans);

       
        fun(candidates, index + 1, target, output, ans);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<Integer> output = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        fun(candidates, 0, target, output, ans);

        return ans;
    }
}
