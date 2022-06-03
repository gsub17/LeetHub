class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        
        
        for(int a:nums1){
            set.add(a);
        }
        ArrayList<Integer> ans2 = new ArrayList<>();
        for(int b:nums2){
            if(set.contains(b)){
                ans2.add(b);
                set.remove(b);
            }
        }
        
        int[] ans = new int[ans2.size()];
        int i = 0;
        for(int a:ans2){
            ans[i] = a;
            i++;
        }
        
        
        
        return ans;
    }
}