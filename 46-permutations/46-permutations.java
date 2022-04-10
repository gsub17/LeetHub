class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        ans = permutation(nums , 0 , nums.length-1 , ans);
        return ans;
    }
    
    public List<List<Integer>> permutation(int[] nums , int left , int right , List<List<Integer>> ans){
        if(left == right){
            List<Integer> ans2 = new ArrayList<>();
            for(int i = 0 ; i < nums.length ; i++){
                ans2.add(nums[i]);
            }
            ans.add(ans2);
            return ans;
        }
        
        for(int i = left ; i <= right ; i++ ){
            int[] arr = swap(nums , left , i );
            permutation(arr , left+1 , right , ans);
            int[] ar2r = swap(nums , left , i );
        }
        return ans;
    }
    
    public int[] swap(int[] nums , int i , int j ){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return nums;
    }
}