class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        ans = permutation(nums , 0 , nums.length-1,ans);
      //  Collections.sort(ans);
        HashSet<List<Integer>> set = new HashSet<>();
        for(List<Integer> a:ans){
            set.add(a);
        }
        
        List<List<Integer>> ans2 = new ArrayList<List<Integer>>();
        for(List<Integer> b:set){
            ans2.add(b);
        }
        return ans2;
        
        
    }
    
    public List<List<Integer>> permutation(int[] nums , int s , int e , List<List<Integer>> ans){
        if(s == e){
            List<Integer> ans2 = new ArrayList<>();
            for(int a:nums){
                ans2.add(a);
            }
            ans.add(ans2);
            return ans;
        }
        
        for(int i = 0 ; i < nums.length ; i++){
            int[] nums1 = swap(nums , s , i);
            permutation(nums , s+1 , e , ans);
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