class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans1 = new ArrayList<List<Integer>>();
        p(nums , ans1 , 0 , nums.length-1);
        return ans1;
    }
    
    public void p(int[] nums , List<List<Integer>> ans1 , int s , int e){
        if(s == e){
            List<Integer> ans2 = new ArrayList<>();
            for(int i:nums){
                ans2.add(i);
            }
            ans1.add(ans2);
            return;
        }
        
        for(int i = s ; i <= e;i++){
            int[] n1 = swap(nums , i , s);
            p(n1 , ans1 , s+1 , e);
            int[] n2 = swap(nums , i , s);
        }
        return;
    }
    
    public int[] swap(int[] nums , int i , int j){
        int x = nums[i];
        nums[i] = nums[j];
        nums[j] = x;
        return nums;
    }
}