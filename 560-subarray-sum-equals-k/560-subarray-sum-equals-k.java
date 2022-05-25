class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int count = 0;
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
            if(sum == k){
                count++;
            }
            if(map.containsKey(sum - k)){
                int x = map.getOrDefault(sum-k,0);
                count+=x;
            }
            map.put(sum , map.getOrDefault(sum , 0) + 1);
            
        }
        return count;
    }
}