class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        
        while(numbers[i] + numbers[j] != target){
            if(numbers[i] + numbers[j] > target){
                j--;
            }else{
                i++;
            }
        }
        
        int[] ans = new int[2];
        ans[0] = i+1;
        ans[1] = j+1;
        return ans;
    }
}