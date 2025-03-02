class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int count = 0;

        for (char ch : s.toCharArray()) {  
            if (ch == '(') {  
                if (count > 0) result.append(ch);  // Pehla '(' ignore karo
                count++;
            } else {  
                count--;
                if (count > 0) result.append(ch);  // Last ')' ignore karo
            }
        }
        return result.toString();
    }
}
