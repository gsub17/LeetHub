class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] left_aux = new int[n];
        left_aux[0] = height[0];
        for(int i = 1 ; i < n ; i++){
            left_aux[i] = Math.max(left_aux[i-1] , height[i]);
        }
        
        int[] right_aux = new int[n];
        right_aux[n-1] = height[n-1];
         for(int i = n-2 ; i >= 0 ; i--){
            right_aux[i] = Math.max(right_aux[i+1] , height[i]);
        }
        
        int water = 0;
        for(int i = 0 ; i < n;i++){
            water+= (Math.min(left_aux[i],right_aux[i]) - height[i]);
        }
        return water;
    }
}