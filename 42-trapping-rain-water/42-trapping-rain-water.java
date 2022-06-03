class Solution {
    public int trap(int[] height) {
        int[] left_aux = new int[height.length];
        left_aux[0] = height[0];
        
        for(int i = 1 ; i < height.length ; i++){
            left_aux[i] = Math.max(height[i] , left_aux[i-1]);
        }
        
        int[] right_aux = new int[height.length];
        right_aux[height.length-1] = height[height.length-1];
        
        for(int i = height.length - 2 ; i >= 0 ; i--){
            right_aux[i] = Math.max(height[i] , right_aux[i+1]);
        }
        
        int ans = 0;
        for(int i = 0 ; i < height.length ; i++){
            ans += Math.min(left_aux[i] , right_aux[i]) - height[i];
        }
        
        return ans;
        
    }
}