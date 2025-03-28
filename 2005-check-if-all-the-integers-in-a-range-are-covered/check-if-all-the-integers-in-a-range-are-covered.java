class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        boolean[] cov = new boolean[51]; 
        for (int[] range : ranges) {
            int start = range[0], end = range[1];
            for (int i = start; i <= end; i++) {
                cov[i] = true; 
            }
        }
        for (int i = left; i <= right; i++) {
            if (!cov[i]) {
                return false; 
            }
        }

        return true;
    }
}
