class Solution {
    public boolean ispossible(int maxq,int n , int[]arr){
        int stores = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%maxq==0) stores += arr[i]/maxq;
            else stores += arr[i]/maxq + 1;
        }
        if (stores>n) return false;
         return true;
    }
    public int minimizedMaximum(int n, int[] arr) {
        int m = arr.length, mx = Integer.MIN_VALUE;
        for(int i = 0; i<m; i++){
            mx = Math.max(mx,arr[i]);
        }
        int lo = 1 , hi = mx;
        int ans = 0;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(ispossible(mid,n,arr)){
                ans = mid;
                hi = mid - 1;
            }
            else lo = mid + 1;
        }
        return ans;

    }
}