class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashSet<Integer> app = new HashSet<>();
        HashSet<Integer> sep = new HashSet<>();

        for(int k=0;k<nums.length;k++)
            {
                if(app.contains(nums[k]) &&  nums[k] !=nums[k-1])
                {
                    sep.add(nums[k]);
                }
                app.add(nums[k]);
            }
        return app.size() - sep.size();
    }
}
