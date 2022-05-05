class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int[] aux = new int[n];
        aux[n-1] = nums[n-1];
        for(int i = n-2; i >= 0 ;i--){
            aux[i] = Math.max(aux[i+1],nums[i]);
        }
        int max1 = 0;
        for(int i = 0 ; i < n;i++){
            int temp = aux[i] - nums[i];
            max1 = Math.max(max1 , temp);
        }
        if(max1 == 0){
            return -1;
        }
        return max1;
    }
}