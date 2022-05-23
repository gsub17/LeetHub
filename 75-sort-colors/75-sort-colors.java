class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i , map.getOrDefault(i , 0) + 1);
        }
        
        int i = 0;
        
        if(map.containsKey(0)){
            int x = map.get(0);
            while(x > 0){
                nums[i] = 0;
                i++;
                x--;
            }
        }
        
            if(map.containsKey(1)){
            int x = map.get(1);
            while(x > 0){
                nums[i] = 1;
                i++;
                x--;
            }
        }
        
                if(map.containsKey(2)){
            int x = map.get(2);
            while(x > 0){
                nums[i] = 2;
                i++;
                x--;
            }
        }
        
        
        
        
    }
}