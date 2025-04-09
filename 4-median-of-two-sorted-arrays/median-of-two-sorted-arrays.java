class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int m=arr1.length;
        int n=arr2.length;
        int size=m+n;
        int ans[]=new int[size];
        int i=0,j=0,k=0;
        // Correct merge logic like merge sort
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                ans[k++] = arr1[i++];
            } else {
                ans[k++] = arr2[j++];
            }
        }

        // Add remaining elements
        while (i < m) {
            ans[k++] = arr1[i++];
        }
        while (j < n) {
            ans[k++] = arr2[j++];
        }

        // Find median
        if(size%2!=0) return ans[size/2];
        else return (ans[size/2-1]+ans[size/2])/2.0;
    }
}