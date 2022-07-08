class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Stack<Integer> s = new Stack<>();
        int[] next_greater = new int[nums2.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = nums2.length - 1 ; i >= 0 ; i--){
            
            while(!s.isEmpty() && s.peek() < nums2[i]){
                s.pop();
            }
            
            if(s.isEmpty()){
                map.put(nums2[i] , -1);
            }else{
                map.put(nums2[i] , s.peek());
            }
            
            s.push(nums2[i]);
        }
        
        int[] ans = new int[nums1.length];
        int count = 0;
        for(int i: nums1){
            ans[count] = map.get(i);
            count++;
        }
        return ans;
        
    }
}