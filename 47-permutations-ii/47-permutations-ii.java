class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans1 = new ArrayList<List<Integer>>();
        permute(nums , ans1 , 0 , nums.length - 1);
        HashSet<List<Integer>> set = new HashSet<>();
        for(List<Integer> i:ans1){
            set.add(i);
        }
        
        ans1 =  new ArrayList<List<Integer>>();;
        for(List<Integer> i:set){
            ans1.add(i);
        }
        return ans1;
    }
    
    public void permute(int[] nums , List<List<Integer>> ans1 , int s , int e){
        if(s == e){
            List<Integer> ans2 = new ArrayList<>();
            for(int i:nums){
                ans2.add(i);
            }
            ans1.add(ans2);
            return;
        }
        
        for(int i = s ; i <= e;i++){
            int[] nums1 = swap(nums , s , i);
            permute(nums1 , ans1 , s + 1 , e);
            int[] nums2 = swap(nums , s , i);
        }
        return;
    }
    
    public int[] swap(int[] nums , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return nums;
    }
}