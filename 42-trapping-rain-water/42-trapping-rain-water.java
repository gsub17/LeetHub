class Solution {
    public int trap(int[] height) {
        
        // left max aux array
        int[] left_max_aux_array = new int[height.length];
        left_max_aux_array[0] = height[0];
        for(int i = 1 ; i < height.length ;i++){
            if(left_max_aux_array[i-1] > height[i]){
                left_max_aux_array[i] = left_max_aux_array[i-1];
            }else{
                left_max_aux_array[i] = height[i];
            }
        }
        // right max aux array
        int[] right_max = new int[height.length];
        right_max[height.length - 1] = height[height.length -1];
        for(int i = height.length - 2 ; i >= 0 ; i--){
            if(right_max[i+1] > height[i]){
                right_max[i] = right_max[i+1];
            }else{
                right_max[i] = height[i];
            }
        }
        
        int total_water = 0;
        for(int i = 0 ; i < height.length ; i++){
            int water = Math.min(left_max_aux_array[i] , right_max[i]) - height[i];
            total_water += water;
        }
        
        return total_water;
    }
}