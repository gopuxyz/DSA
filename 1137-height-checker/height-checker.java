class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected); // Sorted version of heights

        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) { // Count mismatches
                count++;
            }
        }
        return count;
    }
}