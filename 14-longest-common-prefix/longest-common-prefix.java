
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return ""; // Edge case

        Arrays.sort(strs); // Sort the array

        char[] first = strs[0].toCharArray(); // 
        char[] last = strs[strs.length - 1].toCharArray(); 
        
        StringBuilder result = new StringBuilder(); 

        for (int i = 0; i < first.length && i < last.length; i++) { 
            if (first[i] != last[i]) {
                break; 
            }
            result.append(first[i]); // Append common character
        }
        
        return result.toString(); // Convert StringBuilder to String
    }
}
