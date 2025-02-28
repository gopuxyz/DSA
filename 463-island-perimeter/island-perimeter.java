class Solution {
    public int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int perimeter = 0;

        // Grid ko traverse karna hai
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Sirf land (1) ke liye count karna hai
                if (grid[i][j] == 1) {
                    perimeter += 4; // Pehle assume karo ki 4 sides pani se touch ho rahi hain

                    // Agar upar ek aur land (1) hai, toh ek side common ho jayegi
                    if (i > 0 && grid[i - 1][j] == 1) {
                        perimeter -= 2; // Ek common side dono se minus hogi
                    }

                    // Agar left me ek aur land (1) hai, toh ek side common ho jayegi
                    if (j > 0 && grid[i][j - 1] == 1) {
                        perimeter -= 2; // Ek common side dono se minus hogi
                    }
                }
            }
        }

        return perimeter;
    }
}
