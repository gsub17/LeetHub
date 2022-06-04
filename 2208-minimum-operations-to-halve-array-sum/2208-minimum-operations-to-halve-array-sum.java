class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        double sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            pq.add((double)nums[i]);
            sum+=(double)nums[i];
        }
        
        double temp = sum/2;
        int count = 0;
        while(sum > temp){
            double x = pq.poll();
            pq.add(x/2);
            sum = sum - x/2;
            count++;
        }
        return count;
    }
}