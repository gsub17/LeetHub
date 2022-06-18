class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans1 = new ArrayList<List<Integer>>();
        ans1 = p(nums , 0 , nums.length-1 , ans1);
        return ans1;
    }
    
    public List<List<Integer>> p(int[] nums , int s , int e , List<List<Integer>> ans1){
        if(s == e){
            List<Integer> ans2 = new ArrayList<>();
            for(int i : nums){
                ans2.add(i);
            }
            ans1.add(ans2);
            return ans1;
        }
        
        for(int i = s ; i<= e;i++){
            int[] s1 = swap(nums , s , i);
            p(s1 , s+1 , e , ans1);
            int[] s2 = swap(nums , s , i);
        }
        return ans1;
    }
    
    public int[] swap(int[] nums , int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
        return nums;
    }
    
    
}