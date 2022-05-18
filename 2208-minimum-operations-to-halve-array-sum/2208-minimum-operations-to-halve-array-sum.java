class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        double sum = 0;
        for(int i = 0 ; i < nums.length ;i++){
            sum += nums[i];
            double y = nums[i];
            pq.add(y);
        }
        
        double new_sum = sum/2;
        int count = 0;
        
        while(sum > new_sum){
            double x = pq.poll();
            sum = sum -  x/2;
            pq.add(x/2);
            count++;
        }
        return count;
    }
}