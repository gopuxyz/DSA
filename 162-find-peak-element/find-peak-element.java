class Solution {
    public int findPeakElement(int[] nums) {
         int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // Peak lies to the left (including mid)
                high = mid;
            } else {
                // Peak lies to the right
                low = mid + 1;
            }
        }

        return low; // or high, both point to a peak
    }
        
 }
