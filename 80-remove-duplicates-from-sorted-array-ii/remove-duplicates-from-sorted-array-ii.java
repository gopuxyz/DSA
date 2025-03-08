class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 0, fast = 0, count = 0;
        while(fast < nums.length){
            if(count < 2){
                nums[slow] = nums[fast];
                slow++;
                count++;
            }
            fast++;
            if(fast < nums.length && nums[fast] != nums[fast - 1]) count = 0;
        }
        return slow;
    }
}