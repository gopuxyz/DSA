class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int dp[] = new int[n];
        
        // Fill dp with last row values (base cases)
        for (int j = 0; j < n; j++) {
            dp[j] = triangle.get(n - 1).get(j);
        }

        // Build the solution from second-last row to top
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                int curr = triangle.get(i).get(j);
                dp[j] = curr + Math.min(dp[j], dp[j + 1]);
            }
        }

        // dp[0] contains the result
        return dp[0];
    }
}