class Solution {
    public int subarraySum(int[] nums, int k) {
        int currsum = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0 ; i < nums.length ;i++){
            currsum += nums[i];
            if(currsum == k){
                count++;
            }
            
            if(map.containsKey(currsum - k)){
                count+= map.getOrDefault(currsum - k,0 );
            }
            
            map.put(currsum , map.getOrDefault(currsum , 0) +1);
        }
        return count;
    }
}