class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedsum = n*(n+1)/2; // sum of first natural number
        int actualsum = 0;
        for(int num : nums){
            actualsum = actualsum + num;
        }
        return expectedsum - actualsum; //misssing number
        
    }
}