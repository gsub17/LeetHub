class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums1){
            set.add(i);
        }
        
        ArrayList<Integer> ans1 = new ArrayList<>();
        for(int j:nums2){
            if(set.contains(j)){
                ans1.add(j);
                set.remove(j);
            }
        }
        int[] ans2 = new int[ans1.size()];
        int count = 0;
        for(int i:ans1){
            ans2[count] = i;
            count++;
        }
        return ans2;
    }
}