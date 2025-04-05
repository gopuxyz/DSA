class Solution {
    public void swap(int i , int j , int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int firstMissingPositive(int[] arr) {
        int n = arr.length;
        int i = 0;
        while(i<n){
            int ele = arr[i]; // ele will be placed at ele - 1 idx 
            if(ele<=0||ele==i+1||ele>n||ele==arr[ele-1]) i++;
            else swap (i,ele-1, arr);
        }
        for(i = 0; i<n; i++){
            if(arr[i]!=i+1) return i+1;
        }
        return i+1;
    }
}