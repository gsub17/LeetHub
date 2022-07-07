class Solution {
    public int lengthOfLongestSubstring(String s) {
         int i = 0 ;
        int j = 0;
        HashSet<Character> set = new HashSet<>();
        int ans = 0;
        while(i < s.length()){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                ans = Math.max(set.size() , ans);
                i++;
            }else{
                
                set.remove(s.charAt(j));
                j++;
            }
        }
        return ans;
    }
}