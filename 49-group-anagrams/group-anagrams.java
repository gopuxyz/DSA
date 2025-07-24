class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for(String s : strs) {
            int[] count = new int[26];
            for(char c: s.toCharArray()) count[c - 'a']++;
            StringBuilder sb = new StringBuilder();
            for(int i: count)
            sb.append(i).append("#");
            String key = sb.toString();
            if(!res.containsKey(key)) res.put(key, new ArrayList<>());
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
    }
}