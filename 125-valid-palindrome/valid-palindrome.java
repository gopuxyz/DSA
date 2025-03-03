class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1; // Two pointers

        while (left < right) { 
            // Ignore non-alphanumeric characters from left
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++; // Move left pointer forward
            }

            // Ignore non-alphanumeric characters from right
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--; // Move right pointer backward
            }

            // Compare characters (ignoring case)
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false; // If mismatch, not a palindrome
            }

            // Move pointers
            left++;
            right--;
        }

        return true; // If loop completes, it's a palindrome
    }
}
