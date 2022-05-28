class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int[] prev_smaller = new int[heights.length];
        Stack<Integer> s1 = new Stack<>();
        int ans = 0;
        
        for(int i = 0 ; i < heights.length ; i++){
            while(!s1.isEmpty() && heights[s1.peek()] >= heights[i]){
                s1.pop();
            }
            
            if(s1.isEmpty()){
                prev_smaller[i] = -1;
            }else{
                prev_smaller[i] = s1.peek();
            }
            
            s1.push(i);
            
        }
        
        int[] next_smaller = new int[heights.length];
        Stack<Integer> s2 = new Stack<>();
        
        for(int i = heights.length - 1 ; i >=0 ; i--){
            while(!s2.isEmpty() && heights[s2.peek()] >= heights[i]){
                s2.pop();
            }
            
            if(s2.isEmpty()){
                next_smaller[i] = heights.length;
            }else{
                next_smaller[i] = s2.peek();
            }
            s2.push(i);
        }
        
        for(int i = 0 ; i < heights.length ; i++){
            int temp = (next_smaller[i] - prev_smaller[i] - 1) * heights[i];
            ans = Math.max(ans , temp);
        }
        return ans;
        
    }
}