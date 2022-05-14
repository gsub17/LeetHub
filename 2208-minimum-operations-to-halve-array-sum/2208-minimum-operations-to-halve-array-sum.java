class Solution {
    public int halveArray(int[] nums) {
        double original_sum = 0;
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:nums){
            original_sum += i;
            pq.add((double)i);
        }
        double half_sum = original_sum/2;
        
        double new_sum = original_sum;
        int count = 0;
        while(new_sum > half_sum){
            double x = pq.peek()/2;
            pq.poll();
            pq.add(x);
            new_sum-=x;
            count++;
        }
        return count;
    }
}