class Solution {
    public int halveArray(int[] nums) {
        double sum = 0;
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ;i < nums.length ; i++){
            sum+=nums[i];
            pq.add((double)nums[i]);
        }
        double temp = sum;
        sum = sum/2;
        int count = 0;
        
        while(temp > sum){
           double x = pq.poll();
           pq.add(x/2);
            temp-=x/2;
            count++;
        }
        return count;
    }
}