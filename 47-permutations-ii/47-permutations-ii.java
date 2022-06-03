class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans1 = new ArrayList<List<Integer>>();
        
        ans1 = permute(nums , 0 , nums.length-1 ,ans1);
        HashSet<List<Integer>> set = new HashSet<>();
        
        for(List<Integer> a:ans1){
            set.add(a);
        }
        
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(List<Integer> a:set){
            ans.add(a);
        }
        
        return ans;
    }
    
    public List<List<Integer>> permute(int[] nums , int s , int e , List<List<Integer>> ans1){
        if(s == e){
            List<Integer> temp = new ArrayList<>();
            for(int a:nums){
            temp.add(a);
            }
            ans1.add(temp);
        }
        
        for(int i = s ; i <= e ; i++){
            int[] nums1 = swap(nums , s , i);
            permute(nums1 , s+1 , e , ans1);
            int[] nums2 = swap(nums , s , i);
        }
        return ans1;
    }
    
    public int[] swap(int[] nums , int s , int i){
        int temp = nums[s];
        nums[s] = nums[i];
        nums[i] = temp;
        return nums;
    }
}