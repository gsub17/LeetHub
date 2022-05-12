class Solution {
  // static List<List<Integer>> ans3 = [];
    public List<List<Integer>> permuteUnique(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        ans = permute(nums , s , e , ans);

        HashSet<List<Integer>> set = new HashSet<>();
        for(int i = 0 ; i< ans.size() ;i++){
            set.add(ans.get(i));
        }
        
        List<List<Integer>> ans2 = new ArrayList<List<Integer>>();
        for(List<Integer> i:set){
            ans2.add(i) ;
        }
        return ans2;
    }
    
    public List<List<Integer>> permute(int[] nums , int left , int right , List<List<Integer>> ans){
        if(left == right){
            List<Integer> ans2 = new ArrayList<>();
            for(int i:nums){
                ans2.add(i);
            }
            ans.add(ans2);
            return ans;
        }
        
        for(int i = left ; i<= right ;i++ ){
            int[] swap1 = swap(nums , left , i);
            permute(swap1 , left+1,right,ans);
            int[] swap2 = swap(nums , left ,i);
        }
        return ans;
    }
    
    public int[] swap(int[] nums ,int i ,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return nums;
    }
}