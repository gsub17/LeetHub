class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i:nums1){
            map.put(i , map.getOrDefault(i,0)+1);
        }
        
        for(int j:nums2){
            if(map.containsKey(j)){
                set.add(j);
            }
        }
        int[] ans = new int[set.size()];
        int o = 0;
        for(int p:set){
            ans[o] = p;
            o++;
        }
        return ans;
    }
}