class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums2.length];
        Stack<Integer> s = new Stack<>();
        
        for(int i = nums2.length - 1; i >= 0 ; i--){
            while(!s.isEmpty() && s.peek() <= nums2[i]){
                s.pop();
            }
            
            if(s.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = s.peek();
            }
            s.push(nums2[i]);
        }
      //  System.out.println(ans.toString());
        
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums2.length ; i++){
            map.put(nums2[i] , ans[i]);
        }
        
        int[] ans2 = new int[nums1.length];
        for(int i = 0 ; i < ans2.length ; i++){
            ans2[i] = map.get(nums1[i]);
        }
        return ans2;
    }
}