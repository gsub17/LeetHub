class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums1){
            set.add(i);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i:nums2){
            if(set.contains(i)){
                ans.add(i);
                set.remove(i);
            }
        }
        int[] ans2 = new int[ans.size()];
        int count = 0;
        for(int i:ans){
            ans2[count] = i;
            count++;
        }
        return ans2;
    }
}