class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        char[] arr = s.toCharArray();
        int max = 0;
        int i = 0;
        int j = 0;
        
        while(i < s.length()){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                max = Math.max(max , set.size());
                i++;
            }else{
                set.remove(arr[j]);
                j++;
            }
        }
        return max;
    }
}