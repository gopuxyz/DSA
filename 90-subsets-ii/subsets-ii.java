class Solution {
     public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        solve(nums, 0, res, new ArrayList<>());
        return res;
    }
    public void solve(int[] nums, int idx, List<List<Integer>>res, List<Integer> temp){
        res.add(new ArrayList<>(temp));
        for(int i=idx; i<nums.length;i++){
            if(i != idx && nums[i]==nums[i-1])continue;
            temp.add(nums[i]);
            solve(nums, i+1, res, temp);
            temp.remove(temp.size()-1);
        }
    }
}