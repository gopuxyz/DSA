class Solution {
    public void moveZeroes(int[] arr) {
        int index = 0; 
        int n = arr.length;
        for(int i = 0; i<arr.length; i++){
           if(arr[i] != 0){
            arr[index] = arr[i];
            index++;
           }
        }
        while(index<n){
            arr[index] = 0;
           index++;
        }
        
    }
}