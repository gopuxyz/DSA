// class Solution {
//     public int compress(char[] chars) {
//         StringBuilder sb = new StringBuilder();
//         int count = 1;
//         for(int i=1; i<chars.length; i++){
//             if(i < chars.length && chars[i] == chars[i-1]){
//                 count++;
//             } else {
//                 sb.append(chars[i]);
//                 if(count > 1){
//                     sb.append(count);
//                     count = 1;
//                 }
//             }
//         }

//         return sb.length();
//     }
// }


class Solution {
    public int compress(char[] chars) {
        int i=0;
        int j=0;
        int k=0;
        int n=chars.length;
        while(j<n){
            if( j==n-1 || chars[j]!=chars[j+1]){
                chars[k++]=chars[i];
                int cnt=j-i+1;
                if(cnt>1){
               char[] s = Integer.toString(cnt).toCharArray();
               for(char c :s){
                chars[k++]=c;
               }
                }
                i=j+1;
            }
                j++;  
            
        }
        return k;
    }
}