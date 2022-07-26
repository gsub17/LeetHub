class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
                map.put(i , map.getOrDefault(i , 0)+1);
                set.add(i);
        }
        
        int count = 0;
        
        for(int i : set){
            int c = map.get(i);
            if(c >= 2){
                int quotient = c/2;
                count += quotient;
                map.put(i , map.get(i) - 2*quotient);
            }
        }
        
        int remains = 0;
        for(int i:set){
            remains+=map.get(i);
        }
        
        int[] ans = new int[2];
        ans[0] = count;
        ans[1] = remains;
        
        return ans;
        
    }
}