class Solution {

    void fun(int start, int n, int k, List<Integer> output,
             List<List<Integer>> ans) {

        if (output.size() == k) {
            ans.add(new ArrayList<>(output));
            return;
        }

        for (int i = start; i <= n; i++) {

            List<Integer> op = new ArrayList<>(output);

            op.add(i);

            fun(i + 1, n, k, op, ans);
        }
    }

    public List<List<Integer>> combine(int n, int k) {

        List<Integer> output = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        fun(1, n, k, output, ans);

        return ans;
    }
}
