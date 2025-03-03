class Solution {
    public int strStr(String haystack, String needle) {
        int l = (haystack.length()- needle.length());
        for(int i = 0; i<=l; i++){
            String x = haystack.substring(i,i+needle.length());
            if(x.equals(needle)){
                return i;
            }
        }
        return -1;
        
    }
}