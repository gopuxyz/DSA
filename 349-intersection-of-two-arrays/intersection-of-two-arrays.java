class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();

        for (int num : nums1) {
            set1.add(num); // nums1 ke unique elements store karo
        }

        for (int num : nums2) {
            if (set1.contains(num)) { 
                resultSet.add(num); // Agar nums2 ka element nums1 me hai to add karo
            }
        }

        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num; // HashSet se array me convert karna
        }
        return result;
    }
        
    
}