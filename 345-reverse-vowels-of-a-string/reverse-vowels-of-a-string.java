class Solution {
    // Function to check if a character is a vowel
    public Boolean checkvowel(char ch) {
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
               ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    // Function to swap characters in a StringBuilder
    public String swapcharacter(String s, int i, int j) {
        StringBuilder sb = new StringBuilder(s);
        char temp = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, temp);
        return sb.toString();
    }

    // Function to reverse vowels in a string
    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (!checkvowel(s.charAt(i))) {
                i++;
            } else if (!checkvowel(s.charAt(j))) {
                j--;
            } else {
                s = swapcharacter(s, i, j);
                i++;
                j--;
            }
        }
        return s; 
    }
}
