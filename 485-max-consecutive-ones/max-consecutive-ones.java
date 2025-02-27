class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;   // Sabse bada consecutive 1s ka count store karega
        int currentCount = 0; // Ab tak ka lagataar 1s ka count store karega

        for (int num : nums) {
            if (num == 1) {
                currentCount++; // Agar 1 mila, to count badhao
                maxCount = Math.max(maxCount, currentCount); // Max update karo
            } else {
                currentCount = 0; // Agar 0 mila, to count reset kar do
            }
        }
        return maxCount; // Sabse bada consecutive 1s ka count return karo
    }
        
 }
