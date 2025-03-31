class Solution {
    public int reversePairs(int[] nums) {
        if(nums.length == 0 || nums == null) return 0;
        return mergeSort(nums, 0, nums.length-1);
    }

    private int mergeSort(int[] nums, int left, int right){
        if(left >= right) return 0;

        int mid = left + (right - left) / 2;
        int count = mergeSort(nums, left, mid) + mergeSort(nums, mid+1, right);

        // Count valid pairs before merging
        count += countPairs(nums, left, mid, right);

        // Merge the two sorted halves
        merge(nums, left, mid, right);

        return count;
    }

    private int countPairs(int[] nums, int left, int mid, int right){
        int count = 0, j = mid + 1; // Pointer for right half because below for loop will start from left

        for(int i = left; i <= mid; i++){
            while(j <= right && nums[i] > 2L * nums[j]){
                j++;  // Move j until the condition is false
            }
            count += (j - (mid+1)); // Count pairs for current i
        }
        return count;
    }

    private void merge(int[] nums, int left, int mid, int right){
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while(i <= mid && j <= right){
            if(nums[i] <= nums[j]){
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        // Copy remaining left half and right
        while(i <= mid) temp[k++] = nums[i++];
        while(j <= right) temp[k++] = nums[j++];

        // Copy sorted temp array back to original
        System.arraycopy(temp, 0, nums, left, temp.length);
    }
}