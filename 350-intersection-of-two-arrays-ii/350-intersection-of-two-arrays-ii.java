class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums1.length ;i++){
            map.put(nums1[i] , map.getOrDefault(nums1[i] , 0) + 1);
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < nums2.length ;i++){
            if(map.containsKey(nums2[i])){
                if(map.get(nums2[i]) > 0){
                    ans.add(nums2[i]);
                    map.put(nums2[i] , map.getOrDefault(nums2[i] , 0)-1);
                }
            }
        }
        
        int[] ans2 = new int[ans.size()];
        int count = 0;
        for(int a:ans){
            ans2[count] = a;
            count++;
        }
        return ans2;
    }
}