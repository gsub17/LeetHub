class Solution {
    public int subarraySum(int[] nums, int k) {
        //below comment section is naive approach
        // int count = 0;
        // for(int i = 0 ; i < nums.length - 1 ;i++){
        //     int sum = nums[i];
        //     if(sum == k){
        //         count++;
        //     }
        //     for(int j = i+1 ; j < nums.length ; j++){
        //         sum+= nums[j];
        //         if(sum == k){
        //             count++;
        //         }
        //     }
        // }
        // if(nums[nums.length-1] == k){
        //     count++;
        // }
        // return count;
        
       //hashmap
        int ans = 0;
        int sum = 0;
        HashMap <Integer,Integer> map = new HashMap<>();
        map.put(0,1);   // imp
        for(int i = 0; i<nums.length;i++){
            sum+=nums[i];
            ans = ans + map.getOrDefault(sum-k,0);
            map.put(sum , map.getOrDefault(sum,0)+1); // imp
        }
        return ans;
    }
}