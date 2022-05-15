class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        ans = permute(nums , 0 , nums.length-1 , ans);
        return ans;
    }
    
    public List<List<Integer>> permute(int[] nums , int s,int e,List<List<Integer>> ans){
        if(s == e){
            List<Integer> ans2 = new ArrayList<>();
            for(int i:nums){
                ans2.add(i);
            }
            ans.add(ans2);
            return ans;
        }
        
        for(int i=s;i<=e;i++ ){
            int[] nums1 = swap(nums , s , i);
            permute(nums1 , s+1,e,ans);
            int[] nums2 = swap(nums , s , i);
        }
        return ans;
    }
    
    public int[] swap(int[] nums , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return nums;
    }
}