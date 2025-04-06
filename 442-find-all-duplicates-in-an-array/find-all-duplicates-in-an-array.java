

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) {
                result.add(Math.abs(nums[i])); // Duplicate found
            } else {
                nums[index] = -nums[index]; // Mark as visited
            }
        }

        return result;
    }
}
