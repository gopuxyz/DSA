class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;
        int j = 0;
        
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue; // Skip duplicates
            }
            
            if ((nums[i] > nums[j] && nums[i] > nums[i + 1]) ||
                (nums[i] < nums[j] && nums[i] < nums[i + 1])) {
                count++;
            }
            
            j = i; // Update last significant index
        }
        
        return count;
    }
}