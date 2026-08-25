class Solution {

    void fun(List<Integer> input, List<Integer> output, List<List<Integer>> ans) {

        if (input.size() == 0) {
            ans.add(new ArrayList<>(output));
            return;
        }

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < input.size(); i++) {

            if (set.contains(input.get(i)))
                continue;

            set.add(input.get(i));

            List<Integer> ip = new ArrayList<>(input);
            List<Integer> op = new ArrayList<>(output);

            op.add(ip.get(i));
            ip.remove(i);

            fun(ip, op, ans);
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {

        List<Integer> input = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        for (int num : nums) {
            input.add(num);
        }

        fun(input, output, ans);

        return ans;
    }
}
