class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int a:nums1){
            set.add(a);
        }
        int count = 0;
        for(int b:nums2){
            if(set.contains(b)){
                count++;
                set2.add(b);
                set.remove(b);
            }
        }
        int[] ans = new int[count];
        int i = 0;
        for(int c:set2){
            ans[i] = c;
            i++;
        }
        return ans;
    }
}